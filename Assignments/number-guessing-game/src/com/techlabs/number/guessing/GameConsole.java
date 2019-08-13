package com.techlabs.number.guessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameConsole {
	public int getPlayerInput() {
		System.out.println("Enter your Guess:");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int number=0;
		try {
			number=Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}
	public String getHint(int flag) {
		if(flag==1) {
			return "Too High";
		}
		if(flag==0) {
			return "Success!!";
		}
		return "Too Low";
	}
	public void startGame() {
		int guess;
		GuessingGame game=new GuessingGame();
		do {
			guess=getPlayerInput();
			String hint=getHint(game.compareAnswer(guess));
			System.out.println(hint);
		}while(game.compareAnswer(guess)!=0);
	}
}
