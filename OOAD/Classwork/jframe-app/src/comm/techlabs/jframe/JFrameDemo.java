package comm.techlabs.jframe;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameDemo {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Floyd");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		frame.setBackground(Color.RED);
		//frame.getContentPane().setBackground(Color.BLUE);
	}

}
