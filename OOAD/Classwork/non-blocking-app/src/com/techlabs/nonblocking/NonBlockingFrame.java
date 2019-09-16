package com.techlabs.nonblocking;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class NonBlockingFrame extends JFrame {
	JButton helloBtn;
	JButton printBtn;
	JDialog helloDialog;
	public NonBlockingFrame() {
		setSize(1024, 768);
		setVisible(true);
		
		helloBtn=new JButton("Hello");
		helloBtn.setBounds(200, 200, 100, 50);
		printBtn=new JButton("Print");
		printBtn.setBounds(400, 200, 100, 50);
		
		add(helloBtn);
		add(printBtn);
		
		helloBtn.addActionListener(new HelloListener(this));
		printBtn.addActionListener(new PrintListener(this));
		
		
	}
}
