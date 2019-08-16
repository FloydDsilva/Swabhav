package com.techlabs.inheritance;

public class Boy extends Man{
	public void eat() {
		System.out.println("Boy eats pizza...");
	}
	@Override
	public void plays() {
		System.out.println("Boy plays cricket...");
	}
	public void walk() {
		System.out.println("Boy walks around...");
	}
}
