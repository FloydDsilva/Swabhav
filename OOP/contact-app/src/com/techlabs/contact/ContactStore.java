package com.techlabs.contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ContactStore {
	private static ArrayList<Contact> contacts=new ArrayList<Contact>();
	
	public void addContact(Contact contact) {
		File file=new File("resources\\contacts.ser");
		if(file.length()!=0) {
			contacts=loadContacts();
		}
		contacts.add(contact);
		saveContacts(contacts);
	}
	public static ArrayList<Contact> getContacts() {
		File file=new File("resources\\contacts.ser");
		if(file.length()!=0) {
			contacts=loadContacts();
		}
		if(file.length()==0) {
			System.out.println("File Empty");
		}
		if(file.length()!=0) {
			System.out.println("File is not Empty");
		}
		return contacts;
	}
	private static void saveContacts(ArrayList<Contact> contacts) {
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("resources\\contacts.ser"))){
			out.writeObject(contacts);
			//out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Contact> loadContacts() {
		ArrayList<Contact> contacts=null;
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("resources\\contacts.ser"));
			contacts=(ArrayList<Contact>) in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contacts;
	}
	public ArrayList<Contact> getSearchedContacts(String searchString) {
		ArrayList<Contact> searchedContacts=new ArrayList<Contact>();
		ArrayList<Contact> allContacts=getContacts();
		for(Contact contact:allContacts) {
			if(searchString.equalsIgnoreCase(contact.getFirstName()) || searchString.equalsIgnoreCase(contact.getLastName())) {
				searchedContacts.add(contact);
			}
		}
		return searchedContacts;
	}
	
}
