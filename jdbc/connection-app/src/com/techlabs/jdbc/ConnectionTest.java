package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?"+"user=root&password=root");
			DatabaseMetaData data=connection.getMetaData();
			System.out.println("User: "+data.getUserName());
			//System.out.println("Server: "+connection.);
			System.out.println("Database: "+data.getDatabaseProductName());
			//System.out.println("Time: "+connection.getNetworkTimeout());
			System.out.println(connection.getClass());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				
			}
		}
		
	}

}
