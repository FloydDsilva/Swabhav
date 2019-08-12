package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer=new Customer("Sachin", "Tendulkar");
		Customer customer2=new Customer("Virat", "Kohli");
		System.out.println(customer.getId());
		System.out.println(customer2.getId());
		Customer customer3=new Customer("Yuvraj", "Singh");
		System.out.println(customer3.getId());
		System.out.println(customer.getId());
		System.out.println(customer2.getId());
		System.out.println(customer);
		System.out.println(customer.toString());
	}

}
