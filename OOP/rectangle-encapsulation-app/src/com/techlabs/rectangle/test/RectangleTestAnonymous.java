package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTestAnonymous {
	public static void main(String[] args) {
		System.out.println(new Rectangle().calcArea());
		displayRect(new Rectangle());
	}
	private static void displayRect(Rectangle rect) {
		System.out.println("Height:"+rect.getHeight()+" Width:"+rect.getWidth());
		System.out.println("Area="+rect.calcArea());
		System.out.println(rect.hashCode());
		
	}
}
