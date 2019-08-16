package com.techlabs.abstraction;

public class Square extends Shape {
	public final int side;
	
	public Square(String borderColor,int side) {
		super(borderColor);
		this.side=side;
	}
	
	@Override
	public float calcArea() {
		return side*side;
	}
	
	public int getSide() {
		return side;
	}
}
