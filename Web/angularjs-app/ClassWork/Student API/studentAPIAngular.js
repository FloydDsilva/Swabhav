function Student(rollNo, name, age, email, date, isMale) {
    this.rollNo = rollNo
    this.name = name
    this.age = age
    this.email = email
    let formatted_date = date.getFullYear() + "-" + ("0" + (date.getMonth() + 1)).slice(-2)+"-" + ("0" + date.getDate()).slice(-2)
    this.date = formatted_date
    this.isMale = isMale
}
angular.module('Student.module', [])
    .controller('studentController', ['$scope', 'studentService', function ($scope, studentService) {
        $scope.students = []
        studentService.getStudents()
            .then((r) => {
                $scope.students = r.data
            })
        $scope.convGender = function (isMale) {
            if (isMale)
                return "Male"
            return "Female"
        }
        $scope.addStudent = function () {
            var student = new Student($scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date,
                $scope.isMale)
            studentService.addStudent(student).then((r) => {
                alert("Student ")
                $scope.clearForm()
                studentService.getStudents()
                    .then((r) => {
                        $scope.students = r.data
                    })
            })
            console.log(student)
        }
        $scope.clearForm=()=>{
            $scope.rollNo = ""
            $scope.name = ""
            $scope.age = ""
            $scope.email = ""
            $scope.date = ""
            $scope.isMale="true"
        }
    }])