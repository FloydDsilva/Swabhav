package com.techlabs.inheritance.constructor.case2;

public class Child extends Parent{
	public Child(int foo) {
		super(foo);
		System.out.println("Inside Child");
	}
}
