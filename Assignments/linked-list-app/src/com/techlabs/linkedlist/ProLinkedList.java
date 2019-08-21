package com.techlabs.linkedlist;

public class ProLinkedList<T> {
	private int count;
	private Node<T> header;
	private Node<T> last;
	
	public void add(Node<T> node) {
		count+=1;
		if(header!=null) {
			last.setNext(node);
			last=node;
		}
		if(header==null) {
			header=node;
			last=node;
		}
	}
	
	public void add(T value) {
		count+=1;
		Node<T> valueNode=new Node<T>(value);
		if(header!=null) {
			last.setNext(valueNode);
			last=valueNode;
		}
		if(header==null) {
			header=valueNode;
			last=valueNode;
		}
	}
	
	public void display() {
		Node<T> current=header;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current=current.getNext();
		}
		System.out.println();
	}
	
	public int getCount() {
		return count;
	}
	
	public void remove(Node<T> node) {
		count-=1;
		Node<T> current=header.getNext();
		Node<T> previous=header;
		//Delete Start node
		if(header.getData()==node.getData()) {
				header=current;
		}
		else {
			//Find node to be deleted
			while(current.getData()!=node.getData()) {
				current=current.getNext();
				previous=previous.getNext();
			}
			//Delete Last Node
			if(current.getNext()==null) {
				previous.setNext(null);
			}
			//Delete Internal Node
			else {
				previous.setNext(current.getNext());
			}
		}
	}
	
	public void remove(T value) {
		count-=1;
		Node<T> current=header.getNext();
		Node<T> previous=header;
		//Delete Start node
		if(header.getData()==value) {
				header=current;
		}
		else {
			//Find node to be deleted
			while(current.getData()!=value) {
				current=current.getNext();
				previous=previous.getNext();
			}
			//Delete Last Node
			if(current.getNext()==null) {
				previous.setNext(null);
			}
			//Delete Internal Node
			else {
				previous.setNext(current.getNext());
			}
		}
	}
}
