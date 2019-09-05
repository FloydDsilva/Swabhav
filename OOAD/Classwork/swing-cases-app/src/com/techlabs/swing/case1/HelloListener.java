package com.techlabs.swing.case1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello! Button is pressed. Hence action is performed");
		
	}
	
}
