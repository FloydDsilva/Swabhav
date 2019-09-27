angular.module('student.module')
    .controller('homeController', ['$scope', 'studentFactory', 'authService', function ($scope, studentFactory, authService) {
        console.log("in Home")
        $scope.students = []
        studentFactory.getStudents()
            .then((r) => {
                $scope.students = r.data
                console.log("Student", $scope.students)

            })
        //$scope.deleteEmployee=()=>{empFactory.deleteEmployee()}
    }])
    .controller('addController', ['$scope', '$rootScope', 'studentFactory', function ($scope, $rootScope, studentFactory) {
        //$scope.jobs=empFactory.jobs
        function Student(rollNo, name, age, email, date, isMale) {
            this.rollNo = rollNo
            this.name = name
            this.age = age
            this.email = email
            let formatted_date = date.getFullYear() + "-" + ("0" + (date.getMonth() + 1)).slice(-2) + "-" + ("0" + date.getDate()).slice(-2)
            this.date = formatted_date
            this.isMale = isMale
        }
        $scope.addStudent = () => {
            if ($rootScope.logged) {
                var student = new Student($scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date, $scope.gender)
                console.log(student)
                studentFactory.addStudent(student).then((r) => {
                    //alert("Student ")
                    //$scope.clearForm()
                    /* studentService.getStudents()
                        .then((r) => {
                            $scope.students = r.data
                        }) */
                    window.location.href = "#/home"
                })
            } else {
                window.location.href = "#/login"
            }
        }
        //$scope.employees=empFactory.employees
    }])
    .controller('updateController', ['$scope', '$rootScope', 'studentFactory', '$routeParams', function ($scope, $rootScope, studentFactory, $routeParams) {
        $scope.std = {}
        studentFactory.editStudent($routeParams.stdId).then((r) => {
            $scope.std = r.data[0]

            console.log("Std:", $scope.std)

            $scope.rollNo = $scope.std.rollNo
            $scope.name = $scope.std.name
            $scope.age = $scope.std.age
            $scope.email = $scope.std.email
            $scope.date = new Date($scope.std.date)
            $scope.isMale = $scope.std.isMale+''
        })
        $scope.updateStudent = () => {
            if ($rootScope.logged) {
                let ustd = angular.copy($scope.std)
                ustd.rollNo = $scope.rollNo
                ustd.name = $scope.name
                ustd.age = $scope.age
                ustd.email = $scope.email
                ustd.date = $scope.date
                ustd.gender = $scope.gender
                console.log("Ustd", ustd)
                empFactory.updateEmployee(ustd)
                window.location.href = "#/home"
            } else {
                window.location.href = "#/login"
            }


        }
    }])
    .controller('deleteController', ['$scope', '$rootScope', 'studentFactory', '$mdDialog', function ($scope, $rootScope, studentFactory, $mdDialog) {
        $scope.deleteStudent = (studentId) => {
            console.log('In Delete Controller')
            showConfirm(studentId)

        }
        var showConfirm = function (studentId) {
            var confirm = $mdDialog.confirm()
                .title('Are you sure to delete the record?')
                .textContent('Record will be deleted permanently.')
                .ok('Yes')
                .cancel('No');
            $mdDialog.show(confirm).then(function () {
                if ($rootScope.logged) {
                    studentFactory.deleteStudent(studentId)
                        .then((r) => {
                            window.location.href = "#/home"
                        })
                } else {
                    window.location.href = "#/login"
                }
            });
        };
    }])
    .controller('loginController', ['$scope', '$rootScope', 'authService', function ($scope, $rootScope, authService) {
        $rootScope.logged = authService.loggedUser
        $scope.login = () => {
            authService.login($scope.username, $scope.password)
            if (authService.isLogged) {
                $rootScope.logged = authService.loggedUser
                console.log($scope.logged)
                window.location.href = "#/home"
            }
        }
        $scope.logout = () => {
            console.log("logged out")
            authService.logout()
            $rootScope.logged = ""
            window.location.href = "#/home"
        }
        console.log($scope.logged)
    }])