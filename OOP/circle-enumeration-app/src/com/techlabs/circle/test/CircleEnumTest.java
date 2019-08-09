package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;
import com.techlabs.circle.ColorCategory;

public class CircleEnumTest {

	public static void main(String[] args) {
		Circle cir=new Circle(10, ColorCategory.RED);
		display(cir);
		Circle circle=new Circle(10, ColorCategory.RED, BorderStyle.DOUBLE);
		display(circle);
	}

	private static void display(Circle cir) {
		System.out.println("Radius:"+cir.getRadius()+" Border Color:"+cir.getBorderColor()+" Border Style:"+cir.getBorderStlye()+" Area:"+cir.calcArea());
	}

}
