function deleteStudent(studentId,displayStudents) {
    console.log("Deleted:", studentId)

    $.ajax({
        type: "DELETE",
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/"+studentId,
        success: function (data) {
            console.log("Deleted Student")
            console.log(studentId)
            displayStudents()
        },
        error: function () {
            alert("json not found");
        }
    })
    
}