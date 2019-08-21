package com.techlabs.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import com.techlabs.lineitem.LineItem;
import com.techlabs.lineitem.comparators.ItemCostComparator;
import com.techlabs.lineitem.comparators.NameComparator;

public class TreesSetTest {

	public static void main(String[] args) {
		TreeSet<LineItem> itemHash=new TreeSet<LineItem>(new ItemCostComparator());
		
		LineItem book1=new LineItem("Books", 2, 1000, 3);
		LineItem book2=new LineItem("Pen", 1, 50, 3);
		LineItem book3=new LineItem("Pencil", 3, 10, 3);
		
		itemHash.add(book1);
		itemHash.add(book2);
		itemHash.add(book3);
		
		display(itemHash);
		
		
	}

	private static void display(TreeSet<LineItem> itemHash) {
		for (LineItem lineItem : itemHash) {
			System.out.println(lineItem);
		}
	}

}
