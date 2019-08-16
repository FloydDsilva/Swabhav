package com.techlabs.contact.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactStore;

public class ContactUI {
	public void inputContact() {
		ContactStore store=new ContactStore();
		String firstName="",lastName="",email="",contact="";
		try {
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter First Name:");
			firstName=bf.readLine();
			System.out.println("Enter Last Name:");
			lastName=bf.readLine();
			System.out.println("Enter Email ID:");
			email=bf.readLine();
			System.out.println("Enter Contact:");
			contact = bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 store.addContact(new Contact(firstName, lastName, email, contact));
		 
	}
	public void displayContacts() {
		ArrayList<Contact> contacts=ContactStore.getContacts();
		  for(Contact contact:contacts) { System.out.println(contact); }
		//System.out.println(contacts.get(0));
	}
	
	public int inputChoice() {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		try {
			choice = Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return choice;
	}
	public String inputSearchString() {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name to search:");
		String searchString="";
		try {
			searchString=bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return searchString;
	}
	public void searchContacts() {
		String searchString=inputSearchString();
		ArrayList<Contact> searchedContacts=new ArrayList<Contact>();
		searchedContacts=new ContactStore().getSearchedContacts(searchString);
		displaySearchedContacts(searchedContacts);
	}
	public void displaySearchedContacts(ArrayList<Contact> searchedContacts) {
		  for(Contact contact:searchedContacts) { System.out.println(contact); }
		//System.out.println(contacts.get(0));
	}
	public void start() {
		int choice;
		do {
			prompt();
			choice=inputChoice();
			if(choice==1) {
				inputContact();
			}
			if(choice==2) {
				displayContacts();
			}
			if(choice==3) {
				searchContacts();
			}
		}while(choice!=4);
	}
	
	public void prompt() {
		System.out.println("Enter 1 to add Contact");
		System.out.println("Enter 2 to display Contacts");
		System.out.println("Enter 3 to Search");
		System.out.println("Enter 4 to Exit!");
		System.out.println("Enter your Choice:");
	}
}
