import { Component, Input, OnInit, Output, EventEmitter } from "@angular/core";

@Component({
    selector: "aurionpro-toggle",
    templateUrl: "./toggle.component.html"
})

export class ToggleBtnComponent implements OnInit {
    @Input() textContent: String
    @Input() onStateColor: String
    @Input() offStateColor: String
    @Output() stateChange:EventEmitter<String>=new EventEmitter<String>()

    state: number = 0
    btnColor: String
    status:String = "OFF"

    constructor() {
        console.log("Inside Toggle constructor")
        

    }
    
    ngOnInit() {
        console.log("Inside On Init")
        if (this.textContent == "") {
            this.textContent = "AurionPro"
        }
        console.log(this.onStateColor)
        this.btnColor = this.offStateColor
        this.stateChange.emit(this.status)
    }

    clickHandler() {
        if (this.state == 0) {
            this.btnColor = this.onStateColor
            this.state = 1
            this.status="ON"
            this.stateChange.emit(this.status)
        }
        else {
            this.btnColor = this.offStateColor
            this.state = 0
            this.status = "OFF"
            this.stateChange.emit(this.status)
        }
    }

}