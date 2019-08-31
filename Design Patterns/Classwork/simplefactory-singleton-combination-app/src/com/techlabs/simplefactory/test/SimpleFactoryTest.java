package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;
import com.techlabs.simplefactory.Tesla;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		AutomobileFactory factory=AutomobileFactory.getInstance();
		IAutomobile bmw=factory.make(AutoType.BWM);
		bmw.start();
		bmw.stop();
		
		IAutomobile audi=factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();
		
		AutomobileFactory factory1=AutomobileFactory.getInstance();
		IAutomobile tesla=factory1.make(AutoType.TESLA);
		tesla.start();
		tesla.stop();
		System.out.println(factory.hashCode()+" "+factory1.hashCode());
	}

}
