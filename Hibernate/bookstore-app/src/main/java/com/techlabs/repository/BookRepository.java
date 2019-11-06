package com.techlabs.repository;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Book;
import com.techlabs.model.Customer;

@Repository
public class BookRepository {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	public BookRepository() {
		System.out.println("In book Repo Constructor");
	}
	
	public List<Book> getBooks() {
		List<Book> books=new ArrayList<Book>();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Book.class);
		//cr.add(Restrictions.eq("category", "Thriller"));
		books= (ArrayList<Book>) cr.list();
		
		
		transaction.commit();
		session.close();
		
		return books;
	}
	public Blob getImage(String id) {
		session = sessionFactory.openSession();
		Book book = (Book) session.get(Book.class, UUID.fromString(id));
		session.close();
		return book.getImage();

	}
	public Book getBookById(String id) {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Book.class);
		cr.add(Restrictions.eq("id", UUID.fromString(id)));
		Book book=(Book) cr.uniqueResult();
		
		
		transaction.commit();
		session.close();
		
		return book;
	}
	
	public void addCustomer(String username, String password, String email, int age, String gender, long mobileNumber, String location) {
		Customer cust = new Customer();
		cust.setUsername(username);
		cust.setPassword(password);
		cust.setEmail(email);
		cust.setAge(age);
		cust.setGender(gender);
		cust.setMobileNumber(mobileNumber);
		cust.setLocation(location);
		
		session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(cust);
		
		txn.commit();
		session.close();
	}
	
	public boolean isUsernameTaken(String username){
		session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Customer cust = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("username", username)).uniqueResult();
		txn.commit();
		session.close();
		
		if(cust != null)
			return true;
		return false;	
	}
	
	public String getPassword(String username){
		session = sessionFactory.openSession();
		Customer cust = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("username", username)).uniqueResult();
		session.close();
		System.out.println(cust.getPassword());
		return cust.getPassword();
	}

}
