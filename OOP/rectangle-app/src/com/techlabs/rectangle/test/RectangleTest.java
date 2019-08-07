package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small_rectangle=new Rectangle();
		Rectangle big_rectangle=new Rectangle();
		
		System.out.println("Small Rectangle");
		small_rectangle.height=5;
		small_rectangle.width=20;
		System.out.println("Height:"+small_rectangle.height+" Width:"+small_rectangle.width);
		System.out.println("Area="+small_rectangle.calcArea());
		
		System.out.println("Big Rectangle");
		big_rectangle.height=50;
		big_rectangle.width=100;
		System.out.println("Height:"+big_rectangle.height+" Width:"+big_rectangle.width);
		System.out.println("Area="+big_rectangle.calcArea());
		
	}
}
