package com.simplilearn.linkedlist.circularlinkedlist;

public class CircularLinkedList {
	
	// create head node
	private Node head;
	private Node tail;
	private int size;
	
	// circular linked list operation
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element  :: tail
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list empty
		if(isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		// add element in tail
		tail = node;
		// for circular linked list tail next node -> head
		tail.setNext(head);
		size++;
	}
	
	// remove element  :: head
	public Node remove() {
		if(isEmpty()) {
			return null;
		}
		Node remove = head;
		// set next node in list as head node	
		head = head.getNext();
		size--;
		// set head as new node
		remove.setNext(null);
		tail.setNext(head);
		return remove;
	}
	
	// print list
	public void printList() {
		Node current = head;
		if(current == null) {
			System.out.println("Circulat Linked list is empty");
		} else {
			System.out.println("Head =>");
			do {
				if(current != null) {
					System.out.println(current.getData());
					System.out.println(" => ");
					current = current.getNext();
				}
			} while(current != head) ;
			System.out.println(" Null");
		}
		
	}
}
