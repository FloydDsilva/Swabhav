package com.techlabs.game;

public class Game {
	private Player player[]=new Player[2];
	private Player currentPlayer;
	private Board board;
	private ResultAnalyser analyser;
	
	public Game(Player player1, Player player2, Board board, ResultAnalyser analyser) {
		this.player[0] = player1;
		this.player[1] = player2;
		this.currentPlayer=player1;
		this.board = board;
		this.analyser = analyser;
	}
	
	private void swapCurrent() {
		if(currentPlayer==player[0]) {
			currentPlayer=player[1];
			return;
		}
		currentPlayer=player[0];
	}
	
	public void play(int position) {
		board.addMark(position, currentPlayer);
		analyser.checkResult();
		if(analyser.getResult()==Result.PROGRESS) {
			swapCurrent();
		}
	}

	public Player[] getPlayer() {
		return player;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Board getBoard() {
		return board;
	}

	public ResultAnalyser getAnalyser() {
		return analyser;
	}
	
}
