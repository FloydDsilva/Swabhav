package com.techlabs.crud;

public class AddressDB implements ICrudable{
	@Override
	public void create() {
		System.out.println("Address Created");
	}

	@Override
	public void read() {
		System.out.println("Address Read");
	}

	@Override
	public void update() {
		System.out.println("Address Updated");

	}

	@Override
	public void delete() {
		System.out.println("Address Deleted");
	}
}
