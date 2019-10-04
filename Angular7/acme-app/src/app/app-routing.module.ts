import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './productList/productList.component';
import { ProductDetailComponent } from './productDetail/productDetail.component';
import { StarComponent } from './star/star.component';


const routes: Routes = [
  {path:"home",component:WelcomeComponent},
  {path:"productList",component:ProductListComponent},
  {path:"productDetail/:productId",component:ProductDetailComponent},
  {path:"star",component:StarComponent},
  {path:"", redirectTo:"home", pathMatch:"full"},
  {path:"**",redirectTo:"home"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
