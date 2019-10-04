import { Component, OnInit } from '@angular/core';
import { ProductDataService } from '../Services/productData.service';

@Component({
  selector: 'aurionpro-productList',
  templateUrl: './productList.component.html',
  styleUrls: ['./productList.component.css']
})
export class ProductListComponent implements OnInit {
  products:any=[]
  showImage:boolean
  filterText:String
  constructor(private getProducts:ProductDataService) {
    this.showImage=true
   }

  ngOnInit() {
    this.getProducts.getJSON().subscribe(data=>{
      console.log(data)
      this.products=data
    })
  }

  hideImage(){
    this.showImage=(this.showImage)?false:true
  }
}
