package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Cell;
import com.techlabs.game.Mark;

class CellUnitTest {
	Cell cell=new Cell(Mark.X);
	@Test
	void MarkShouldBeStoredInCell() {
		assertEquals(Mark.X, cell.getMark());
	}

}
