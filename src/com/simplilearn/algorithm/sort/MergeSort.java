package com.simplilearn.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// list of unsorted numbers
		int[] inputs = { 20, 35, -15, 5, 55, 2, -18, 10, 33 };

		System.out.println("Before : " + Arrays.toString(inputs));
		
		int start = 0;
		int end = inputs.length;
		
		mergeSort(inputs, start, end);
		
		System.out.println("After : " + Arrays.toString(inputs));


	}

	private static void mergeSort(int[] inputs, int start, int end) {
		// break logic for breaking recursion
		if(end-start<2) {
			return ;
		}
		// 1. divide array element
		int midpoint = (start+end)/2;
		
		// call mergeSort for first half
		mergeSort(inputs, start, midpoint);
		
		// call mergeSort for second half
		mergeSort(inputs, midpoint, end);
		
		// 2. call merge
		merge(inputs, start, midpoint, end);
	}

	private static void merge(int[] inputs, int start, int midpoint, int end) {
		
		if(inputs[midpoint-1] <= inputs[midpoint]) {
			return ;
		}
		
		int i = start;
		int j = midpoint;
		int k = 0;
		
		int[] temp = new int[end-start];
		
		while(i<midpoint && j< end) {
			temp[k++] = ( inputs[i]<= inputs[j] ) ? inputs[i++]	: inputs[j++];	
		}
		
		// copy element from temp array to actual inputs array
		System.arraycopy(inputs, i, inputs, start+k, midpoint-i);
		System.arraycopy(temp, 0, inputs, start, k);
	}

}
