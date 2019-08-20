package com.techlabs.set;

import java.util.HashSet;
import java.util.TreeSet;

import com.techlabs.lineitem.LineItem;

public class TreesSetTest {

	public static void main(String[] args) {
		TreeSet<LineItem> itemHash=new TreeSet<LineItem>();
		
		LineItem book1=new LineItem("Books", 2, 100, 3);
		LineItem book2=new LineItem("Books", 2, 100, 3);
		LineItem book3=new LineItem("Books", 2, 100, 3);
		
		itemHash.add(book1);
		itemHash.add(book2);
		itemHash.add(book3);
		

	}

}
