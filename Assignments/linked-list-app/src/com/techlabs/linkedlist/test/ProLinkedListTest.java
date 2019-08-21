package com.techlabs.linkedlist.test;

import com.techlabs.linkedlist.Node;
import com.techlabs.linkedlist.ProLinkedList;

public class ProLinkedListTest {

	public static void main(String[] args) {
		ProLinkedList<String> alphabets = new ProLinkedList<String>();
		alphabets.add(new Node<String>("A"));

		alphabets.add(new Node<String>("B"));
		alphabets.add(new Node<String>("C"));
		alphabets.add(new Node<String>("D"));
		alphabets.add(new Node<String>("E"));
		alphabets.display();
		alphabets.remove(new Node<String>("C"));
		alphabets.display();
		alphabets.remove("E");
		alphabets.display();
		System.out.println("Count:" + alphabets.getCount());

		ProLinkedList<Integer> numbers = new ProLinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.display();
		System.out.println("Count:" + numbers.getCount());
	}

}
