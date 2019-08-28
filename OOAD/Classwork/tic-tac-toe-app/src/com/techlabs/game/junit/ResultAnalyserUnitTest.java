package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyser;

class ResultAnalyserUnitTest {
	Board board=new Board(new Cell[9]);
	Player player=new Player("sachin", Mark.X);
	Player player2=new Player("virat",Mark.O);
	@Test
	void ResultShouldBeSetToWinIfGameWon() {
		board.addMark(0, player);
		board.addMark(1, player);
		board.addMark(2, player);
		ResultAnalyser analyzer=new ResultAnalyser(board);
		analyzer.checkResult();
		assertEquals(Result.WIN, analyzer.getResult());
	}
	
	@Test
	void ResultShouldBeSetToDrawIfGameIsDraw() {
		board.addMark(0, player);
		board.addMark(1, player2);
		board.addMark(2, player2);
		board.addMark(3, player2);
		board.addMark(4, player);
		board.addMark(5, player);
		board.addMark(6, player);
		board.addMark(7, player);
		board.addMark(8, player2);
		ResultAnalyser analyzer=new ResultAnalyser(board);
		analyzer.checkResult();
		assertEquals(Result.DRAW, analyzer.getResult());
	}
}
