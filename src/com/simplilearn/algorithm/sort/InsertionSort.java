package com.simplilearn.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		// list of unsorted numbers
		int[] inputs = { 20, 35, -15, 5, 55, 2, -18, 10, 33 };

		System.out.println("Before : " + Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	private static void insertionSort(int[] inputs) {
		// iterate from start position 0
		for (int firstUnosrtedIndex = 0; firstUnosrtedIndex < inputs.length; firstUnosrtedIndex++) {
			int element = inputs[firstUnosrtedIndex];
			int index;
			for (index = firstUnosrtedIndex; index >0 && inputs[index-1]> element; index--) {
				inputs[index] = inputs[index-1];
			}
			inputs[index] = element;
		}		
	}

}
