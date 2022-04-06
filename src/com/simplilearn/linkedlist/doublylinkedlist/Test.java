package com.simplilearn.linkedlist.doublylinkedlist;


public class Test {

	public static void main(String[] args) {
		
		// create employees objects
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);

		// create doubly linked lsit
		DoublyLinkedList list = new DoublyLinkedList();
		
		System.out.println("List size :: "+list.size());
		System.out.println("List is empty :: "+list.isEmpty());
		System.out.println("---------------");
		
		// add element into list 
		list.addFirst(employee1);
		list.addFirst(employee2);
		list.addFirst(employee3);
		
		System.out.println("List size :: "+list.size());
		System.out.println("List is empty :: "+list.isEmpty());
		System.out.println("---------------");
		
		list.addLast(employee4);
		list.addLast(employee5);
		list.printList();
		System.out.println("---------------");
		
		list.removeFirst();
		list.removeLast();
		list.printList();
	}

}
