package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1=new Player("Sachin", 10, 101);
		display(p1);
		Player p2=new Player("Kohli", 102);
		display(p2);
		Player elder=p1.whoIsElder(p2);
		System.out.println("Elder is:");
		display(elder);
	}

	private static void display(Player player) {
		System.out.println("Player Name:"+player.getName()+" Age:"+player.getAge()+" Player Id:"+player.getId());
	}

}
