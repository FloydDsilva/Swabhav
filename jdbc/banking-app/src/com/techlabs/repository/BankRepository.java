package com.techlabs.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Account;
import com.techlabs.model.TransactionLog;

public class BankRepository {
	private static BankRepository repository;
	private Connection connection;
	private PreparedStatement preparedStatement;

	private BankRepository() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static BankRepository getInstance() {
		if (repository == null) {
			repository = new BankRepository();
		}
		return repository;
	}

	public void addAccount(Account account) throws SQLException {
		connection.setAutoCommit(false);
		preparedStatement = connection.prepareStatement("Insert into BankMaster values(?,?,?)");
		preparedStatement.setString(1, account.getName());
		preparedStatement.setString(2, account.getPassword());
		preparedStatement.setFloat(3, account.getAmount());
		preparedStatement.executeUpdate();
		preparedStatement = connection.prepareStatement("Insert into BankTransaction values(?,?,?,?)");
		preparedStatement.setString(1, account.getName());
		preparedStatement.setFloat(2, account.getAmount());
		preparedStatement.setString(3, "Deposit");
		preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
		preparedStatement.executeUpdate();
		System.out.println("Success");
		connection.commit();

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
			preparedStatement = connection.prepareStatement("Select balance from BankMaster where accName=?");
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				transactions.add(new TransactionLog(name, amount, transactionType, transactionDate));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
}
