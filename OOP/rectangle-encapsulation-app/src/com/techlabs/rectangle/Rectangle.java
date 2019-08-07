package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=validate(width);
	}
	
	private int height;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=validate(height);
	}
	
	private int validate(int value) {
		if(value>100) {
			value = 100;
		}
		else if(value<1) {
			value = 1;
		}
		return value;
	}
	public int calcArea() {
		int area=width*height;
		return area;
	}

}
