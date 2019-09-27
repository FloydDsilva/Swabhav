import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-welcome',
    templateUrl: './welcome.component.html'
    //styleUrls: ['../../../node_modules/bootstrap3/dist/css/bootstrap.css']
})
export class WelcomeComponent {
    message:String
    constructor() {
        this.message="This is demo text"
    }

}
