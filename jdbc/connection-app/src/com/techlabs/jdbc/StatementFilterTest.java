package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementFilterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		String studId = sc.next();
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from student where id=" + studId + "");
			if (!resultSet.next()) {
				System.out.println("No Record Found");
				resultSet = statement.executeQuery("Select * from student where id=" + studId + " or 1=1");
			}
			resultSet.beforeFirst();
			if (resultSet.next()){
				System.out.println("id\tname\tcgpa\tlocation\tdescription");
				resultSet.beforeFirst();
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					float cgpa = resultSet.getFloat("cgpa");
					String location = resultSet.getString("location");
					String description = resultSet.getString("description");
					System.out.println(id + "\t" + name + "\t" + cgpa + "\t" + location + "\t" + description);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
