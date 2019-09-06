package com.techlabs.composite;

public class File implements IStorable {
	
	private final String name;
	private final int size;
	private final String type;
	
	
	public File(String name, int size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	@Override
	public void display() {
		System.out.println("Name: "+name+" Size: "+size+" Type: "+type);
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	
}
