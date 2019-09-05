package com.techlabs.swing.case2.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlabs.swing.case2.CommonListener;
import com.techlabs.swing.case2.ObservableFrame;



public class Case2Test {

	public static void main(String[] args) {
		ObservableFrame frame=new ObservableFrame();
		JButton helloButton=frame.getHelloButton();
		helloButton.addActionListener(new CommonListener(frame));
		
		JButton exitButton=frame.getExitbutton();
		exitButton.addActionListener(new CommonListener(frame));
		
		//frame.add(helloButton);
		//frame.add
		
	}

}
