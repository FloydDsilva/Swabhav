package com.techlabs.game.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.ResultAnalyser;

public class GameFrame extends JFrame{
	JButton[] cellButtons=new JButton[9];
	JLabel currentPlayer;
	JLabel currentStatus;
	
	Player player1 ,player2 ;
	Board board;
	Game tictactoe;
	
	public GameFrame() {
		setGameBase();
		setSize(1024, 768);
		setTitle("Tic Tac Toe");
		JPanel main=new JPanel(new BorderLayout());
		JPanel boardPanel=new JPanel(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			cellButtons[i]=new JButton(""+i);
			cellButtons[i].addActionListener(new GameGUIHandler(this));
			boardPanel.add(cellButtons[i]);
		}
		boardPanel.setVisible(true);
		
		JPanel currentPlayerPanel=new JPanel();
		currentPlayer=new JLabel("Player : "+tictactoe.getCurrentPlayer().getName());
		currentPlayer.setPreferredSize(new Dimension(100,100));
		currentPlayerPanel.add(currentPlayer);
		
		JPanel statusPanel=new JPanel();
		currentStatus=new JLabel("Status : Progress");
		currentStatus.setBorder(new EmptyBorder(30, 0, 0, 0));
		statusPanel.setPreferredSize(new Dimension(100,100));
		statusPanel.add(currentStatus);
		
		JPanel leftPanel=new JPanel();
		leftPanel.setPreferredSize(new Dimension(100,100));
		
		JPanel rightPanel=new JPanel();
		rightPanel.setPreferredSize(new Dimension(100,100));
		
		main.add(rightPanel,BorderLayout.WEST);
		main.add(leftPanel,BorderLayout.EAST);
		main.add(statusPanel,BorderLayout.SOUTH);
		main.add(currentPlayerPanel,BorderLayout.NORTH);
		main.add(boardPanel,BorderLayout.CENTER);
		add(main);
		setVisible(true);
	}
	
	public void setGameBase() {
			player1 = new Player(PlayerFrame.player1Name, Mark.X);
			player2 = new Player(PlayerFrame.player2Name, Mark.O);
			
			board = new Board(new Cell[9]);
			tictactoe = new Game(player1, player2, board, new ResultAnalyser(board));
	}
	public JButton[] getCellButtons() {
		return cellButtons;
	}
	
	public Game getGame() {
		return tictactoe;
	}
	public JLabel getCurrentPlayer() {
		return currentPlayer;
	}

	public JLabel getCurrentStatus() {
		return currentStatus;
	}
	
}
