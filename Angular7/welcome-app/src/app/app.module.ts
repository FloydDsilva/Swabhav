import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from "@angular/http";

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { BlueBallComponent } from './blueBallGame/blueBall.component';
import { TwoWayComponent } from './twoway/twoway.component';
import { MathService } from './service/MathService';
import { QuestionService } from './service/QuestionService';
import { QuestionComponent } from './question/question.component';
import { MypipePipe } from './customPipe/mypipe.pipe';
import { CustomPipeComponent } from './customPipe/pipe.component';
import { ParentChildComponent } from './parentChild/parentChild.component';
import { ToggleBtnComponent } from './parentChild/toggle/toggle.component';
import { RatingComponent } from './parentChild/rating/rating.component.';
import { MatTooltipModule } from '@angular/material/tooltip';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NumbersComponent } from './numbers/numbers.component';

@NgModule({
   declarations: [
      WelcomeComponent,
      StudentComponent,
      BlueBallComponent,
      TwoWayComponent,
      QuestionComponent,
      CustomPipeComponent,
      MypipePipe,
      ParentChildComponent,
      ToggleBtnComponent,
      RatingComponent,
      NumbersComponent
   ],
   imports: [
      BrowserModule,
      FormsModule,
      BrowserAnimationsModule,
      MatTooltipModule,
      HttpModule
   ],
   providers: [
      MathService,
      QuestionService
   ],
   bootstrap: [
      WelcomeComponent
   ]
})
export class AppModule { }
