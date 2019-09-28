import { Component } from "@angular/core";
import { MathService } from '../service/MathService';

@Component({
    selector: 'aurionpro-twoway',
    templateUrl: './twoway.component.html'
})
export class TwoWayComponent {
    firstName: String
    lastName: String
    num: number
    constructor(private mathSer: MathService) {
        this.firstName = ''
        this.lastName = ""
    }
    firstNameChange(e) {
        console.log(e)
        this.firstName = e
    }

    isPrime():String {
        if (this.num) {
            if (this.mathSer.checkPrime(this.num) && this.num != 1) {
                console.log("Green")
                return "green"
            }
            return "red"
            console.log("Red")
        }
    }
    isPrimeAsync() {
        if (this.num) {
            this.mathSer.checkPrimeAsync(this.num).then((r) => {
                console.log(r)
                if (r && this.num != 1) {
                    console.log("green")
                    return "green"
                }
                console.log("red")
                return "red"
            })
        }
    }
}