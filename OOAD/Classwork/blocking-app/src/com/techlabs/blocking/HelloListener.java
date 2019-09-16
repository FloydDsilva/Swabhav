package com.techlabs.blocking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class HelloListener implements ActionListener {
	BlockingFrame frame;
	public HelloListener(BlockingFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JDialog helloDialog=new JDialog(frame,"Hello");
		helloDialog.add(new JLabel("Hello"));
		helloDialog.setSize(300, 300);
		helloDialog.setVisible(true);
	}

}
