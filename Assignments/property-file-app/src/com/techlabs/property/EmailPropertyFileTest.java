package com.techlabs.property;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmailPropertyFileTest {

	public static void main(String[] args) {
		Properties propertyWrite=new Properties();
		propertyWrite.setProperty("name", "Sachin Tendulkar");
		propertyWrite.setProperty("email", "s@t.com");
		propertyWrite.setProperty("name2", "Virat Kohli");
		propertyWrite.setProperty("email2", "v@k.com");
		
		try {
			propertyWrite.store(new FileWriter("resources\\email.properties"), "Email Info");
			System.out.println("Working");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties propertRead=new Properties();
		try {
			propertRead.load(new FileReader("resources\\email.properties"));
			Set keySet=propertRead.entrySet();
			Iterator itr=keySet.iterator();
			while(itr.hasNext()) {
				Map.Entry entry=(Map.Entry)itr.next();
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
