package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandler {
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	public TransactionHandler() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void transfer(int amount) {
		try {
			connection.setAutoCommit(false);
			preparedStatement=connection.prepareStatement("Update customer set balance=balance-? where cid=1");
			preparedStatement.setInt(1, amount);
			preparedStatement.executeUpdate();
			preparedStatement=connection.prepareStatement("Update merchant set balance= balance+? where mid=1");
			preparedStatement.setInt(1, amount);
			preparedStatement.executeUpdate();
			System.out.println("Success");
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Transaction Failed");
			//e.printStackTrace();
		}
		
	}

}
