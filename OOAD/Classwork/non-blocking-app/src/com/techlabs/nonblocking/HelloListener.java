package com.techlabs.nonblocking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class HelloListener implements ActionListener {
	NonBlockingFrame frame;
	public HelloListener(NonBlockingFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				JDialog helloDialog=new JDialog(frame,"Hello");
				helloDialog.add(new JLabel("Hello"));
				helloDialog.setSize(300, 300);
				helloDialog.setVisible(true);
			}
		}).start();
	}

}
