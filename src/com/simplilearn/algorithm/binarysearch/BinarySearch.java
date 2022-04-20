package com.simplilearn.algorithm.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {

		// sorted array
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		// search value
		int value = -15;

		// If element present in the array return index or else return -1.
		int searchedIndex = binarySearch(inputs, value);
		
		if(searchedIndex>0) {
			System.out.println("The Search Element : "+ value +" is found at index : " +searchedIndex);
		}else {
			System.out.println("The search element does not exist.");
		}
	}

	// iterative search :: logarithmic time complexity
	private static int binarySearch(int[] inputs, int value) {
		
		int start = 0;
		int end = inputs.length-1;
		
		while(start<=end) {
			// find midpoint 
			int midpoint = ( start + end ) /2;
			
			// midpoint is search value
			if(inputs[midpoint]==value) {
				return midpoint;
			}
			// search in right half
			else if(inputs[midpoint]<value) {
				start = midpoint+1;
			}
			// search in left half
			else {
				end = midpoint-1;
			}
		}
		return -1;
	}

}
