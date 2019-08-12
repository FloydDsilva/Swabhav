package com.techlabs.player;

public class Player {
	private final String name;
	private final int age;
	private final int id;
	private static int count;
	
	static{
		count=0;
		System.out.println("Inside staic block");
	}
	
	public Player(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
		count++;
	}

	public Player(String name, int id) {
		this(name,18,id);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}
	
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int headCount() {
		return count;
	}
	public Player whoIsElder(Player player) {
		if(this.age>player.age) {
			return this;
		}
		return player;
	}
	
	

}
