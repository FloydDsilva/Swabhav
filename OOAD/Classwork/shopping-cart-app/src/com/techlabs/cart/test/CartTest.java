package com.techlabs.cart.test;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.techlabs.cart.Customer;
import com.techlabs.cart.LineItem;
import com.techlabs.cart.Order;
import com.techlabs.cart.Product;

public class CartTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat timeFormat=new SimpleDateFormat("dd-mm-yyyy");
		
		Product product = new Product("1", "Book", 100, 50);
		LineItem item=new LineItem("1", 3, product);
		Product product2 = new Product("2", "Pen", 10, 50);
		LineItem item2=new LineItem("2", 10, product2);
		Customer customer=new Customer("1", "Sachin");
		

		Product product3 = new Product("3", "Pencil", 10, 50);
		LineItem item3=new LineItem("3", 5, product3);
		LineItem item4=new LineItem("4",3,product);
		
		Date date = new SimpleDateFormat("dd-mm-yyyy").parse("1-1-2014");
		Order order=new Order("1", date);
		order.addLineItem(item);
		order.addLineItem(item);
		order.addLineItem(item3);
		order.addLineItem(item4);
		order.addLineItem(item3);
		
		
		Date date2 = new SimpleDateFormat("dd-mm-yyyy").parse("2-2-2014");
		Order order2=new Order("2", date2);
		order2.addLineItem(item2);
		
		customer.addOrder(order);
		customer.addOrder(order2);
		
		printInvoice(customer);
	}

	public static void printInvoice(Customer customer) {
		SimpleDateFormat timeFormat=new SimpleDateFormat("dd-mm-yyyy");
		System.out.println("Custormer:");
		System.out.println("Id:"+customer.getId()+" Name:"+customer.getName());
		System.out.println("Orders:");
		List<Order> orders=customer.getOrders();
		for(Order order:orders) {
			System.out.println("\tId:"+order.getId()+" Date:"+timeFormat.format(order.getDate())+" CheckOutCost:"+order.checkOutPrice());
			displayLineItems(order);
		}
		/*
		 * File htmlTemplateFile = new File("resources\\template.html"); String
		 * htmlString = FileUtils.readFileToString(htmlTemplateFile); String title =
		 * "New Page"; String body = "This is Body"; htmlString =
		 * htmlString.replace("$title", title); htmlString = htmlString.replace("$body",
		 * body); File newHtmlFile = new File("resources\\\\new.html");
		 * FileUtils.writeStringToFile(newHtmlFile, htmlString);
		 */
		
	}

	public static void displayLineItems(Order order) {
		List<LineItem> items=order.getItems();
		for (LineItem item : items) {
			System.out.println("\t\t Id:"+item.getId()+" Quantity:"+item.getQauntity()+" Name:"+item.getProduct().getName()+" Cost:"+item.getProduct().getCost()+" Discount Percent:"+item.getProduct().getDiscountPercent()+" Total Cost:"+item.itemCost());
		}
	}

}
