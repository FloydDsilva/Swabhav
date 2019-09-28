import { Component } from "@angular/core";
import { QuestionService } from '../service/QuestionService';

@Component({
    selector:'aurionpro-question',
    templateUrl:'./question.component.html'
})
export class QuestionComponent{
    questions:String[]
    qNo:number
    status:boolean
    constructor(private quesService:QuestionService){
        this.questions=this.quesService.Questions
        this.qNo=0
        this.status=true
    }
    nextQuestion(){
        this.qNo+=1
        if(this.qNo==5)
            this.status=false
    }
}