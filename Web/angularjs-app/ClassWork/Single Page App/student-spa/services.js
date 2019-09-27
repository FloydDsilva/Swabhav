angular.module('student.module')
    .factory('studentFactory', ['$http', '$q', function ($http, $q) {
            var factory = {}
            factory.jobs = ['Programmer', 'Analyst', 'Manager']

            function Student(rollNo, name, age, email, date, isMale) {
                this.rollNo = rollNo
                this.name = name
                this.age = age
                this.email = email
                let formatted_date = date.getFullYear() + "-" + ("0" + (date.getMonth() + 1)).slice(-2) + "-" + ("0" + date.getDate()).slice(-2)
                this.date = formatted_date
                this.isMale = isMale
            }

            factory.getStudents = function () {
                return $http.get("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students")
            }
            factory.addStudent = function (student) {
                return $http.post("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students", JSON.stringify(student))
            }
            factory.updateStudent = function (student) {
                return $http.put("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/" + student.id, JSON.stringify(student))
            }
            factory.deleteStudent = function (studentId) {
                console.log(studentId)
                return $http.delete("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/" + studentId)
            }
            factory.editStudent = (studentId) => {
                return $http.get("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/" + studentId)   
            }
        /*
                    factory.updateEmployee=(employee)=>{
                        for(let i=0;i<factory.employees.length;i++){
                            if(factory.employees[i].id==employee.id){
                                factory.employees.splice(i,1,employee)
                            }
                        }
                        console.log(factory.employees)
                    }
                    factory.deleteEmployee=(employeeId)=>{
                        factory.employees=factory.employees.filter(e=>e.id!=employeeId)
                        alert("Deleted:"+employeeId)
                        console.log("After Deleting",factory.employees)
                    } */
        return factory
    }]);

angular.module('student.module')
    .factory('authService', function () {
        var auth = {}
        auth.admin = {
            username: "admin",
            password: "admin"
        }
        auth.isLogged = false
        auth.loggedUser = localStorage.getItem("studentLogged")
        auth.login = function (username, password) {
            if (username == auth.admin.username && password == auth.admin.password) {
                auth.isLogged = true
                localStorage.setItem("studentLogged", username)
                auth.loggedUser = username
            }
        }
        auth.logout = function () {
            auth.isLogged = false
            auth.loggedUser = ""
            localStorage.removeItem("studentLogged")
        }
        return auth
    })