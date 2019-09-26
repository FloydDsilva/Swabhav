export class Student{
    constructor(private rollNo:number,private name:String) {
        
    }
    get RollNo () {
        return this.rollNo
    }
    get Name () {
        return this.name
    }
}
export class Address {
    constructor(private city:String) {
        
    }
    get City () {
        return this.city
    }
}