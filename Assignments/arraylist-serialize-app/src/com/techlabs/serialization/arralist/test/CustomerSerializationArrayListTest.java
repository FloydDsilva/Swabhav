package com.techlabs.serialization.arralist.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.serialization.arralist.Customer;

public class CustomerSerializationArrayListTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList customers=new ArrayList();
		customers.add(new Customer("Sachin", "Tendulkar"));
		customers.add(new Customer("Virat", "Kohli"));
		customers.add(new Customer("Yuvraj", "Singh"));
		customers.add(new Customer("Hardik", "Pandya"));
		customers.add(new Customer("M S", "Dhoni"));
		
		serializeObject(customers, "resources\\customer.ser");
		
		ArrayList cust=deserializeObject("resources\\customer.ser");
		for(int i=0;i<cust.size();i++) {
			Customer customer=(Customer) cust.get(i);
			displayCustomer(customer);
		}

	}

	private static void serializeObject(ArrayList customers,String path) {
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path))){
			out.writeObject(customers);
			//out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("rawtypes")
	private static ArrayList deserializeObject(String path) {
		ArrayList cust=null;
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(path))){
			cust=(ArrayList) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cust;
	}
	private static void displayCustomer(Customer customer) {
		System.out.println("Id:"+customer.getId()+" Name:"+customer.getFirstName()+" "+customer.getLastName());
	}
}
