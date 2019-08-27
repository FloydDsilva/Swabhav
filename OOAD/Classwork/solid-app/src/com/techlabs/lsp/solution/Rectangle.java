package com.techlabs.lsp.solution;

public class Rectangle {
	protected int width;
	protected int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calcArea() {
		return height*width;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
