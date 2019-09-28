import { Component } from "@angular/core";
import { Ball } from './Ball';

@Component({
    selector:'aurionpro-blueball',
    templateUrl:'./blueBall.component.html'
})

export class BlueBallComponent{
    balls: Ball[]
    randNum:number
    chances:number
    gameStatus:boolean
    result:String
    constructor() {
        this.balls = []
        this.randNum=Math.floor((Math.random()*51)+1)
        this.randNum=20
        this.chances=0
        this.gameStatus=true
        
    }
    makeBalls=()=>{
        for (let i = 0; i < 50; i++) {
            this.balls.push(new Ball(i+1))
        }
    }
    ballClick=(ball:Ball)=>{
        console.log(ball.Id)
        if(ball.Id<this.randNum){
            //return "red"
            ball.Color="red"
            console.log("red")
        }
        else if(ball.Id>this.randNum){
            //return "green"
            ball.Color="green"
            console.log("green") 
        }
        else{
            ball.Color="blue"
            //return "blue"
            console.log("blue")
        } 
        this.chances+=1
        this.result = ((this.gameStatus) && (ball.Color == "blue"))?"Game Won":"Game Lost"
        this.gameStatus=((this.chances==3)||(ball.Color=="blue"))?false:true
    }
}