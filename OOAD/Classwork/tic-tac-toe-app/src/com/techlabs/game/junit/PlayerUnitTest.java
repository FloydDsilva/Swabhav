package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.*;


class PlayerUnitTest {
	Player player =new Player("Sachin", Mark.X);
	@Test
	void PlayerShouldHaveAName() {
		assertEquals("Sachin", player.getName());
	}

	@Test
	void PlayerShouldHaveAMark() {
		assertEquals(Mark.X, player.getMark());
	}
	
}
