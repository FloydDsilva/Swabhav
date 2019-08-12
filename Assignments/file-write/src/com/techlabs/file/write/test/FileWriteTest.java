package com.techlabs.file.write.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter(
					"resources\\TestText.txt");
			fileWriter.write("My Name is Floyd Jospeh D'silva.\n");
			fileWriter.write("I have a Bachelor in Engineering\n");
			fileWriter.write("I completed my degree from Mumbai University at St. Francis Institute of Technology");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Working");
	}

}
