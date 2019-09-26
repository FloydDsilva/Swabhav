import { Component } from '@angular/core';

@Component({
    selector: 'aurionpro-welcome',
    templateUrl: './welcome.component.html'
})
export class WelcomeComponent {
    message:String
    constructor() {
        this.message="This is demo text"
    }

}
