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
    primeColor:String
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
            console.log("Red")
            return "red"
        }
    }
    /* isPrimeAsync() {
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
    } */
    isPrimeAsync(eventNum){
        console.log("In 2wayComp")
        if(eventNum){
            console.log("Num:",eventNum)
            this.mathSer.checkPrimeAsync(eventNum).subscribe((d)=>{
                console.log(d)
                if (d) {
                    this.primeColor="green"
                }
                else{
                    this.primeColor = "red"
                }
            })
        }
        else{
            console.log("Else Num:",eventNum)
            this.primeColor=""
        }

    }
}