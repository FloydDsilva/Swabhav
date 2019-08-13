package com.techlabs.arraylist.nongeneric.test;

import java.util.ArrayList;

public class ArraylistTestNonGen {

	public static void main(String[] args) {
		ArrayList array=new ArrayList();
		array.add(new Integer(1));
		array.add(new Integer(2));
		array.add(new Integer(3));
		array.add(new Integer(4));
		array.add(new Integer(5));
		for(int i=0;i<array.size();i++) {
			Integer integer=(Integer) array.get(i);
			System.out.print(integer+" ");
			int in=(int) array.get(i);
			System.out.print(in+" ");
		}
	}

}
