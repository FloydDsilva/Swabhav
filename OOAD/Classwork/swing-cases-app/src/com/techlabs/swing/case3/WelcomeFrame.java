package com.techlabs.swing.case3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends JFrame{
	public WelcomeFrame(String username) {
		setSize(1024, 768);
		setTitle("Welcome Page");
		
		JLabel welcomeLabel =new JLabel("Welcome "+username+"!");
		welcomeLabel.setBounds(150, 200, 150, 50);
		add(welcomeLabel);
		
		JLabel welcomeLabel2 =new JLabel("Welcome "+LoginFrame.nameString+"!");
		welcomeLabel2.setBounds(100, 200, 150, 50);
		add(welcomeLabel2);
		setVisible(true);
	}
}
