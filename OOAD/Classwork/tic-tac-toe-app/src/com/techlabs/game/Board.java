package com.techlabs.game;

public class Board {
	private Cell board[];

	public Board(Cell[] board) {
		this.board = board;
	}
	
	public void addMark(int position,Player player) {
		board[position]=new Cell(player.getMark());
	}
	
	public Cell[] getBoard() {
		return board;
	}
	
	public Cell getCell(int position) {
		return getBoard()[position];
	}
}
