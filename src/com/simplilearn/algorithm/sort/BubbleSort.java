package com.simplilearn.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// list of unsorted numbers
		int[] inputs = { 20, 35, -15, 5, 55, 2, -18, 10, 33 };

		System.out.println("Before : " + Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	private static void bubbleSort(int[] inputs) {
		// outer for loop for iterating over un-sorted portion.
		for (int lastUnsortedIndex = inputs.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
			for (int index = 0; index < lastUnsortedIndex; index++) {
				if(inputs[index]>inputs[index+1]) {
					swap(inputs, index, index+1);
				}
			}
		}
	}

	private static void swap(int[] inputs, int a, int b) {
		if (a == b) {
			return;
		}
		int tmp = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = tmp;
	}
}
