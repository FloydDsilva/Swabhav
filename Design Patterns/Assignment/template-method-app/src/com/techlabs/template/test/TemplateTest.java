package com.techlabs.template.test;

import com.techlabs.template.Cricket;
import com.techlabs.template.Football;
import com.techlabs.template.Game;

public class TemplateTest {
	public static void main(String[] args) {
		Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();
	}
}
