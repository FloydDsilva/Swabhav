package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	private ContactRepository contactRepository;
	public ContactService() {
		contactRepository=new ContactRepository();
	}
	public List<Contact> getContacts() {
		return contactRepository.getContacts();
	}
	public void addContact(Contact contact) {
		contactRepository.addContact(contact);
	}
	
}
