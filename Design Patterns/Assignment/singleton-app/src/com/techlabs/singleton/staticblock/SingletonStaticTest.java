package com.techlabs.singleton.staticblock;

public class SingletonStaticTest {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingletonStatic object = SingletonStatic.getInstance();

	      //show the message
	      object.showMessage();
	}

}
