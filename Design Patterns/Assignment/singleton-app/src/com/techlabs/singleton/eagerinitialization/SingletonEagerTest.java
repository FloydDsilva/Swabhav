package com.techlabs.singleton.eagerinitialization;

public class SingletonEagerTest {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleEagerObject object = SingleEagerObject.getInstance();

	      //show the message
	      object.showMessage();
	}

}
