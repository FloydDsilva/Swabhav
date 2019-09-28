export class Ball{
    color:String
    constructor(private id:number) {
        this.color=""
    }
    get Id () {
        return this.id;
    }
    get Color () {
        return this.color
    }
    set Color (value:String) {
        this.color=value
    }
}