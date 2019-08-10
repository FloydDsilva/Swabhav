package com.techlabs.player;

public class Player {
	private final String name;
	private final int age;
	private final int id;
	
	public Player(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
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

	public Player whoIsElder(Player player) {
		if(this.age>player.age) {
			return this;
		}
		return player;
	}
	
	

}
