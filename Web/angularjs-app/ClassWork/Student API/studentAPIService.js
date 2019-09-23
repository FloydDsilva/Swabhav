angular.module('Student.module')
.factory('studentService',['$http',function ($http) {
    var factory = {}
    
    factory.getStudents= function () {
        return $http("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students")
    }

    return factory
}])