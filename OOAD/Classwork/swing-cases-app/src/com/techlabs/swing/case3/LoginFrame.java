package com.techlabs.swing.case3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	static String nameString="Abc";
	JTextField username;
	JTextField password;
	JButton loginButton;
	
	public LoginFrame() {
		setSize(1024, 768);
		
		//getContentPane().setBackground(Color.BLUE);
		setTitle("Login Page");
		
		JLabel usernameLabel =new JLabel("Username");
		usernameLabel.setBounds(250, 200, 100, 30);
		JLabel passwordLabel =new JLabel("Password");
		passwordLabel.setBounds(250, 250, 100, 30);
		add(usernameLabel);
		add(passwordLabel);
		
		username=new JTextField();
		username.setBounds(350, 200, 200, 30);
		password=new JTextField();
		password.setBounds(350, 250, 200, 30);
		add(username);
		add(password);
		
		loginButton=new JButton("Login");
		loginButton.setBounds(325, 300, 150, 50);
		loginButton.addActionListener(new LoginValidator(this));
		add(loginButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public JTextField getUsername() {
		return username;
	}
	public JTextField getPassword() {
		return password;
	}
	
}
