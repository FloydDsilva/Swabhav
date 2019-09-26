class Customer {
    _id:number
    _firstName:String
    _lastName:String
    constructor(id:number,fisrtName:String,lastName:String) {
        this._id=id
        this._firstName=fisrtName
        this._lastName=lastName
    }
    get Id () {
        return this._id
    }
    get FirstName () {
        return this._firstName
    }
    get LastName () {
        return this._lastName
    }
    set FirstName (name:String) {
        this._firstName=name
    }
    set LastName (name:String) {
        this._lastName=name
    }
}
let c1=new Customer(101,"Sachin","Tendulakar")
console.log(c1.Id)
console.log (c1.FirstName)
console.log(c1.LastName)
c1.FirstName="Virat"
console.log (c1.FirstName)
