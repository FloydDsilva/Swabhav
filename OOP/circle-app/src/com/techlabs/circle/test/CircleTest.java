package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir=new Circle(10, "bLue");
		//float area=cir.calcArea();
		displayCircleInfo(cir);
	}

	private static void displayCircleInfo(Circle cir) {
		System.out.println("Radius:"+cir.getRadius()+" Border Color:"+cir.getBorderColor()+" Area:"+cir.calcArea());;
		
	}
	

}
