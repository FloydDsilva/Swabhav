package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.Bark;
import com.techlabs.dogdoor.BarkRecognizer;
import com.techlabs.dogdoor.DogDoor;
import com.techlabs.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowfl"));
		door.addAllowedBark(new Bark("rooowfl"));
		door.addAllowedBark(new Bark("rawfl"));
		door.addAllowedBark(new Bark("woof"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		// Simulate the hardware hearing of a bark
		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("rowfl"));

		// remote.pressButton();
		System.out.println("\nBruce has gone outside...");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {}
		System.out.println("\nBruce's all done...");
		System.out.println("...but he's stuck outside!");
		
		//Simulate the hardware hearing a bark (not Bruce!)
		Bark smallDogBark=new Bark("yip");
		System.out.println("A small dog is barking.");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {}
		
		//Simulate the hardware hearing a bark again
		System.out.println("\nBruce starts barking...");
		recognizer.recognize(new Bark("rooowfl"));
		
		// System.out.println("...so Gina grabs the remote control.");
		// remote.pressButton();
		System.out.println("\nBruce's back inside...");

	}

}
