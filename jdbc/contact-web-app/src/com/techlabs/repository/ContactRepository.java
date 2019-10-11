package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.techlabs.model.Contact;


public class ContactRepository {
	private Connection connection;
	private PreparedStatement preparedStatement;
	public ContactRepository() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Contact> getContacts() {
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		try {
			preparedStatement=connection.prepareStatement("Select * from contacts");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				contacts.add(new Contact(resultSet.getString("FirstName"), resultSet.getString("LastName"), resultSet.getString("Email"), resultSet.getString("Contact")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contacts;

	}

	public void addContact(Contact contact) {
		try {
			preparedStatement=connection.prepareStatement("Insert into contacts values(?,?,?,?)");
			preparedStatement.setString(1, contact.getContact());
			preparedStatement.setString(2, contact.getFirstName());
			preparedStatement.setString(3, contact.getLastName());
			preparedStatement.setString(4, contact.getEmail());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
