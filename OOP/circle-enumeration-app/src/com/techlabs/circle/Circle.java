package com.techlabs.circle;

public class Circle {
	private final static float PI=3.142f;
	private final float radius;
	private final ColorCategory borderColor;
	private BorderStyle borderStlye=BorderStyle.SINGLE;
	

	public Circle(float radius, ColorCategory borderColor) {
		this.radius = radius;
		this.borderColor = borderColor;
	}
	
	public Circle(float radius, ColorCategory borderColor, BorderStyle borderStyle) {
		this.radius = radius;
		this.borderColor = borderColor;
		this.borderStlye=borderStyle;
	}
	public float getRadius() {
		return radius;
	}
	public ColorCategory getBorderColor() {
		return borderColor;
	}
	public BorderStyle getBorderStlye() {
		return borderStlye;
	}
	public float calcArea() {
		return radius*radius*PI;
	}
	
}
