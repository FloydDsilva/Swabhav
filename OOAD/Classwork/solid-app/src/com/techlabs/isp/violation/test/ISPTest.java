package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class ISPTest {

	public static void main(String[] args) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		atWorkStation(manager);
		atCafeteria(manager);
		atWorkStation(robot);
		atCafeteria(robot);			//LSP Violation
	}

	private static void atCafeteria(IWorker x) {
		System.out.println("At Cafeteria");
		x.startEat();
		x.stopEat();
	}

	private static void atWorkStation(IWorker x) {
		System.out.println("At Workstation");
		x.startWork();
		x.stopWork();
	}

}
