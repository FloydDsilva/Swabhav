package com.techlabs.game.test;

import java.io.BufferedReader;
import java.util.Scanner;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyser;

public class TicTacToeTest {

	public static void main(String[] args) {
		Player player1 = new Player("Sachin", Mark.X);
		Player player2 = new Player("Virat", Mark.O);
		Board board = new Board(new Cell[9]);
		Game tictactoe = new Game(player1, player2, board, new ResultAnalyser(board));
		Scanner sc = new Scanner(System.in);
		System.out.print(tictactoe.getCurrentPlayer().getName() + ":");
		tictactoe.play(sc.nextInt());
		tictactoe.getAnalyser().checkResult();

		while (tictactoe.getAnalyser().getResult() == Result.PROGRESS) {
			System.out.print(tictactoe.getCurrentPlayer().getName() + ":");
			int position = sc.nextInt();
			tictactoe.play(position);
		}
		if (tictactoe.getAnalyser().getResult() == Result.WIN) {
			System.out.println("Winner " + tictactoe.getCurrentPlayer().getName()+"!");
		} else {
			System.out.println("Draw!!!");
		}
	}
}
