import { Component } from "@angular/core";

@Component({
    selector:"aurionpro-custompipe",
    templateUrl:"./pipe.component.html"
})

export class CustomPipeComponent {
    employees=[
        {id:1,name:"Amy",gender:"female"},
        {id:2,name:"Jamie",gender:"male"},
        {id:3,name:"Matt",gender:"male"},
        {id:4,name:"Janet",gender:"female"}
    ]
}