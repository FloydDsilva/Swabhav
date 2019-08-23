package com.techlabs.cart.juint;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.cart.Customer;
import com.techlabs.cart.LineItem;
import com.techlabs.cart.Order;
import com.techlabs.cart.Product;

class CustomerJUnitTest {
	Product product = new Product("1", "Book", 100, 50);
	LineItem item=new LineItem("1", 3, product);
	Product product2 = new Product("2", "Pen", 10, 50);
	LineItem item2=new LineItem("2", 10, product);

	Product product3 = new Product("3", "Pencil", 10, 50);
	LineItem item3=new LineItem("3", 5, product);
	
	Customer customer=new Customer("1", "Sachin");
	
	@Test
	void testCustomer_ConstructorShouldAssignCorrectValues() {
		assertEquals("1", customer.getId());
		assertEquals("Sachin", customer.getName());
	}

	@Test
	void testaddOrder_ConstructorShouldAssignCorrectValues() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			order.addLineItem(item);
			customer.addOrder(order);
			assertEquals(1, customer.getOrders().size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testorderCount_ShouldReturnCountOfTotalOdersByTheCustomer() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			order.addLineItem(item);
			Date date2 = new SimpleDateFormat("dd-mm-yyyy").parse("2-2-2014");
			Order order2=new Order("2", date2);
			order.addLineItem(item2);
			customer.addOrder(order);
			customer.addOrder(order2);
			assertEquals(2, customer.orderCount());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
