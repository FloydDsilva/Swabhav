import { Component } from "@angular/core";

@Component({
    selector: "aurionpro-parentchild",
    templateUrl: "./parentChild.component.html"
})

export class ParentChildComponent {
    status: String
    rating: String
    constructor() {
        console.log("Inside ParentChild Constructor")

    }
    stateChangeHandler(event) {
        this.status = event
    }
    showRatingHandler(event) {
        this.rating = event
    }

}