package com.techlabs.lsp.voilation;

import com.techlabs.lsp.solution.Polygon;

public class Square implements Polygon {
	private int side;
	public Square(int side) {
		this.side=side;
	}
	
	@Override
	public int calcArea() {
		return side*side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
}
