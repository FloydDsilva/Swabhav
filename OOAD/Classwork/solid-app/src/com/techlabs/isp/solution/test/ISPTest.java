package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.IEatable;
import com.techlabs.isp.solution.IWorkable;
import com.techlabs.isp.solution.Manager;
import com.techlabs.isp.solution.Robot;

public class ISPTest {

	public static void main(String[] args) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		atWorkStation(manager);
		atCafeteria(manager);
		atWorkStation(robot);
	}

	private static void atCafeteria(IEatable x) {
		System.out.println("At Cafeteria");
		x.startEat();
		x.stopEat();
	}

	private static void atWorkStation(IWorkable x) {
		System.out.println("At Workstation");
		x.startWork();
		x.stopWork();
	}

}
