package com.techlabs.basic;

public class PassByValueTest {
	public static void main(String[] args) {
		int orders=100;

		System.out.println("Orders(before):"+orders);
		changeOrdersToZero(orders);
		System.out.println("Orders(after):"+orders);
		
		int[] manyOrders= {100,200,300};
		System.out.println("Many Orders(Before)");
		for(int order:manyOrders) {
			System.out.print(order);
		}
		System.out.println();
		changeManyOrdersToZero(manyOrders);
		System.out.println("Many Orders(After)");
		for(int order:manyOrders) {
			System.out.print(order);
		}
	}

	private static void changeManyOrdersToZero(int[] pmanyOrders) {
		for(int i=0;i<pmanyOrders.length;i++) {
			pmanyOrders[i]=0;
		}
		
	}

	private static void changeOrdersToZero(int porders) {
		porders=0;
	}

}
