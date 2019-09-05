package com.techlabs.game.GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerFrame extends JFrame{
	static String nameString="Abc";
	JTextField player1;
	JTextField player2;
	JButton playButton;
	
	public PlayerFrame() {
		setSize(1024, 768);
		
		//getContentPane().setBackground(Color.BLUE);
		setTitle("Login Page");
		
		JLabel player1Label =new JLabel("Player1");
		player1Label.setBounds(250, 200, 100, 30);
		JLabel player2Label =new JLabel("Player2");
		player2Label.setBounds(250, 250, 100, 30);
		add(player1Label);
		add(player2Label);
		
		player1=new JTextField();
		player1.setBounds(350, 200, 200, 30);
		player2=new JTextField();
		player2.setBounds(350, 250, 200, 30);
		add(player1);
		add(player2);
		
		playButton=new JButton("Login");
		playButton.setBounds(325, 300, 150, 50);
		//loginButton.addActionListener(new LoginValidator(this));
		add(playButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public JTextField getUsername() {
		return player1;
	}
	public JTextField getPassword() {
		return player2;
	}
	
}
