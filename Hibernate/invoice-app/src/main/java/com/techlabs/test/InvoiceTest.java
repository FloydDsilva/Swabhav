package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InvoiceTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory sessionFactory=cfg.configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();

	}

}
