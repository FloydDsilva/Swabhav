import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'aurionpro-star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {
  @Input() rating:number=5
  constructor() { }

  ngOnInit() {
  }

}
