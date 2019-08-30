package com.techlabs.singleton.threadsafe;

public class SingletonObject {
	private static SingletonObject instance;
	private SingletonObject() {}
	synchronized public static SingletonObject getInstance() {
		if (instance == null)  
	    { 
	      // if instance is null, initialize 
	      instance = new SingletonObject(); 
	    } 
	    return instance;
	}
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
