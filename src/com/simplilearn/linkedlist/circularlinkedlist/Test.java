package com.simplilearn.linkedlist.circularlinkedlist;

public class Test {

	public static void main(String[] args) {
		
		// create employees objects
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);
		
		// create a employee singly linked list
		CircularLinkedList list = new CircularLinkedList();
		
		System.out.println("List is empty :: "+list.isEmpty());
		System.out.println("List size :: "+list.getSize());
		System.out.println("------------------");
		
		// add element in list
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		System.out.println("List is empty :: "+list.isEmpty());
		System.out.println("List size :: "+list.getSize());
		System.out.println("------------------");
		list.add(employee4);
		list.add(employee5);
		
		list.printList();
		
		System.out.println("------------------");
		list.remove();
		list.printList();
	}

}
