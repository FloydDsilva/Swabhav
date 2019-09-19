function displayStudentTable() {
    var ref = $(".refreshRow")
    if (ref) {
        console.log("refreshing!")
        ref.remove()
    }
    console.log("In Display")
    var loadingImage = document.getElementById('loadingImage')
    loadingImage.src = "loading.gif"
    //$("#addBtn").attr("disabled", true)
    $.ajax({
        type: "GET",
        /* url: "students.json", */
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",
        dataType: "json",
        success: function (data) {
            setTimeout(hideImage, 1000)
            console.log(data)
            var students = data
            $("#countText").html("<h4>Found <span class='badge'>" + students.length + "</span> Students</h4>")
            /* console.log()
            console.log("Students:")
            console.log(students) */
            students.forEach(student => {
                console.log("TR" + student.id)
                $('#studentTable').append("<tr class='refreshRow' id='TR" + student.id + "'><td>" + student.id + "</td><td>" + student.rollNo + "</td> <td>" + student.name + "</td> <td >" + student.age + "</td> <td >" + student.email + "</td> <td>" + student.date + "</td> <td>" + showGender(student.isMale) + "</td> <td><button id='edit" + student.id + "'>Edit</button> </td><td><button class='glyphicon glyphicon-remove deleteBtn' id='" + student.id +
                    "'/></td> </tr>")
                /* console.log($("#TR" + student.id)) */
                $("#edit" + student.id).on('click', function () {
                    
                    updateStudentForm(student)
                })
            });
            $("#addBtn").attr("disabled", false)
        },
        error: function () {
            alert("json not found");
        }
    })

}
displayStudentTable()
$('#studentTable').on('click', 'button.deleteBtn', function () {
    deleteStudent(this.id, displayStudentTable)
});

function hideImage() {
    loadingImage.src = ""
}

function showGender(isMale) {
    if (isMale) {
        return "Male"
    }
    return "Female"
}

function updateStudentForm(student) {
    
    $("#rollNo").val(student.rollNo)
    $("#name").val(student.name)
    $("#age").val(student.age)
    $("#email").val(student.email)
    $("#date").val(student.date)
    if (student.isMale) {
        $("#rbMale").prop("checked", true)
    } else {
        $("#rbFemale").prop("checked", true)
    }
}
function clearForm () {
    $(".form-control").val("")
}