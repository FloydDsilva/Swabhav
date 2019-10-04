import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ProductDataService {


constructor(private http:HttpClient) {
  // this.getJSON().subscribe(data=>{console.log(data)})
 }

 getJSON(){
   return this.http.get("assets/products.jsonx")
 }

 
}
