package com.techlabs.factorymethod.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutomobile;
import com.techlabs.factorymethod.TeslaFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		IAutoFactory bmwFactory=TeslaFactory.getInstance();
		IAutomobile auto = bmwFactory.make();
		auto.start();
		auto.stop();
		
		System.out.println();
		IAutoFactory audiFactory = null;
		try {
			audiFactory = getFactoryInstance();
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
		IAutomobile auto1 = audiFactory.make();
		auto1.start();
		auto1.stop();
	}
	
	public static IAutoFactory getFactoryInstance() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class factory=null;
		Method method = null;
		try {
		FileReader reader=new FileReader("resources\\factory.properties");  
	    Properties p=new Properties();  
	    
			p.load(reader);
			factory=Class.forName(p.getProperty("factory.to.create"));
			method=factory.getDeclaredMethod("getInstance");
		} catch (IOException | ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IAutoFactory) method.invoke(null);
	      
	}
}
