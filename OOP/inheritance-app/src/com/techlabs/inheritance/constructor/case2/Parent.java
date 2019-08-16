package com.techlabs.inheritance.constructor.case2;

public class Parent {
	private final int foo;
	public Parent(int foo) {
		this.foo=foo;
		System.out.println("Inside Parent");
		System.out.println(getFoo());
	}
	public int getFoo() {
		return foo;
	}
}
