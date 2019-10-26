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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;

@Repository
public class BankRepository {
	private Connection connection;
	private PreparedStatement preparedStatement;
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
		Set<TransactionLog> transactions=HashSet<TransactionLog>();
		transactions.add(transactionLog);
		transaction.commit();
		session.close();		
		System.out.println("Success");

	}

	public String getPassword(String name) {
		String password = "";
		try {
			preparedStatement = connection.prepareStatement("Select accPassword from BankMaster where accName=?");
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			password = resultSet.getString("accPassword");
			System.out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}
	
	public float getBalance(String name) {
		float password = 0;
		try {
			preparedStatement = connection.prepareStatement("Select balance from BankMaster where accName=?");
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			password = resultSet.getFloat("balance");
			System.out.println("Balance Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}
	public void deposit(String name,float amount) throws SQLException {
		connection.setAutoCommit(false);
		preparedStatement = connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
		preparedStatement.setString(1, name);
		preparedStatement.setFloat(2, amount);
		preparedStatement.setString(3, "Deposit");
		preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
		preparedStatement.executeUpdate();
		preparedStatement = connection.prepareStatement("Update BankMaster set balance=balance+? where accName=?");
		preparedStatement.setFloat(1, amount);
		preparedStatement.setString(2, name);
		preparedStatement.executeUpdate();
		System.out.println("Success");
		connection.commit();
	}
	public void withdraw(String name,float amount) throws SQLException {
		connection.setAutoCommit(false);
		preparedStatement = connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
		preparedStatement.setString(1, name);
		preparedStatement.setFloat(2, amount);
		preparedStatement.setString(3, "Deposit");
		preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
		preparedStatement.executeUpdate();
		preparedStatement = connection.prepareStatement("Update BankMaster set balance=balance-? where accName=?");
		preparedStatement.setFloat(1, amount);
		preparedStatement.setString(2, name);
		preparedStatement.executeUpdate();
		System.out.println("Withdraw Success");
		connection.commit();
	}
	public List<TransactionLog> getTransactions(String name) {
		List<TransactionLog> transactions=new ArrayList<TransactionLog>();
		try {
			preparedStatement = connection.prepareStatement("Select * from BankTransaction where accName=?");
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				//transactions.add(new TransactionLog(resultSet.getString("accName"), resultSet.getFloat("amount"), resultSet.getString("transactionType"), resultSet.getDate("transactionDate")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
}
