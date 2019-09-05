package com.techlabs.swing.case1.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlabs.swing.case1.HelloListener;
import com.techlabs.swing.case1.ObservableFrame;
import com.techlabs.swing.case1.ThankyouListener;


public class Case1Test {

	public static void main(String[] args) {
		ObservableFrame frame=new ObservableFrame();
		JButton helloButton=frame.getHelloButton();
		helloButton.addActionListener(new HelloListener());
		helloButton.addActionListener(new ThankyouListener());
		frame.add(helloButton);
		
	}

}
