import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'aurionpro-star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {
  rating:number=5
  constructor() { }

  ngOnInit() {
  }

}
