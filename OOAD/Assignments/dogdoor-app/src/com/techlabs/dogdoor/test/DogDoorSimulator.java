package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.DogDoor;
import com.techlabs.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println();
		remote.pressButton();
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");
		
		try {
			Thread.currentThread().sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("...but he's stuck outside!");
			System.out.println("\nFido starts barking...");
			System.out.println("...so Gina ggrabs the remote control.");
			remote.pressButton();
			System.out.println("\nFido's back inside...");
		}
	}

}
