package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Book;

@Repository
public class BookRepository {
	@Autowired
	private SessionFactory sessionFactory;
	public BookRepository() {
		System.out.println("In book Repo Constructor");
	}
	
	public List<Book> getBooks() {
		List<Book> books=new ArrayList<Book>();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Book.class);
		books= (ArrayList<Book>) cr.list();
		
		
		transaction.commit();
		session.close();
		
		return books;
	}
}
