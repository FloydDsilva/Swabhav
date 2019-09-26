angular.module('emp.module')
    .controller('homeController',['$scope','empFactory','authService',function ($scope,empFactory) {
        console.log("in Home")
        $scope.employees=[]
        $scope.employees=empFactory.employees
        console.log("Employees",$scope.employees)
        //$scope.deleteEmployee=()=>{empFactory.deleteEmployee()}
    }])
    .controller('addController',['$scope','$rootScope','empFactory',function ($scope,$rootScope,empFactory) {
        $scope.jobs=empFactory.jobs
        $scope.addEmployee=()=>{
            if($rootScope.logged){
            var employee=new empFactory.Employee($scope.name,$scope.age,$scope.gender,$scope.job,$scope.salary)
            console.log(employee)
            empFactory.addEmployee(employee)
            window.location.href = "#/home"
            }
            else{
                window.location.href = "#/login"
            }
        }
        //$scope.employees=empFactory.employees
    }])
    .controller('updateController',['$scope','$rootScope','empFactory','$routeParams',function ($scope,$rootScope,empFactory,$routeParams) {
        $scope.emp={}
        $scope.jobs = empFactory.jobs
        
        $scope.emp=empFactory.editEmployee($routeParams.empId)
        console.log("Emp:",$scope.emp)
        
        $scope.name=$scope.emp.name
        $scope.age = $scope.emp.age
        $scope.gender=$scope.emp.gender
        $scope.job = $scope.emp.job
        $scope.salary = $scope.emp.salary
        /* $scope.editEmployee=(employee)=>{
            $scope.emp=employee
            
            console.log("Update Controller:",$scope.emp.id)
        } */
        $scope.updateEmployee=()=>{
            if ($rootScope.logged) {
            let uemp=angular.copy($scope.emp)
            uemp.name = $scope.name
            uemp.age = $scope.age
            uemp.gender = $scope.gender
            uemp.job = $scope.job
            uemp.salary = $scope.salary
            console.log("Uemp",uemp)
            empFactory.updateEmployee(uemp)
            window.location.href = "#/home"
            } else {
                window.location.href = "#/login"
            }
            
        }
    }])
    .controller('deleteController', ['$scope','$rootScope', 'empFactory','$mdDialog', function ($scope,$rootScope, empFactory,$mdDialog) {
        $scope.deleteEmployee = (employeeId) => {
            console.log('In Delete Controller')
            showConfirm(employeeId)
            
        }
        var showConfirm = function (employeeId) {
            var confirm = $mdDialog.confirm()
                .title('Are you sure to delete the record?')
                .textContent('Record will be deleted permanently.')
                .ok('Yes')
                .cancel('No');
            $mdDialog.show(confirm).then(function () {
                if ($rootScope.logged) {
                empFactory.deleteEmployee(employeeId)
                window.location.href = "#/home"
                }else {
                    window.location.href = "#/login"
                }
            });
        };
    }])
    .controller('loginController',['$scope','$rootScope','authService',function ($scope,$rootScope,authService) {
        $rootScope.logged=authService.loggedUser
        $scope.login=()=>{
            authService.login($scope.username, $scope.password)
            if(authService.isLogged){
                $rootScope.logged=authService.loggedUser
                console.log($scope.logged)
                window.location.href = "#/home"
            }
        }
        $scope.logout=()=>{
            console.log("logged out")
            authService.logout()
            $rootScope.logged = ""
            window.location.href = "#/home"
        }
        console.log($scope.logged)
    }])