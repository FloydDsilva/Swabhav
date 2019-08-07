package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small_rectangle=new Rectangle();
		Rectangle big_rectangle=new Rectangle();
		
		System.out.println("Small Rectangle");
		small_rectangle.setHeight(-5);
		small_rectangle.setWidth(20);
		displayRect(small_rectangle);
		
		System.out.println("Big Rectangle");
		big_rectangle.setHeight(50);
		big_rectangle.setWidth(101);
		displayRect(big_rectangle);
		
		Rectangle temp=small_rectangle;
		System.out.println(temp.getHeight());
		System.out.println(small_rectangle.getHeight());
		temp.setHeight(10);
		System.out.println(temp.getHeight());
		System.out.println(small_rectangle.getHeight());
		temp=null;
		System.out.println(temp.getHeight());
		System.out.println(small_rectangle.getHeight());
		
		
	}
	private static void displayRect(Rectangle rect) {
		System.out.println("Height:"+rect.getHeight()+" Width:"+rect.getWidth());
		System.out.println("Area="+rect.calcArea());
		System.out.println(rect.hashCode());
		
	}
}
