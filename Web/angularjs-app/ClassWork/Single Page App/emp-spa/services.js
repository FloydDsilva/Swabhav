angular.module('emp.module')
    .factory('empFactory',function () {
        var factory = {}
        factory.employees = [{
                id: "1569325787029",
                name: "Ronaldo",
                age: 46,
                gender: "Male",
                job: "Programmer",
                salary: 5000
            },
            {
                id: "1569326471648",
                name: "Messi",
                age: 42,
                gender: "Male",
                job: "Analyst",
                salary: 5000
            },
            {
                id: "1569326538826",
                name: "Amy",
                age: 32,
                gender: "Female",
                job: "Manager",
                salary: 5000
            },
            {
                id: "1569326064064",
                name: "Sachin",
                age: 40,
                gender: "Male",
                job: "Manager",
                salary: 5000
            },
            {
                id: "1569326471843",
                name: "Virat",
                age: 30,
                gender: "Male",
                job: "Programmer",
                salary: 3000
            },
            {
                id: "1569326584891",
                name: "Dhoni",
                age: 35,
                gender: "Male",
                job: "Analyst",
                salary: 2500
            }
        ]
        
        return factory
    })
