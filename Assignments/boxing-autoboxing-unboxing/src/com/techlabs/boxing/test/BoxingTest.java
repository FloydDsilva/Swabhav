package com.techlabs.boxing.test;

public class BoxingTest {

	public static void main(String[] args) {
		Integer integer1=new Integer(10); //boxing
		Integer integer2=Integer.valueOf(20);
		
		intMethod(integer1); //auto boxing Integer.valueOf(10)
		Integer integer3=10; //auto boxing
		
		integerMethod(integer2); //Unboxing
		
	}

	public static void integerMethod(Integer integer) {
		System.out.println("Integer:"+integer);
	}
	
	public static void intMethod(int int1) {
		System.out.println("int:"+int1);
	}

}
