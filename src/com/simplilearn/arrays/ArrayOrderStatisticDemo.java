package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOrderStatisticDemo {

	public static void main(String[] args) {

		Integer[] items = { -15, 20, 3, 50, 26, 24, 78, 90 };

		int position = 3;

		// find the kth smallest in the list
		int response1 = findKthSmallest(items, position);
		System.out.println(" The position '" + position + "' smallest element is " + response1);

		// find the kth largest in the list
		int response2 = findKthLargest(items, position);
		System.out.println(" The position '" + position + "' largest element is " + response2);

	}

	private static int findKthLargest(Integer[] items, int position) {
		// sort array in ascending order
		Arrays.sort(items);
		
		//soer an array in desc order
		// Arrays.sort(items, Collections.reverseOrder());
		  
		return items[items.length - position];
	}

	private static int findKthSmallest(Integer[] items, int position) {
		// sort array in ascending order
		Arrays.sort(items);
		return items[position - 1];
	}

}
