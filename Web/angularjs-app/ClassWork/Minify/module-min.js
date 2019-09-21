angular.module("modA", ["modB"]).controller("controllerA", ["$rootScope", "$scope", function (o, l) {
    console.log("Inside Controller A"), l.msg = "Controller A says Hello", o.company = "Aurion Pro"
}]), angular.module("modB", []).controller("controllerB", ["$scope", function (o) {
    console.log("Inside Controller B"), o.msg = "Controller B says Hello"
}]);