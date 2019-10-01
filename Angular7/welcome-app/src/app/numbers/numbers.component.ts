import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'aurionpro-numbers',
  templateUrl: './numbers.component.html',
})
export class NumbersComponent implements OnInit{
  numbr: number
  facts:String[]
  constructor(private http:Http) {
    console.log("In Constructor")
  }
  
  ngOnInit(): void {
    this.facts=[]

  }
  getFact(num){
    // console.log("get Fact"+num)
    this.http.get("http://numbersapi.com/"+num)
    .subscribe((data)=>{
      console.log(data)
      this.facts.unshift(data.text()) 
    })
  }
  
}
