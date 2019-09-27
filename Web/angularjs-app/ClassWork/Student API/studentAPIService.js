angular.module('Student.module')
.factory('studentService',['$http',function ($http) {
    var factory = {}
    
    factory.getStudents= function () {
        return $http.get("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students")
    }

    factory.addStudent=function (student) {
        return $http.post("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students",JSON.stringify(student))
    }

    factory.deleteStudent=function (studentId) {
        return $http.delete("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students"+studentId)
    }

    return factory
}])