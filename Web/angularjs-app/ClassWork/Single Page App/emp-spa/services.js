angular.module('emp.module')
    .factory('empFactory',function () {
        var factory = {}
        factory.jobs = ['Programmer', 'Analyst', 'Manager']
        factory.Employee=function(name, age, gender, job, salary) {
            this.id = Date.now().toString()
            this.name = name
            this.age = age
            this.gender = gender
            this.job = job
            this.salary = salary
        }
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
        factory.addEmployee=(employee)=>{(factory.employees).unshift(employee); console.log(factory.employees)}
        factory.editEmployee=(employeeId)=>{
            console.log("Edit",employeeId)
            for(let i=0;i<factory.employees.length;i++){
                if(factory.employees[i].id==employeeId){
                    return factory.employees[i]
                }
            }
        }
        factory.updateEmployee=(employee)=>{
            for(let i=0;i<factory.employees.length;i++){
                if(factory.employees[i].id==employee.id){
                    factory.employees.splice(i,1,employee)
                }
            }
            console.log(factory.employees)
        }
        factory.deleteEmployee=(employeeId)=>{
            factory.employees=factory.employees.filter(e=>e.id!=employeeId)
            alert("Deleted:"+employeeId)
            console.log("After Deleting",factory.employees)
        }
        return factory
    });

angular.module('emp.module')
    .factory('authService', function () {
        var auth={}
        auth.admin={
            username:"admin",
            password:"admin"
        }
        auth.isLogged=false
        auth.loggedUser=localStorage.getItem("empLogged")
        auth.login=function(username,password){
            if(username==auth.admin.username&&password==auth.admin.password){
                auth.isLogged=true
                localStorage.setItem("empLogged",username)
                auth.loggedUser=username
            }
        }
        auth.logout=function () {
            auth.isLogged=false
            auth.loggedUser=""
            localStorage.removeItem("empLogged")
        }
        return auth
    })