package com.techlabs.crud;

public class InvoiceDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Invoice Created");
	}

	@Override
	public void read() {
		System.out.println("Invoice Read");
	}

	@Override
	public void update() {
		System.out.println("Invoice Updated");
	}

	@Override
	public void delete() {
		System.out.println("Invoice Deleted");
	}

}
