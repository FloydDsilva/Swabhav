package com.techlabs.set;

import java.util.HashSet;

import com.techlabs.lineitem.LineItem;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<LineItem> itemHash=new HashSet<LineItem>();
		
		LineItem book1=new LineItem("Books", 2, 100, 3);
		LineItem book2=new LineItem("Books", 2, 100, 3);
		LineItem book3=new LineItem("Books", 2, 100, 3);
		
		itemHash.add(book1);
		itemHash.add(book2);
		itemHash.add(book3);
		
		
		
		System.out.println(book1);
		
		System.out.println(itemHash.size());
	}
	

}
