package com.simplilearn.stack.queue;

public class ArrayQueue {

	private int front;
	private int rear;
	private Employee[] queue;

	// create a constructor to create a queue.
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// capacity
	public int capacity() {
		return queue.length;
	}

	// is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	// size
	public int size() {
		return rear - front;
	}

	// add
	public void add(Employee data) {
		// queue is full -> increase capacity of the stack
		if (rear == queue.length) {
			// double queue size
			Employee[] newArr = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		// add value in queue
		queue[rear++] = data;
	}

	// remove
	public Employee remove() {
		// Verify queue is empty
		if (size() == 0) {
			rear = 0;
			front = 0;
			return null;
		}
		// remove element from the queue
		Employee employee = queue[front];
		queue[front] = null;
		front++;
		return employee;
	}

	// peek
	public Employee peek() {
		// Verify queue is empty
		if (size() == 0) {
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}

	// print queue
	public void printQueue() {
		System.out.println("Fornt ->");
		for (int index = front; index < rear; index++) {
			System.out.println(queue[index]);
		}
		System.out.println("<- Rear");
	}
}
