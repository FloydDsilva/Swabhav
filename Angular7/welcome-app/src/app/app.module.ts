import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { BlueBallComponent } from './blueBallGame/blueBall.component';
import { TwoWayComponent } from './twoway/twoway.component';

@NgModule({
  declarations: [
    WelcomeComponent,StudentComponent,BlueBallComponent,TwoWayComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }
