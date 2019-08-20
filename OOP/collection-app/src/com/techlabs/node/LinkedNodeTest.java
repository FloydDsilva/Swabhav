package com.techlabs.node;

public class LinkedNodeTest {

	public static void main(String[] args) {
		Node<String> alphaA=new Node<String>("A");
		Node<String> alphaB=new Node<String>("B");
		Node<String> alphaC=new Node<String>("C");
		Node<String> alphaD=new Node<String>("D");
		
		alphaA.setNext(alphaB);
		alphaB.setNext(alphaC);
		alphaC.setNext(alphaD);
		
		printDetails(alphaA);
	}

	private static void printDetails(Node<String> node) {
		while(node!=null) {
			System.out.println(node.getData());
			node=node.getNext();
		}
	}

}
