package com.techlabs.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.techlabs.model.Account;

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
		if(repository==null) {
			repository=new BankRepository();
		}
		return repository;
	}
	
	public void addAccount(Account account) {
		try {
			connection.setAutoCommit(false);
			preparedStatement=connection.prepareStatement("Insert into BankMaster values(?,?,?)");
			preparedStatement.setString(1, account.getName());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setFloat(3, account.getAmount());
			preparedStatement.executeUpdate();
			preparedStatement=connection.prepareStatement("Insert into BankTranscation values(?,?,?,?)");
			preparedStatement.setString(1, account.getName());
			preparedStatement.setFloat(2, account.getAmount());
			preparedStatement.setString(3, "Deposit");
			preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
			preparedStatement.executeUpdate();
			System.out.println("Success");
			connection.commit();
		} catch (SQLException e) {
			System.out.println(" Transaction Failed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
