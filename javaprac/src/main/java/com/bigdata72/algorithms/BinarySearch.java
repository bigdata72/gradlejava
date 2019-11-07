package com.bigdata72.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarysearch(int[] arr, int fromIndex, int toIndex, int key){
		int low = fromIndex;
		int high = toIndex -1;
		while(low <= high){
			int mid = (low+high) >>> 1;
			int midVal = arr[mid];

			if(midVal < key){
				low = mid + 1;
			}else if(midVal > key){
				high = mid -1;
			}else{
				return mid;
			}
		}
		return -1;
	}

	public static int binarysearch(int[] arr, int key){
		// the input array needs to be sorted
		// declare variables for lo, hi and mid
		int fromIndex = 0;
		int toIndex = arr.length;
		return binarysearch(arr, fromIndex, toIndex, key);
	}

	public static int bruteForceSearch(int [] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	// driver
	public static void main(String[] args) {
		// input an array
		int[] input = {3, 21, 33, 45, 72, 75};
		// sort the array
		Arrays.sort(input);
		// call the binarysearch method
		System.out.println("Input array is :"+ Arrays.toString(input));
		System.out.println("Please enter the number you want to search");
		Scanner scanner = new Scanner(System.in);
		int search = scanner.nextInt();
		if(binarysearch(input, search) != -1){
			System.out.println("Input "+search +" is present in the input array -"+Arrays.toString(input));
		}else{
			System.out.println("Input "+search +" is NOT present in the input array -"+Arrays.toString(input));
		}
	}
}
