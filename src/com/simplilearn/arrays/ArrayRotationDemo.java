package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayRotationDemo {

	public static void main(String[] args) {

		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		
		System.out.println("Before Rotation :>");
		System.out.println(Arrays.toString(items));
		
		rotate(items , 5);
		
		System.out.println("After Rotation :>");
		System.out.println(Arrays.toString(items));
	}

	private static void rotate(int[] items, int rotateCount) {
		
		// create a temp array
		int temp[] = new int[rotateCount];
		
		// copy elements into temp[] based on rotateCount
		for (int index = 0; index < rotateCount; index++) {
			temp[index] = items[index];
		}
		
		// shift actual array elements
		for (int index = rotateCount; index < items.length; index++) {
			items[index-rotateCount]  = items[index];
		}
		
		// copy the temp data elements inot actual array
		for (int index = 0; index < rotateCount; index++) {
			items[index+items.length-rotateCount] = temp[index];
		}
	}

}
