package com.techlabs.srp.solution;

public class InvoicePrinter {
	public void print(Invoice x) {
		System.out.println("Id:"+x.getId()+" Name:"+x.getName()+" Cost:"+x.getCost()+" Discount:"+x.calculateDiscount()+" Tax:"+x.calculateTax()+" Total Cost:"+x.calculateTotalCost());
	}
}
