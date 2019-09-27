import { Component } from "@angular/core";

@Component({
    selector:'aurionpro-twoway',
    templateUrl:'./twoway.component.html'
})
export class TwoWayComponent {
    firstName:String
    lastName:String
    constructor(){
        this.firstName=''
        this.lastName=""
    }
    firstNameChange(e){
        console.log(e)
        this.firstName=e
    }
    
}