import { Component, Input, Output, EventEmitter, OnInit } from "@angular/core";

@Component({
    selector:"aurionpro-rating",
    templateUrl:"./rating.component.html"
})

export class RatingComponent implements OnInit{
    @Input() rating:number
    @Output() showRating:EventEmitter<String>=new EventEmitter<String>()
    ngOnInit(){
        this.showRating.emit("Rating is "+this.rating)
    }
}