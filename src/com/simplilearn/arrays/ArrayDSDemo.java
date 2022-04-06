package com.simplilearn.arrays;

public class ArrayDSDemo {

	public static void main(String[] args) {

		int[] numbers = {10, 20, 30, 90, 12, 57, 78, 100 };
		
		displayForward(numbers);
		System.out.println("----------------");
		displayReverse(numbers);
	}
	
	// forward iteration
	private static void displayForward(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("The index : "+ index + " and value "+ numbers[index]);
		}
	}
	
	// reverse iteration
	private static void displayReverse(int[] numbers) {
		for (int index = numbers.length-1 ; index >=0; index--) {
			System.out.println("The index : "+ index + " and value "+ numbers[index]);
		}
	}
	
}
