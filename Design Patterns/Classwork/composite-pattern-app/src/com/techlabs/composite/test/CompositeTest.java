package com.techlabs.composite.test;

import com.techlabs.composite.File;
import com.techlabs.composite.Folder;

public class CompositeTest {

	public static void main(String[] args) {
		Folder root=new Folder("Movies");
		root.addItem(new File("abc", 10, "avi"));
		root.addItem(new File("pqr", 15, "avi"));
		
		Folder comedy=new Folder("Comedy");
		root.addItem(comedy);
		
		comedy.addItem(new File("lmno", 20, "mp4"));
		comedy.addItem(new File("pqr", 25, "mp4"));
		comedy.addItem(new File("stu", 30, "mp4"));
		
		root.display();
	}

}
