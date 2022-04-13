package com.simplilearn.stack.queue;

public class Test {

	public static void main(String[] args) {
		
		// create multiple employee objects
		Employee employee1 = new Employee(101, "Marry Smith", "Engineering", 223344);
		Employee employee2 = new Employee(102, "John Smith", "Engineering", 6776678);
		Employee employee3 = new Employee(103, "Tony Stark", "Test", 2342345);
		Employee employee4 = new Employee(104, "Will Smith", "Test", 25445644);
		Employee employee5 = new Employee(105, "Rohn Smith", "Dev", 7873344);

		// create queue
		ArrayQueue queue =new ArrayQueue(2);
		
		System.out.println("Queue size :: "+queue.size());
		System.out.println("Queue is empty :: "+queue.isEmpty());
		
		
		//add data into queue
		queue.add(employee1);
		queue.add(employee2);
		
		System.out.println("Queue size :: "+queue.size());
		System.out.println("Queue is empty :: "+queue.isEmpty());
		
		queue.add(employee3);
		queue.add(employee4);
		queue.add(employee5);
		
		System.out.println("-------------");
		System.out.println("Front element before:: "+queue.peek());		
		System.out.println("-------------");
		
		System.out.println("Removed Element :->  "+queue.remove());
		
		System.out.println("-------------");
		System.out.println("Front element after:: "+queue.peek());		
		System.out.println("-------------");
		
		queue.printQueue();
	}
}
