package com.techlabs.abstraction.test;

import com.techlabs.abstraction.Circle;
import com.techlabs.abstraction.Square;

public class AbstractionTest {

	public static void main(String[] args) {
		Circle circle=new Circle("red", 10);
		System.out.println("Area:"+circle.calcArea());
		System.out.println("Radius:"+circle.getRadius());
		
		Square square=new Square("blue", 10);
		System.out.println("Area:"+square.calcArea());
		System.out.println("Side:"+square.getSide());
	}
}
