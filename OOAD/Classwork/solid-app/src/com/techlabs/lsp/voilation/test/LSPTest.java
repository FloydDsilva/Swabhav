package com.techlabs.lsp.voilation.test;

import com.techlabs.lsp.solution.Polygon;
import com.techlabs.lsp.voilation.Rectangle;
import com.techlabs.lsp.voilation.Square;

public class LSPTest {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10, 20);
		Square square=new Square(10);
		displayArea(rec);
		displayArea(square);
		shouldNotChangeHeight_IfWidthChanges(rec); //square class wont be allowed
	}
	
	private static void displayArea(Polygon polygon) {
		System.out.println("Area = "+polygon.calcArea());
	}

	private static void shouldNotChangeHeight_IfWidthChanges(Rectangle rect) {
		int before=rect.getHeight();
		rect.setWidth(rect.getWidth()+10);
		int after=rect.getHeight();
		System.out.println("Before:"+before);
		System.out.println("After:"+after);
	}
}
