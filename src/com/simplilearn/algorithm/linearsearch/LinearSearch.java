package com.simplilearn.algorithm.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		// list of numbers
		int[] inputs = { 20 , 50, 35, -15, 7 ,3,-22, 11, 33};
		
		int value = 330;
		
		// If element present in the array return index or else return -1.
		int searchedIndex = linearSearch(inputs, value);
		
		if(searchedIndex>0) {
			System.out.println("The Search Element : "+ value +" is found at index : " +searchedIndex);
		}else {
			System.out.println("The search element does not exist.");
		}
	}

	// linear time complexity
	private static int linearSearch(int[] inputs, int value) {
		// iterate over each element
		for (int index = 0; index < inputs.length; index++) {
			// match search
			if(inputs[index]==value) {
				return index;
			}
		}
		return -1;
	}

}
