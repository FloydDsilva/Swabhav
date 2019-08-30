package com.techlabs.game;

public class ResultAnalyser {
	private Result result;
	private Board board;
	public ResultAnalyser(Board board) {
		this.board = board;
		result=Result.PROGRESS;
	}
	public void checkResult() {
			
		
			//For Diagonal
			if(matchDiagonals()) {
				result=Result.WIN;
			}
			if(!matchDiagonals()) {
				//For Row
				for(int i=0;i<=6;i+=3) {
					if((markAt(i)==markAt(i+1))&&(markAt(i+1)==markAt(i+2))&&(markAt(i+2)!=null)){
						result=Result.WIN;
					}
				}
				//For Column
				for(int i=0;i<=2;i++) {
					if((markAt(i)==markAt(i+3))&&(markAt(i+3)==markAt(i+6))&&(markAt(i+6)!=null)){
						result=Result.WIN;
					}
				}
			}
			
			checkDraw();
	}
	
	private boolean matchDiagonals() {
		return ((markAt(0)==markAt(4))&&(markAt(4)==markAt(8))&&(markAt(8)!=null)||(markAt(2)==markAt(4))&&(markAt(4)==markAt(6))&&(markAt(6)!=null));
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
		Mark mark=null;
		try {
			mark= board.getCell(position).getMark();
		}catch (NullPointerException e) {
		}
		return mark;
	}
	
	
	
}
