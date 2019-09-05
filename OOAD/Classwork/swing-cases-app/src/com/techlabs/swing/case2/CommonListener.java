package com.techlabs.swing.case2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class CommonListener implements ActionListener {
	private ObservableFrame frame;
	
	public CommonListener(ObservableFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Hello") {			//Using Button Name
			JDialog dialog = new JDialog();
			JLabel label = new JLabel("Hello !!!");
			dialog.add(label);
			dialog.setSize(200, 200);
			dialog.setVisible(true);
		}
		if(e.getSource() == frame.getExitbutton())		//Using Button Object
			System.exit(0);
	}
}

