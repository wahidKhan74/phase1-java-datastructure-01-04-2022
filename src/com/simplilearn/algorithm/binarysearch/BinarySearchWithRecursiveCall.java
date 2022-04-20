package com.simplilearn.algorithm.binarysearch;

public class BinarySearchWithRecursiveCall {

	public static void main(String[] args) {

		// sorted array
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		// search value
		int value = 55;
		int start = 0;
		int end = inputs.length - 1;

		// If element present in the array return index or else return -1.
		int searchedIndex = binarySearch(inputs, start, end, value);
		
		if(searchedIndex>0) {
			System.out.println("The Search Element : "+ value +" is found at index : " +searchedIndex);
		}else {
			System.out.println("The search element does not exist.");
		}

	}

	// binary search with recursion 
	private static int binarySearch(int[] inputs, int start, int end, int value) {
		//breaking condition :: search value does exist
		if(start> end) {
			return -1;
		}
		// find midpoint
		int midpoint = (start + end) / 2;

		// midpoint is search value
		if (inputs[midpoint] == value) {
			return midpoint;
		}
		// search in right half
		else if (inputs[midpoint] < value) {
			// start = midpoint + 1;
			return binarySearch(inputs, midpoint+1, end, value);
		}
		// search in left half
		else {
			// end = midpoint-1;
			return binarySearch(inputs, start, midpoint-1 , value);
		}		
	}

}
