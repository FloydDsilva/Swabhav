package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.BarkRecognizer;
import com.techlabs.dogdoor.DogDoor;
import com.techlabs.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		// Remote remote = new Remote(door);

		// Simulate the hardware hearing of a bark
		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");

		// remote.pressButton();
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("...but he's stuck outside!");
		System.out.println("\nFido starts barking...");
		recognizer.recognize("Woof");
		// System.out.println("...so Gina grabs the remote control.");
		// remote.pressButton();
		System.out.println("\nFido's back inside...");

	}

}
