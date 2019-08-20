package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenericCollection {

	public static void main(String[] args) {
		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		cart.add(new LineItem("Books", 2, 100, 3));
		cart.add(new LineItem("Bag", 1, 10000, 1));
		cart.add(new LineItem("Pencil", 5, 10, 5));
		cart.add(new LineItem("Eraser", 4, 15, 2));
		cart.add(new LineItem("Books", 2, 10, 10));
		double totalCartCost=0;
		for (LineItem item : cart) {
			System.out.println(item);
			totalCartCost+=(double)item.calcTotalCost();
		}
		System.out.println("Total cost of the Cart:"+totalCartCost);
	}

}
