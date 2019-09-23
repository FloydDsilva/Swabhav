function validate() {
    var rollNo = document.getElementById("rollNo")
    var name = document.getElementById("name")
    var age = document.getElementById("age")
    var email = document.getElementById("email")
    var date = document.getElementById("date")

    var rollReq = document.getElementById('rollReq')
    var nameReq = document.getElementById('nameReq')
    var ageReq = document.getElementById('ageReq')
    var emailReq = document.getElementById('emailReq')
    var dateReq = document.getElementById('dateReq')

    rollReq.innerHTML = ""
    nameReq.innerHTML = ""
    ageReq.innerHTML = ""
    emailReq.innerHTML = ""
    dateReq.innerHTML = ""
    var valid = true
    if (!rollNo.value) {
        rollReq.innerHTML = " *"
        rollReq.style.color = "red"
        console.log("RollNo:" + rollNo.value.length)
        valid = false
    }
    if (!name.value) {
        nameReq.innerHTML = " *"
        nameReq.style.color = "red"
        console.log("Name:" + name.value.length)
        valid = false
    } 
    if (!age.value) {
        ageReq.innerHTML = " *"
        ageReq.style.color = "red"
        console.log("Age:" + age.value.length)
        valid = false
    }
    if (!email.value) {
        emailReq.innerHTML = " *"
        emailReq.style.color = "red"
        console.log("Email:" + email.value.length)
        valid = false
    }
    if (!date.value) {
        dateReq.innerHTML = " *"
        dateReq.style.color = "red"
        console.log("date:" + date.value.length)
        valid = false
    }
    return valid
}