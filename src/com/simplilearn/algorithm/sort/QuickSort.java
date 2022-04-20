package com.simplilearn.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		// list of unsorted numbers
		int[] inputs = { 20, 35, -15, 5, 55, 2, -18, 10, 33 };

		System.out.println("Before : " + Arrays.toString(inputs));

		int start = 0;
		int end = inputs.length;

		quickSort(inputs, start, end);

		System.out.println("After : " + Arrays.toString(inputs));

	}

	private static void quickSort(int[] inputs, int start, int end) {
		// break logic for breaking recursion
		if (end - start < 2) {
			return;
		}
		
		// create partition based on pivot element
		int pivotIndex = partition(inputs, start, end);
		
		// call quickSort for first half
		quickSort(inputs, start, pivotIndex);
		
		// call quickSort for second half
		quickSort(inputs, pivotIndex+1, end);
	}

	private static int partition(int[] inputs, int start, int end) {
		// find pivot
		int pivot = inputs[start];
		
		// temp variable
		int i = start;
		int j = end;
		
		while(i<j) {
			
			// empty body while for element greater then pivot
			while(i<j && inputs[--j]>= pivot);
			
			if (i < j) {
				inputs[i]= inputs[j];
			}
			
			// empty body while for element less then pivot
			while(i<j && inputs[++i]<= pivot);
			
			if (i < j) {
				inputs[j]= inputs[i];
			}
		}
		inputs[j] = pivot;
		return j;
	}

}
