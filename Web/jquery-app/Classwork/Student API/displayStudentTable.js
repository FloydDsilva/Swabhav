;(function () {
   $.ajax({
       type: "GET",
       /* url: "students.json", */
       url: "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",
       dataType: "json",
       success: function (data) {
           console.log(data)
           var students = data
           console.log()
           console.log("Students:")
           console.log(students)
           students.forEach(student => {
               console.log(student.name)
               $('#studentTable').append("<tr id='TR"+student.id+"'><td>" + student.id + "</td><td>" + student.rollNo + "</td> <td>" + student.name + "</td> <td >" + student.age + "</td> <td >" + student.email + "</td> <td>" + student.date + "</td> <td>" + student.isMale + "</td> <td><button class='glyphicon glyphicon-remove' onclick='removeStudent(TR"+student.id+")' /> </tr>")
                console.log($("#TR"+student.id))
            });
       },
       error: function () {
           alert("json not found");
       }
   })
})()