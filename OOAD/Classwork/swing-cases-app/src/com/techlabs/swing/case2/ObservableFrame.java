package com.techlabs.swing.case2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObservableFrame extends JFrame{
	private JButton helloButton;
	private JButton exitbutton;
	public ObservableFrame() {
		setSize(1024, 768);
		setVisible(true);
		getContentPane().setBackground(Color.black);
		setTitle("ObservabeFrame");
		
		helloButton=new JButton("Hello");
		helloButton.setBounds(200, 200, 100, 100);
		add(helloButton);
		
		exitbutton=new JButton("Exit");
		exitbutton.setBounds(500, 200, 100, 100);
		add(exitbutton);
	}
	public JButton getHelloButton() {
		return helloButton;
	}
	public JButton getExitbutton() {
		return exitbutton;
	}
}
