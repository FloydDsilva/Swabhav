package com.techlabs.crud.test;

import java.util.ArrayList;

import com.techlabs.arraylist.crud.ArrayListCrud;

public class ArrayListCrudTest {

	public static void main(String[] args) {
		ArrayListCrud names=new ArrayListCrud(new ArrayList<String>());
		names.create("Sachin");
		names.read();
		names.create("Virat");
		names.read();
		names.update("Yuraj", 1);
		names.read();
		names.delete(0);
		names.read();
	}

}
