package com.techlabs.arraylist.crud;

import java.util.ArrayList;

public class ArrayListCrud {
	private final ArrayList<String> arrayList;

	public ArrayListCrud(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
	
	public void create(String value) {
		arrayList.add(value);
	}
	
	public void read() {
		for(String value:arrayList) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	public void update(String value,int position) {
		arrayList.set(position, value);
	}
	
	public void delete(int position) {
		arrayList.remove(position);
	}
}
