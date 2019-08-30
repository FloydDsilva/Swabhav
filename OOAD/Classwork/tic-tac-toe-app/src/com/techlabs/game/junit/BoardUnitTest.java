package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;

class BoardUnitTest {
	Board board=new Board(new Cell[9]);
	Player player=new Player("Sachin", Mark.X);
	@Test
	void MarkShouldBeAddedToCell() {
		board.addMark(1, player);
		assertEquals(Mark.X, board.getCell(1).getMark());
	}
	
	@Test
	void CellShouldBeNullIfNoMarkAdded() {
		board.addMark(1, player);
		try {
			assertEquals(null, board.getCell(2));
		}catch(NullPointerException e) {}
	}

	
	
	

}
