package com.techlabs.assgn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class AssignmentReflect {
	public static void reflect(Class cls) {
		System.out.println("Class Name:"+cls.getName());
		Method[] methods=cls.getDeclaredMethods();
		System.out.println("Total Methods="+methods.length);
		int count=0,getter_count=0,setter_count=0;
		String[] object_func= {"wait","equals","toString","hashCode","getClass","notify","notifyAll"};
		ArrayList<String> array_func=new ArrayList<String>();
		for(String func:object_func) {
			array_func.add(func);
		}
		for(Method method:methods) {
			
			/*
			 if(method.getName()!="wait"&&method.getName()!="equals"&&method.getName()!=
			  "toString"&&method.getName()!="hashCode"&&method.getName()!="getClass"&&
			  method.getName()!="notify"&&method.getName()!="notifyAll") { count++; }
			*/
			if(!array_func.contains(method.getName())) {
				count++;
			}
			String s=method.getName().substring(0,3);
			if(s.equals("get")&&method.getName()!="getClass") {
				getter_count++;
			}
			if(s.equals("set")) {
				setter_count++;
			}
		}
		System.out.println("Defined Method="+count);
		System.out.println("Getter Method="+getter_count);
		System.out.println("Setter Method="+setter_count);
		Constructor[] constructors=cls.getConstructors();
		System.out.println("Constructors:"+constructors.length);
	}
}

