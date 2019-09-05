package com.techlabs.swing.case1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObservableFrame extends JFrame{
	private JButton helloButton;
	public ObservableFrame() {
		setSize(1024, 768);
		setVisible(true);
		setBackground(Color.RED);
		setTitle("ObservabeFrame");
		
		helloButton=new JButton("Hello");
		helloButton.setBounds(200, 200, 100, 100);
	}
	public JButton getHelloButton() {
		return helloButton;
	}
	
	
}
