package com.techlabs.contact.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techlabs.contact.Contact;

public class ContactService {
	private Connection connection;
	private PreparedStatement preparedStatement;

	public ContactService() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/aurionpro?" + "user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public ArrayList<Contact> getSearchedContacts(String searchString) {
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		try {
			preparedStatement=connection.prepareStatement("Select * from contacts where FirstName=? or LastName=?");
			preparedStatement.setString(1, searchString);
			preparedStatement.setString(2, searchString);
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

}
