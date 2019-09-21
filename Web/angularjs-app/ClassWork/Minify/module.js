angular.module('modA', ['modB'])
    .controller('controllerA', ['$rootScope', '$scope', function ($rootScope, $scope) {
        console.log("Inside Controller A");
        $scope.msg = "Controller A says Hello"
        $rootScope.company = "Aurion Pro"
    }]);
angular.module('modB', [])
    .controller('controllerB', ['$scope', function ($scope) {
        console.log("Inside Controller B");
        $scope.msg = "Controller B says Hello"
    }]);