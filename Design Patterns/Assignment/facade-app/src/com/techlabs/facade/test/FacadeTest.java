package com.techlabs.facade.test;

import com.techlabs.facade.ShapeMaker;

public class FacadeTest {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
