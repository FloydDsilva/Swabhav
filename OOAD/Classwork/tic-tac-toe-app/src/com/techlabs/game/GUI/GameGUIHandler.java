package com.techlabs.game.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JDialog;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyser;

public class GameGUIHandler implements ActionListener {

	GameFrame gameFrame;
	Game tictactoe;
	public GameGUIHandler(GameFrame gameFrame) {
		this.gameFrame=gameFrame;
		tictactoe = gameFrame.getGame();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		((JButton)e.getSource()).setFont(new Font("Arial", Font.BOLD, 50));
		((JButton)e.getSource()).setText(tictactoe.getCurrentPlayer().getMark().toString());
		((JButton)e.getSource()).setEnabled(false);
		System.out.println(e.getActionCommand());
		tictactoe.play(Integer.parseInt(e.getActionCommand()));
		tictactoe.getAnalyser().checkResult();
		if(tictactoe.getAnalyser().getResult() == Result.WIN) {
			gameFrame.getCurrentStatus().setText("Winner " + tictactoe.getCurrentPlayer().getName()+" !");
			JButton[] cells=gameFrame.getCellButtons();
			for (JButton cell : cells) {
				cell.setEnabled(false);
			}
		}
		if(tictactoe.getAnalyser().getResult() == Result.DRAW){
			gameFrame.getCurrentStatus().setText("Status : Draw!!");
		}
		gameFrame.getCurrentPlayer().setText("Player : "+tictactoe.getCurrentPlayer().getName());
	}

	
}
