package com.techlabs.circle;

public class Circle {
	private final float PI=3.14f;
	public Circle(float radius, String borderColor) {
		this.radius = radius;
		this.borderColor = validateColor(borderColor);
	}
	private float radius;
	private String borderColor;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = validateColor(borderColor);
	}
	public float calcArea() {
		return PI*radius*radius;
	}
	private String validateColor(String color) {
		String validColor;
		if(color.equalsIgnoreCase("RED")) {
			validColor="RED";
		}
		else if(color.equalsIgnoreCase("BLUE")) {
			validColor="BLUE";
		}
		else if(color.equalsIgnoreCase("GREEN")) {
			validColor="GREEN";
		}
		else {
			validColor="RED";
		}
		return validColor;
	}

}
