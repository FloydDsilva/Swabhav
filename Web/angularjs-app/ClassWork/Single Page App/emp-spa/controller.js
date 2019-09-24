function Employee (name,age,gender,job,salary) {
    this.id=Date.now().toString()
    this.name=name
    this.age=age
    this.gender=gender
    this.job=job
    this.salary=salary
}
angular.module('emp.module')
    .controller('homeController',['$scope','empFactory',function ($scope,empFactory) {
        $scope.employees=[]
        $scope.employees=empFactory.employees
    }])
    .controller('addController',['$scope','empFactory',function ($scope,empFactory) {
        $scope.jobs=['Programmer','Analyst','Manager']
        $scope.addEmployee=()=>{
            var employee=new Employee($scope.name,$scope.age,$scope.gender,$scope.job,$scope.salary)
            console.log(employee)
        }
        //$scope.employees=empFactory.employees
    }])