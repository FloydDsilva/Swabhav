package com.techlabs.annotaion;

public class Foo {
	@NeedToRefactor
	public void m1() {
		System.out.println("In m1");
	}

	public void m2() {
		System.out.println("In m2");
	}
	@NeedToRefactor
	public void m3() {
		System.out.println("In m3");
	}
	@NeedToRefactor
	public void m4() {
		System.out.println("In m4");
	}

}
