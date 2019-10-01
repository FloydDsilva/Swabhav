import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html'
})
export class DataComponent implements OnInit {
  parameter:String

  constructor(private route:ActivatedRoute) {}

  ngOnInit() {
    this.parameter=this.route.snapshot.params.num
  }

}
