package com.techlabs.exception;

public class StackTraceTest2 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

	private static void m1() {
		System.out.println("m1");
		m2();
	}

	private static void m2() {
		System.out.println("m2");
		m3();
	}

	private static void m3() {
		System.out.println("m3");
		throw new RuntimeException("Something went wrong in m3");
	}
}
