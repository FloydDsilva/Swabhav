package com.techlabs.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;

@Repository
public class BankRepository {
	@Autowired
	private SessionFactory sessionFactory;
	public BankRepository() {
		System.out.println("In bank Repo Constructor");

	}


	public void addAccount(String name,String password,float amount) throws SQLException {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Account accountNew=new Account();
		accountNew.setName(name);
		accountNew.setPassword(password);
		accountNew.setAmount(amount);
		TransactionLog transactionLog=new TransactionLog();
		transactionLog.setAmount(amount);
		transactionLog.setTransactionType("Deposit");
		transactionLog.setTransactionDate(Date.valueOf(LocalDate.now()));
		transactionLog.setAcc(accountNew);
		Set<TransactionLog> transactions=new HashSet<TransactionLog>();
		transactions.add(transactionLog);
		accountNew.setTransactions(transactions);
		session.save(accountNew);
		transaction.commit();
		session.close();		
		System.out.println("Success");

	}

	public String getPassword(String name) {
		String password = "";
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Criteria cr = session.createCriteria(Account.class);
		cr.add(Restrictions.eq("name", name));
		Account account= (Account) cr.uniqueResult();
		if(account!=null) {
			password=account.getPassword();
		}
		transaction.commit();
		session.close();		
		return password;
	}
	
	public float getBalance(String name) {
		float balance = 0;
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Criteria cr = session.createCriteria(Account.class);
		cr.add(Restrictions.eq("name", name));
		Account account= (Account) cr.uniqueResult();
		if(account!=null) {
			balance=account.getAmount();
		}
		transaction.commit();
		session.close();
		return balance;
	}
	
	public void deposit(String name,float amount) throws SQLException {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Account.class);
		cr.add(Restrictions.eq("name", name));
		Account account= (Account) cr.uniqueResult();
		
		TransactionLog transactionLog=new TransactionLog();
		transactionLog.setAmount(amount);
		transactionLog.setTransactionType("Deposit");
		transactionLog.setTransactionDate(Date.valueOf(LocalDate.now()));
		transactionLog.setAcc(account);
		
		
		account.setAmount(account.getAmount()+amount);
		
		session.save(transactionLog);
		transaction.commit();
		session.close();		
		System.out.println("Deposit Success");
	}
	
	public void withdraw(String name,float amount) throws SQLException {
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Account.class);
		cr.add(Restrictions.eq("name", name));
		Account account= (Account) cr.uniqueResult();
		
		TransactionLog transactionLog=new TransactionLog();
		transactionLog.setAmount(amount);
		transactionLog.setTransactionType("Withdraw");
		transactionLog.setTransactionDate(Date.valueOf(LocalDate.now()));
		transactionLog.setAcc(account);
		
		
		account.setAmount(account.getAmount()-amount);
		
		session.save(transactionLog);
		transaction.commit();
		session.close();		
		System.out.println("Withdraw Success");
	}
	
	public List<TransactionLog> getTransactions(String name) {
		List<TransactionLog> transactions=new ArrayList<TransactionLog>();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria cr = session.createCriteria(Account.class);
		cr.add(Restrictions.eq("name", name));
		Account account= (Account) cr.uniqueResult();
		
		Criteria cr2 = session.createCriteria(TransactionLog.class);
		cr.add(Restrictions.eq("acc", account));
		transactions=cr2.list();
		
		transaction.commit();
		session.close();
		
		return transactions;
	}
	
	public boolean isValidName(String name) {
		boolean isValid=true;
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Account> accounts=new ArrayList<Account>();
		Account account = (Account) session.createCriteria(Account.class).add(Restrictions.eq("name", name)).uniqueResult();
		System.out.println(account);
		if(account!=null) {
			isValid=false;
		}
		transaction.commit();
		session.close();
		return isValid;
	}
	
}
