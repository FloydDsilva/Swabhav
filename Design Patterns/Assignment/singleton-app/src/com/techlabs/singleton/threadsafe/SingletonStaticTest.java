package com.techlabs.singleton.threadsafe;

public class SingletonStaticTest {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingletonObject object = SingletonObject.getInstance();

	      //show the message
	      object.showMessage();
	}

}
