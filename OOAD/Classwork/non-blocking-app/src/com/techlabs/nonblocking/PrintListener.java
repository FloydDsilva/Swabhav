package com.techlabs.nonblocking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PrintListener implements ActionListener {
	NonBlockingFrame frame;
	public PrintListener(NonBlockingFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
					LocalDateTime currentTime=LocalDateTime.now();
					System.out.println(dtf.format(currentTime));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}				
			}
		}).start();
	}

}
