package com.techlabs.basic;

public class ArgumentTest {
	public  static void main(String[] names) {
		System.out.println("Length of command-line argument: "+names.length);
		if(names.length>0) {
			for(String name:names) {
				System.out.println("Hello "+name);
			}
		}
		System.out.println("Thank you");
	}

}
