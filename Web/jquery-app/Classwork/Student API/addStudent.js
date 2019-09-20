var student1 = {
    "rollNo": 200,
    "name": "ABC",
    "age": 11,
    "email": "abc@gmail.com",
    "date": "2005-09-21",
    "isMale": true
}
function Student(rollNo,name,age,email,date,isMale){
    this.rollNo=rollNo
    this.name=name
    this.age=age
    this.email=email
    this.date=date
    this.isMale=isMale
}

function makeStudent(){
    var rollNo=$("#rollNo").val()
    var name=$("#name").val()
    var age = $("#age").val()
    var email=$("#email").val()
    var date = $("#date").val()
    var isMale = $("#isMale").val()
    
    return new Student(rollNo,name,age,email,date,isMale)
}

function addStudent (displayStudentTable) {
    $("#addBtn").attr("disabled", true)
    var student=makeStudent()
    console.log("Student:",student)
    $.ajax({
        type: "POST",
        url: "students.json", 
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",
        data:student,
        success: function (data) {
            console.log("Added Student")
            alert("Created Student:"+data)
            $(".form-control").val("")
            displayStudentTable()
        },
        error: function () {
            alert("json not found");
        }
    })
    
}

function updateStudent(studentId, displayStudentTable) {
    //$("#addBtn").attr("disabled", true)
    var student = makeStudent()
    console.log("UpdatedStudent:", studentId)
    $.ajax({
        type: "PUT",
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/"+studentId,
        data: student,
        success: function (data) {
            console.log("Updated Student")
            alert("Updated Student:" + data)
            $(".form-control").val("")
            removeBtns()
            displayStudentTable()
        },
        error: function () {
            alert("json not found");
        }
    })

}
function removeBtns () {
    $("#updateBtn").remove()
    $("#cancelBtn").remove()
}
function cancelEdit () {
    $(".editbtns").attr("disabled",false)
    clearForm()
    removeBtns()
    console.log("Update Canceled")
}