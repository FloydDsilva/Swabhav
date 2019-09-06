package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>,Iterable<T>{
	private LinkedList<T> queue;

	public QueueAdapter() {
		this.queue = new LinkedList<T>();
	}

	@Override
	public void enqueue(T item) {
		queue.addLast(item);
	}

	@Override
	public T dequeue() {
		return queue.removeLast();
	}

	@Override
	public int count() {
		return queue.size();
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}
	
}
