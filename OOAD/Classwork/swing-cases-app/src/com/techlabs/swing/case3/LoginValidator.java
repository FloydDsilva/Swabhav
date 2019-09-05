package com.techlabs.swing.case3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginValidator implements ActionListener {
	private LoginFrame loginFrame;
	
	public LoginValidator(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String userName = loginFrame.getUsername().getText();
        String password = loginFrame.getPassword().getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
        	LoginFrame.nameString=userName;
            new WelcomeFrame(userName);
        } else {
        	loginFrame.username.setText("");
        	loginFrame.password.setText("");
        }
	}

}
