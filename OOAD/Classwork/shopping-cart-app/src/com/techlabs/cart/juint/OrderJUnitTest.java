package com.techlabs.cart.juint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.techlabs.cart.LineItem;
import com.techlabs.cart.Order;
import com.techlabs.cart.Product;

public class OrderJUnitTest {
	Product product = new Product("1", "Book", 100, 50);
	LineItem item=new LineItem("1", 3, product);
	Product product2 = new Product("2", "Pen", 10, 50);
	LineItem item2=new LineItem("2", 10, product);
	
	@org.junit.jupiter.api.Test
	void testOrder__ConstructorShouldAssignCorrectValues() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			assertEquals("1", order.getId());
			assertEquals(date.toString(), order.getDate().toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.jupiter.api.Test
	void testaddLineItem_ShouldAddItemsInTheList() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			int prevSize=order.getItems().size();
			order.addLineItem(item);
			assertEquals(prevSize+1, order.getItems().size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.jupiter.api.Test
	void testremoveLineItem_ShouldRemoveCorrectItem() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			int prevSize=order.getItems().size();
			order.addLineItem(item);
			order.removeLineItem("1");
			assertEquals(prevSize, order.getItems().size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.jupiter.api.Test
	void testremoveLineItem_ShouldNotRemoveItemIfNotInList() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			int prevSize=order.getItems().size();
			order.addLineItem(item);
			order.removeLineItem("2");
			assertEquals(prevSize+1, order.getItems().size());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.jupiter.api.Test
	void testCount_ShouldReturnCountOfTotalLineItemsInList() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			order.addLineItem(item);
			int size=order.getItems().size();
			assertEquals(size, order.count());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.jupiter.api.Test
	void testCheckOutPrice_ShouldReturnTotalPriceOfTheOrder() {
		try {
			Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
			Order order=new Order("1", date);
			order.addLineItem(item);
			assertEquals(150, order.checkOutPrice());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}