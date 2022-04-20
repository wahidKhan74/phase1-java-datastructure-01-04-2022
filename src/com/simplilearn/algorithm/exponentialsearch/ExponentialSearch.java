package com.simplilearn.algorithm.exponentialsearch;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		// sorted array
		int[] inputs = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		// search value
		int value = -15;

		// If element present in the array return index or else return -1.
		int searchedIndex = exponentialSearch(inputs, value);

		if(searchedIndex>0) {
			System.out.println("The Search Element : "+ value +" is found at index : " +searchedIndex);
		}else {
			System.out.println("The search element does not exist.");
		}
	}

	// logarithmic time complexity
	private static int exponentialSearch(int[] inputs, int value) {
		// start with index 0 and it is the search value
		if(inputs[0]==value) {
			return 0;
		}
		// find the range in which elements may reside :: doubling method
		int i = 1;
		while(i<inputs.length && inputs[i]<= value) {
			i = i*2;
		}
		// apply binary search on found range.
		return Arrays.binarySearch(inputs, i/2, Math.min(i, inputs.length), value);
	}

}
