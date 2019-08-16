package com.techlabs.abstraction;

public class Circle extends Shape{
	private final static float PI=3.142f;
	private final int radius;
	public Circle(String borderColor,int raduis) {
		super(borderColor);
		this.radius=raduis;
	}

	@Override
	public float calcArea() {
		return radius*radius*PI;
	}

	public int getRadius() {
		return radius;
	}
	
	
}
