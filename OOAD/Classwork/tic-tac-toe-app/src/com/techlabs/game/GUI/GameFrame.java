package com.techlabs.game.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame{
	JButton[] cellButtons=new JButton[9];
	public GameFrame() {
		setSize(1024, 768);
		setTitle("Tic Tac Toe");
		JPanel main=new JPanel(new BorderLayout());
		JPanel boardPanel=new JPanel(new GridLayout(3,3));
		for(int i=0;i<9;i++) {
			cellButtons[i]=new JButton(""+i);
			boardPanel.add(cellButtons[i]);
		}
		boardPanel.setVisible(true);
		
		JPanel currentPlayerPanel=new JPanel();
		JLabel currentPlayer=new JLabel("Player : Sachin");
		currentPlayer.setPreferredSize(new Dimension(100,100));
		currentPlayerPanel.add(currentPlayer);
		
		JPanel statusPanel=new JPanel();
		JLabel currentStatus=new JLabel("Status : Progress");
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
}
