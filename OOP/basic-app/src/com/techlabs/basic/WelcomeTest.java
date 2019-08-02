package com.techlabs.basic;

public class WelcomeTest {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.err.println("Err is working");
		
		System.out.println(1);
		System.out.println('a');
		System.out.println("String");
		System.out.println(1.4f);
		System.out.println(1.4);
		
		printThis(1);
		printThis('a');
		printThis("String");
		printThis(1.4f);
		printThis(1.4);
	}
	
	public static void printThis(int i) {
		System.out.println("Int:"+i);
	}
	public static void printThis(float f) {
		System.out.println("Float:"+f);
	}
	public static void printThis(String s) {
		System.out.println("String:"+s);
	}
	public static void printThis(char c) {
		System.out.println("Character:"+c);
	}
	public static void printThis(Double d) {
		System.out.println("Double:"+d);
	}
	
}
