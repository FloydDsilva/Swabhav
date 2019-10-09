package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {

		Connection connection=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?"+"user=root&password=root");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("Select * from student");
			System.out.println("id\tname\tcgpa\tlocation\tdescription");
			
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				float cgpa=resultSet.getFloat("cgpa");
				String location=resultSet.getString("location");
				String description=resultSet.getString("description");
				System.out.println(id+"\t"+name+"\t"+cgpa+"\t"+location+"\t"+description);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
