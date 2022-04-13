package com.simplilearn.stack.linkedstack;

public class Test {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);

		// create stack
		LinkedStack stack = new LinkedStack();
		
		System.out.println("Stack size : "+stack.size());
		System.out.println("Stack is empty : "+stack.isEmpty());
		System.out.println("------------------");
		
		//add elements in stak.
		stack.push(employee1);
		stack.push(employee2);
		stack.push(employee3);
		stack.push(employee4);
		stack.push(employee5);
		
		System.out.println("Stack size : "+stack.size());
		System.out.println("Stack is empty : "+stack.isEmpty());
		
		System.out.println("Stack Top : "+stack.peek());
		System.out.println("------------------");
		System.out.println("Removed Top element : "+stack.pop());
		System.out.println("------------------");
		stack.printStack();
		
		
	}

}
