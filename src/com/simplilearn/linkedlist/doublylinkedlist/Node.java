package com.simplilearn.linkedlist.doublylinkedlist;

public class Node {
	
	private Node previous;
	private Employee data;
	private Node next;
	
	// create a node
	public Node(Employee data) {
		super();
		this.data = data;
	}

	// public get and set methods
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
	
}
