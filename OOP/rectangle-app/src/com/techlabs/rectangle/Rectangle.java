package com.techlabs.rectangle;

public class Rectangle {
	public int width;
	public int height;
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int calcArea() {
		int area=width*height;
		return area;
	}

}
