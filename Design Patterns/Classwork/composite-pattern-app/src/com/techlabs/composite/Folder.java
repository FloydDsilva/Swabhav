package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorable {
	private String name;
	private List<IStorable> items;
	
	public Folder(String name) {
		this.name = name;
		this.items = new ArrayList<IStorable>();
	}

	@Override
	public void display() {
		System.out.println("Name: "+name);
		for (IStorable item : items) {
			item.display();
		}
	}

	public void addItem(IStorable item) {
		items.add(item);
	}
	public String getName() {
		return name;
	}


	public List<IStorable> getItems() {
		return items;
	}

	
}
