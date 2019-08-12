package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1=new Player("Sachin", 10, 101);
		display(p1);
		System.out.println("Player count:"+p1.getCount());
		Player p2=new Player("Kohli", 102);
		display(p2);
		System.out.println("Player count:"+p1.getCount());
		Player p3=new Player("Ganguly", 103);
		display(p3);
		System.out.println("Player count:"+p1.getCount());
		System.out.println("Player head count:"+Player.headCount());
	}

	private static void display(Player player) {
		System.out.println("Player Name:"+player.getName()+" Age:"+player.getAge()+" Player Id:"+player.getId());
	}

}
