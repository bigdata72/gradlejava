package com.bigdata72.algorithms.util;

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AlgoUtils {
	/**
	 * Refer to algs.jar StdRandom#uniform
	 *
	 * @param len array length
	 * @param lo left endpoint, exclusive
	 * @param hi right endpoint, exclusive
	 * @return
	 */
	public static int[] createIntArray(int len, int lo, int hi){
		int [] arr = new int[len];
		for(int i=0; i <len; i++){
			arr[i]= StdRandom.uniform(lo, hi);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static Integer[] toIntegerArray(int [] arr){
		Integer [] result = new Integer[arr.length];
		for(int i=0; i<arr.length;i++){
			result[i] = arr[i];
		}
		return result;
	}


}
