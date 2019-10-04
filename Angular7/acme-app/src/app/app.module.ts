import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar'
import { MatTooltipModule } from "@angular/material/tooltip";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StarComponent } from './star/star.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './productList/productList.component';
import { ProductDetailComponent } from './productDetail/productDetail.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchFilterPipe } from './pipe/searchFilter.pipe';
import { FormsModule } from '@angular/forms';

@NgModule({
   declarations: [
      AppComponent,
      StarComponent,
      WelcomeComponent,
      ProductListComponent,
      ProductDetailComponent,
      SearchFilterPipe
   ],
   imports: [
      BrowserModule,
      BrowserAnimationsModule,
      AppRoutingModule,
      MatToolbarModule,
      MatTooltipModule,
      HttpClientModule,
      FormsModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
