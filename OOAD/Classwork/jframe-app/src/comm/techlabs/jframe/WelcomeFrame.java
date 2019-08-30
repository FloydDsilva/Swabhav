package comm.techlabs.jframe;

import java.awt.Color;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame{
	public WelcomeFrame() {
		this.setSize(1024, 768);
		this.setVisible(true);
		this.setBackground(Color.RED);
		this.setTitle("Floyd");
		this.getContentPane().setBackground(Color.BLUE);
	}
	
	
}
