var tr = 0
var loadingImage = document.getElementById('loadingImage')
function loadSpinner () {
    loadingImage.src = "loading.gif"
}
function displayStudentTable() {
    var ref = $(".refreshRow")
    if (ref) {
        console.log("refreshing!")
        ref.remove()
    }
    console.log("In Display")
      
    //$("#addBtn").attr("disabled", true)
    $.ajax({
        type: "GET",
        /* url: "students.json", */
        url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",
        dataType: "json",
        success: function (data) {
            hideImage()
            $("#addBtn").attr("disabled",false)
            console.log(data)
            var students = data
            $("#countText").html("<h4>Found <span class='badge'>" + students.length + "</span> Students</h4>")
            /* console.log()
            console.log("Students:")
            console.log(students) */
            students.forEach(student => {
                console.log("TR" + student.id)
                $('#studentTable').append("<tr class='refreshRow' id='TR" + student.id + "'><td>" + student.id + "</td><td>" + student.rollNo + "</td> <td>" + student.name + "</td> <td >" + student.age + "</td> <td >" + student.email + "</td> <td>" + student.date + "</td> <td>" + showGender(student.isMale) + "</td> <td><button class='editBtns' id='edit" + student.id + "'>Edit</button> </td><td><button class='glyphicon glyphicon-remove deleteBtn' id='" + student.id +
                    "'/></td> </tr>")
                /* console.log($("#TR" + student.id)) */
                $("#edit" + student.id).on('click', function () {
                    $(".editBtns").attr("disabled", true)
                    tr = $(this).parents('tr')
                    tr.addClass("selectedRow")
                    //console.log(tr)
                    /* tr.addClass('selected') */
                    updateStudentForm(student)
                    //updateStudent(student, displayStudentTable)
                })
            });
            $("#addBtn").attr("disabled", false)
        },
        error: function () {
            alert("json not found");
        }
    })

}
loadSpinner()
setTimeout(displayStudentTable,2000)

$('#studentTable').on('click', 'button.deleteBtn', function () {
    var deleteConf = confirm("Do you want to delete?")
    if (deleteConf) {
        deleteStudent(this.id, displayStudentTable)
    }
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
    $("#buttonArea").append("<button id='updateBtn' type='button' class='btn btn-primary'> Update</button>")
    $("#buttonArea").append("<button id='cancelBtn' type='button' class='btn btn-danger'> Cancel</button>")
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
    var updateBtn = $("#updateBtn")
    if (updateBtn) {
        updateBtn.on('click', function () {
            console.log(student.id)
            updateStudent(student.id, displayStudentTable)

        })
    }
    var cancelBtn = $("#cancelBtn")
    if (cancelBtn) {
        cancelBtn.on('click', function () {
            console.log("Inside", tr)
            cancelEdit()
        })
    }
}

function clearForm() {
    $(".editBtns").attr("disabled", false)
    tr.removeClass("selectedRow")
    $(".form-control").val("")
    $("#rbMale").prop("checked", true)
}