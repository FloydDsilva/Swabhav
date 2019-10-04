import { Component, OnInit } from '@angular/core';
import { ProductDataService } from '../Services/productData.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'aurionpro-productDetail',
  templateUrl: './productDetail.component.html',
  styleUrls: ['./productDetail.component.css']
})
export class ProductDetailComponent implements OnInit {
  product:any
  prodId:number
  constructor(private getProducts:ProductDataService,private route:ActivatedRoute) {

   }

  ngOnInit() {
    this.prodId=this.route.snapshot.params.productId
    this.getProducts.getJSON().subscribe(data => {
      this.product=this.getProduct(data,this.prodId)
      console.log(this.product)
    })
  }

  getProduct(products,prodId){
    console.log("IN function")
    for (const product of products) {
      if(product.productId==prodId){
        return product
      }
    }
  }

}
