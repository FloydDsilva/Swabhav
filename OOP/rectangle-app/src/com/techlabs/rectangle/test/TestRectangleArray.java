package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangleArray {
	public static void main(String[] args) {
		Rectangle[] rectangle_array=new Rectangle[5];
		rectangle_array[0]=new Rectangle(10, 20);
		rectangle_array[1]=new Rectangle(20, 30);
		rectangle_array[2]=new Rectangle(30, 40);
		rectangle_array[3]=new Rectangle(40, 50);
		rectangle_array[4]=new Rectangle(50, 60);
		int sum_area=0;
		for(int i=0;i<5;i++) {
			displayRect(rectangle_array[i]);
			sum_area+=rectangle_array[i].calcArea();
		}
		System.out.println("Sum of Area:"+sum_area);
	}
	private static void displayRect(Rectangle rect) {
		System.out.println("Height:"+rect.height+" Width:"+rect.width);
		System.out.println("Area="+rect.calcArea());
		System.out.println(rect.hashCode());
		
	}

}
