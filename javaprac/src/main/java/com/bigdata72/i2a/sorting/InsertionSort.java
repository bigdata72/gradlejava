package com.bigdata72.i2a.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class InsertionSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(InsertionSort.class);

	public static void main(String[] args) {
		//create unsorted array
		int[] arr = new int[] {5,2,4,6,1,3};
		LOGGER.debug("original unsorted array="+ Arrays.toString(arr));
		insertionSort(arr);
		LOGGER.debug("after insertion sort, array is ="+Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr){
		/**
		 * Psuedocode
		 * Original unsorted array is A[] for e.g. [5, 2, 4, 6, 1, 3]
		 * for j = 0 to A.len
		 *      key = A[j];
		 *      // insert A[j] into sorted sequence A[0..j-1]
		 *      i = j-1
		 *      while(i>=0 & A[i] > key)
		 *          A[i+1] = A[i]
		 *          i = i-1
		 *      A[i+1] = key
		 */


		int length = arr.length;
		for(int j=1; j<length;j++){
			int key = arr[j];
			int i = j-1;
			// insert arr[j] into sorted sequenece arr[0..j-1]
			while(i>=0 && arr[i] > key){
				arr[i+1] = arr[i];
				i = i-1;
			}
			arr[i+1] = key;
		}
	}
}
