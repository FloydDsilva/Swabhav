package com.techlabs.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sachin");
		names.add("Virat");
		names.add("Yuvraj");
		names.add("Robin");
		Iterator<String> itr=names.iterator();
		while (itr.hasNext()) {
			String name = (String) itr.next();
			System.out.println(name);
			if(name.equals("Robin")) {
				itr.remove();
			}
		}
		System.out.println(names);
		
		names.add("Dhoni");
		names.add("Hardik");
		names.add("Rohit");
		names.add("Kapil");
		Iterator<String> itr1=names.iterator();
		while (itr1.hasNext()) {
			String name=(String)itr1.next();
			if(name.equals("Yuvraj")) {
				break;
			}
		}
		System.out.print("Names after Yuvraj:");
		itr1.forEachRemaining(System.out::print);
		System.out.println("\n"+names);
	}
}
