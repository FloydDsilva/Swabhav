package com.techlabs.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				close();
				timer.cancel(); // Timer object takes time to be destroyed by JVM
			}
		}, 5000);
	}

	public boolean isOpen() {
		return open;
	}

	public void close() {
		System.out.println("The dod door closes.");
		open = false;
	}
}
