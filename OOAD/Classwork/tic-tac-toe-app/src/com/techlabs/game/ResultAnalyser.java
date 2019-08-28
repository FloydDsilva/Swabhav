package com.techlabs.game;

public class ResultAnalyser {
	private Result result;
	private Board board;
	public ResultAnalyser(Board board) {
		this.board = board;
	}
	public void checkResult() {
		//For Row
		try {
			for(int i=0;i<=6;i+=3) {
				if((markAt(i)==markAt(i+1))&&(markAt(i+1)==markAt(i+2))){
					result=Result.WIN;
				}
			}
			
		}catch (NullPointerException e) {
		}
		try {
			//For Column
			for(int i=0;i<=2;i++) {
				if((markAt(i)==markAt(i+3))&&(markAt(i+3)==markAt(i+6))){
					result=Result.WIN;
				}
			}
			
		}catch (NullPointerException e) {
		}
		try {
			//For Diagonal
			if((markAt(0)==markAt(4))&&(markAt(4)==markAt(8))||(markAt(2)==markAt(4))&&(markAt(4)==markAt(6))) {
				result=Result.WIN;
			}
			checkDraw();
			
		}catch (NullPointerException e) {
		}
	}
	
	private void checkDraw() {
		int firstnull=0;
		try {
			while(firstnull!=9&&board.getBoard()[firstnull]!=null) {
				firstnull+=1;
			}
			
		}catch (NullPointerException e) {
		}
		
		if(firstnull==9&&result!=Result.WIN) {
			result=Result.DRAW;
		}
	}
	
	public Result getResult() {
		return result;
	}
	
	public Mark markAt(int position) {
		return board.getCell(position).getMark();
	}
}
