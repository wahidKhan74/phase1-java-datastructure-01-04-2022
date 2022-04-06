package com.simplilearn.linkedlist;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {

	public static void main(String[] args) {

		// create multiple employee objects
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);

		// create linked list :: java collection :: doubly linked list
		LinkedList<Employee> empList = new LinkedList<Employee>();

		// add employee
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);

		System.out.println(empList);

		// add element in start : head
		empList.addFirst(employee4);
		System.out.println(empList);

		// add element in end : tail
		empList.addLast(employee5);
		System.out.println(empList);
		
		// remove  elements
		empList.removeFirst();
		empList.removeLast();
		System.out.println(empList);

	}

}
