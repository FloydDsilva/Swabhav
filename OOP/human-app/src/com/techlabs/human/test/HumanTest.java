package com.techlabs.human.test;

import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human("Sachin", GenderCategory.MALE, 50, 1.2f, 60f);
		display(human);
		System.out.println("After Eating:");
		human.eat();
		display(human);
		System.out.println("After Workout");
		human.workout();
		display(human);
		Human human2 = new Human("Kohli", GenderCategory.MALE, 18);
		display(human2);
	}

	private static void display(Human human) {
		System.out.println("Name:" + human.getName() + " Gender:" + human.getGender() + " Age:" + human.getAge()
				+ " Height:" + String.format("%.2f", human.getHeight()) + " Weight:"
				+ String.format("%.2f", human.getWeight()) + " BMI:" + String.format("%.2f", human.calcBMI())
				+ " Body Category:" + human.getBodyCategory());
	}

}
