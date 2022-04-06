package com.simplilearn.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private Employee[] stack;
	private int top;
	
	// create a stack
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	// capacity
	public int capacity() {
		return stack.length;
	}
	
	// is empty
	public boolean isEmpty() {
		return top == 0;
	}
	
	// size 
	public int size() {
		return top;
	}
	
	// push :-> add elements
	public void push(Employee data) {
		// stack is full -> increase capacity of the stack
		if(top==stack.length) {
			// double stack size
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}
		// add value in stack
		stack[top++]= data;
	}
	
	// pop :-> remove element
	public Employee pop() {
		// is empty stack
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee remove= stack[--top];
		stack[top] = null;
		return remove;
	}
	
	// peek : print top element
	public Employee peek() {
		// verify stack is empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	// print stack
	public void printStack() {
		System.out.println(" Top => ");
		for (int index = top-1; index >= 0; index--) {
			System.out.println(stack[index]);
		}
	}
}
