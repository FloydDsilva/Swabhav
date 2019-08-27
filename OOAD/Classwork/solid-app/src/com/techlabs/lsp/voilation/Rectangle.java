package com.techlabs.lsp.voilation;

import com.techlabs.lsp.solution.Polygon;

public class Rectangle implements Polygon{
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
