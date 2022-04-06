package com.simplilearn.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	
	// create node params
	private Node head;
	private Node tail;
	private int size;
	
	// doubly linked list operation
	// get size
	public int size() {
		return size;
	}
	
	// is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element at start
	public void addFirst(Employee data) {
		// create a node
		Node node = new Node(data);
		if(isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}		
		head = node;
		size++;
	}
	
	// add element at last
	public void addLast(Employee data) {
		// create a node
		Node node = new Node(data);
		if(isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}		
		tail = node;
		size++;
	}
		
	// remove element from start
	public Node removeFirst() {
		if(isEmpty()) {
			return null;
		}
		Node remove = head;
		// only one element in list
		if(head.getNext() ==null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		remove.setNext(null);
		return remove;
	}
	
	// remove element from last
	public Node removeLast() {
		if(isEmpty()) {
			return null;
		}
		Node remove = tail;
		// only one element in list
		if(tail.getPrevious() ==null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		remove.setNext(null);
		return remove;
	}
	
	// print list
	public void printList() {
		Node current = head;
		System.out.println("Head =>");
		while(current != null) {
			System.out.println(current.getData());
			System.out.println("< = >");
			current = current.getNext();
		}
		System.out.println("<= Tail");
	}
}
