package com.simplilearn.linkedlist.singlylinkedlist;

import java.security.spec.EncodedKeySpec;

public class SinglyLinkedList {
	
	// create head node
	private Node head;
	private int size;
	
	// singly linked list operation
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element  :: head
	public void addFirst(Employee data) {
		// create a node
		Node node = new Node(data);
		// set next node		
		node.setNext(head);
		// set head as new node
		head = node;
		size++;
	}
	
	// remove element  :: head
	public Node removeFirst() {
		if(isEmpty()) {
			return null;
		}
		Node remove = head;
		// set next node in list as head node	
		head = head.getNext();
		size--;
		// set head as new node
		remove.setNext(null);
		return remove;
	}
	
	// print list
	public void printList() {
		Node current = head;
		System.out.println("HEAD =>");
		while(current != null) {
			System.out.println(current.getData());
			System.out.println(" => ");
			current = current.getNext();
		}
		System.out.println(" Null");
	}
}
