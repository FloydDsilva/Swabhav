package com.techlabs.number.guessing;

public class GuessingGame {
	public final int answer;
	
	public GuessingGame() {
		this.answer = (int)(Math.random()*(100-1))+1;
	}

	public int getAnswer() {
		return answer;
	}
	
	public int compareAnswer(int guess) {
		if(guess>answer) {
			return 1;
		}
		if(guess==answer) {
			return 0;
		}
		return -1;
	}
	
	
}
