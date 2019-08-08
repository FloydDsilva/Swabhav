package com.techlabs.assgn.reflect.test;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.techlabs.assgn.Rectangle;
import com.techlabs.assgn.reflection.AssignmentReflect;

public class AssignmentReflectionAPI {
	public static void main(String[] args) {
		// Reflect using Object
		Rectangle rect = new Rectangle();
		Class cls = rect.getClass();
		AssignmentReflect.reflect(cls);

		//PrintStream ps = new PrintStream(System.out);
		Class cls1 = PrintStream.class;
		AssignmentReflect.reflect(cls1);

		// Reflect using Class
		try {
			Class cls2 = Class.forName("com.techlabs.assgn.Rectangle");
			AssignmentReflect.reflect(cls2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			AssignmentReflect.reflect(Class.forName("java.io.PrintStream"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
