package com.techlabs.singleton.staticblock;

import com.techlabs.singleton.eagerinitialization.SingleEagerObject;

public class SingletonStatic {
	public static SingletonStatic instance;
	static{
		instance =new SingletonStatic();
	}
	private SingletonStatic() {}
	
	public static SingletonStatic getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
