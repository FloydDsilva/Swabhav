angular.module('student.module',['ngRoute','ngMaterial'])
    .config(['$routeProvider',function ($routeProvider) {
        console.log("Inside Config")
        $routeProvider.when('/',{
            templateUrl:"Fragments/home.html",
            controller:"homeController"
        })
        .when('/home',{
            templateUrl:"Fragments/home.html",
            controller:"homeController"
        })
        .when('/addStudent',{
            templateUrl:"Fragments/addStudent.html",
            controller:"addController"
        })
        .when('/updateStudent/:stdId',{
            templateUrl:"Fragments/updateStudent.html",
            controller:"updateController"
        })
        .when('/login',{
            templateUrl:"Fragments/login.html",
            controller:"loginController"
        })
    }])