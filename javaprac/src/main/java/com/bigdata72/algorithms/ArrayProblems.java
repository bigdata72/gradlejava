package com.bigdata72.algorithms;

public class ArrayProblems {
	/*
	 1) find the max of array values
	 2) compute the average of array values
	 3) copy to another array
	 4) reverse elements withing array
	 5) matrix matrix multiplication
	 Pg 21 of Algorithms book Ch 1 Basic programming model
	  */

	public static int max(int [] arr){
		//{3, 45, 67, 82, 44, 55};
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	public static double avg(double [] arr){
		double sum = 0.0;
		int count = 0;
		for(int i=0; i<arr.length;i++){
			sum+=arr[i];
			count++;
		}
		return sum/count;
	}

	public static int[] copyArray(int [] arr){
		int [] copy = new int[arr.length];
		for(int i=0; i<arr.length;i++){
			copy[i]=arr[i];
		}
		return copy;
	}
}
