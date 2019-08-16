package com.techlabs.abstraction;

public abstract class Shape {
	final String borderColor;
	public abstract float calcArea();
	
	public Shape(String borderColor) {
		this.borderColor = borderColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	
	
}
