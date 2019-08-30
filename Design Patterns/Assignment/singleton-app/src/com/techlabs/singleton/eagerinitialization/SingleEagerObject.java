package com.techlabs.singleton.eagerinitialization;

public class SingleEagerObject {
	private static SingleEagerObject instance=new SingleEagerObject();
	private SingleEagerObject() {}
	
	public static SingleEagerObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
