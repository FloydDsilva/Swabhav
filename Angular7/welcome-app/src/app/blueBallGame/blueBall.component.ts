import { Component } from "@angular/core";
import { Ball } from './Ball';

@Component({
    selector:'aurionpro-blueball',
    templateUrl:'./blueBall.component.html'
})

export class BlueBallComponent{
    balls: Ball[]
    randNum:number
    constructor() {
        this.balls = []
        this.randNum=Math.floor((Math.random()*51)+1)
        this.randNum=20
    }
    makeBalls=()=>{
        for (let i = 0; i < 50; i++) {
            this.balls.push(new Ball(i+1))
        }
    }




}