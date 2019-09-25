angular.module('emp.module',['ngRoute','ngMaterial'])
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
        .when('/addEmployee',{
            templateUrl:"Fragments/addEmployee.html",
            controller:"addController"
        })
        .when('/updateEmployee/:empId',{
            templateUrl:"Fragments/updateEmployee.html",
            controller:"updateController"
        })
        .when('/login',{
            templateUrl:"Fragments/login.html",
            controller:"loginController"
        })
    }])