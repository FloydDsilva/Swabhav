package com.techlabs.unittest;

import com.techlabs.annotaion.NeedToRefactor;

public class Foo {
	@TestCase
	public boolean m1() {
		return true;
	}
	@TestCase
	public boolean m2() {
		return true;
	}
	@TestCase
	public boolean m3() {
		return true;
	}
	@TestCase
	public boolean m4() {
		return true;
	}
	@TestCase
	public boolean m5() {
		return false;
	}
	@TestCase
	public boolean m6() {
		return true;
	}
}
