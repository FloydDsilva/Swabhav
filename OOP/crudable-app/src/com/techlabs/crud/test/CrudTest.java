package com.techlabs.crud.test;

import com.techlabs.crud.AddressDB;
import com.techlabs.crud.CustomerDB;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDB;

class CrudTest {

	public static void main(String[] args) {
		doDBOperations(new InvoiceDB());
		doDBOperations(new CustomerDB());
		doDBOperations(new AddressDB());
	}

	private static void doDBOperations(ICrudable x) {
		System.out.println("Doing class DB Operation");
		x.create();
		x.read();
		x.update();
		x.delete();
	}

}
