package comm.techlabs.jframe.test;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import comm.techlabs.jframe.WelcomeFrame;

public class WelcomeFrameTest {

	public static void main(String[] args) {
		WelcomeFrame frame=new WelcomeFrame();
		JButton button=new JButton("Works");
		//button.setSize(100, 100);
		button.setBounds(200, 200, 100, 100);
		frame.add(button);
	}

}
