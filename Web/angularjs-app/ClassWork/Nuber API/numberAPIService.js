angular.module('NumberAPI.module')
    .factory('factService', ['$http', '$q', function ($http, $q) {
        var factory = {}
        factory.facts = localStorage.getItem("factsAngular") ? JSON.parse(localStorage.getItem("factsAngular")) : []
        factory.getPreviousFacts = function () {
            return $q((resolve,reject)=>{
                resolve(factory.facts)
            })
        }
        factory.getFact = function (num) {
            return $q((resolve, reject) => {
                $http.get("http://numbersapi.com/" + num)
                    .then((response) => {
                        factory.facts.unshift(response.data)
                        localStorage.setItem("factsAngular", JSON.stringify(factory.facts))
                        resolve(factory.facts)
                    })
            })
        }
        return factory
    }])