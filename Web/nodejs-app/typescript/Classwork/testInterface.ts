interface ICustomer{
    id:number,
    firstName:String,
    lastName:String,
    location?:String
}
function printInfo(customers:ICustomer[]){
    for(let c of customers){
        console.log(c)
    }
    
}
printInfo([
    {id:101,firstName:"Sachin",lastName:"Tendulkar"},
    {id:102,firstName:"Virat",lastName:"Kohli"},
    {id:103,firstName:"Kapil",lastName:"Dev"}
])