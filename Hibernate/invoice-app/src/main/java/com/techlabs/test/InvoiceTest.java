package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Ordr;

public class InvoiceTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory sessionFactory=cfg.configure().buildSessionFactory();
		
		Customer c1=new Customer();
		c1.setId(1);
		c1.setName("Sachin");
		c1.setLocation("Malad");
		Customer c2=new Customer();
		c2.setId(2);
		c2.setName("Virat");
		c2.setLocation("Virar");
		
		Ordr order=new Ordr();
		order.setId(1);
		order.setCust(c1);
		Ordr order2=new Ordr();
		order2.setId(2);
		order2.setCust(c1);
		Ordr order3=new Ordr();
		order3.setId(3);
		order3.setCust(c2);
		Ordr order4=new Ordr();
		order4.setId(4);
		order4.setCust(c2);
		
		Set<Ordr> orders=new HashSet<Ordr>();
		orders.add(order);
		orders.add(order2);
		c1.setOrders(orders);
		Set<Ordr> orders2=new HashSet<Ordr>();
		orders2.add(order3);
		orders2.add(order4);
		c2.setOrders(orders2);
		
		//Order1
		LineItem lineItem=new LineItem();
		lineItem.setId(1);
		lineItem.setName("bread");
		lineItem.setQuantity(2);
		lineItem.setOdr(order);
		//ordr2
		LineItem lineItem2=new LineItem();
		lineItem2.setId(2);
		lineItem2.setName("milk");
		lineItem2.setQuantity(1);
		lineItem2.setOdr(order2);
		LineItem lineItem3=new LineItem();
		lineItem3.setId(3);
		lineItem3.setName("sugar");
		lineItem3.setQuantity(1);
		lineItem3.setOdr(order2);
		//o3
		LineItem lineItem4=new LineItem();
		lineItem4.setId(4);
		lineItem4.setName("chips");
		lineItem4.setQuantity(2);
		lineItem4.setOdr(order3);
		//o4
		LineItem lineItem5=new LineItem();
		lineItem5.setId(5);
		lineItem5.setName("bread");
		lineItem5.setQuantity(2);
		lineItem5.setOdr(order4);
		LineItem lineItem6=new LineItem();
		lineItem6.setId(6);
		lineItem6.setName("butter");
		lineItem6.setQuantity(1);
		lineItem6.setOdr(order4);
		
		Set<LineItem> lineItems=new HashSet<LineItem>();
		lineItems.add(lineItem);
		order.setLineItems(lineItems);
		Set<LineItem> lineItems2=new HashSet<LineItem>();
		lineItems2.add(lineItem2);
		lineItems2.add(lineItem3);
		order2.setLineItems(lineItems2);
		Set<LineItem> lineItems3=new HashSet<LineItem>();
		lineItems3.add(lineItem4);
		order3.setLineItems(lineItems3);
		Set<LineItem> lineItems4=new HashSet<LineItem>();
		lineItems4.add(lineItem5);
		lineItems4.add(lineItem6);
		order4.setLineItems(lineItems4);
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		transaction.commit();
		session.close();

	}

}
