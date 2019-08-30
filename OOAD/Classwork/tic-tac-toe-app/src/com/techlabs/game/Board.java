package com.techlabs.game;

public class Board {
	private Cell board[];

	public Board(Cell[] board) {
		this.board = board;
	}
	
	public void addMark(int position,Player player) {
		///if(board[position]==null)			for Future validation of addding same place
		board[position]=new Cell(player.getMark());
		
	}
	
	public Cell[] getBoard() {
		return board;
	}
	
	public Cell getCell(int position) {
		return getBoard()[position];
	}
}
