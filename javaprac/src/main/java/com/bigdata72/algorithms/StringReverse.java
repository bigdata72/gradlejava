package com.bigdata72.algorithms;

import java.util.Arrays;

public class StringReverse {
	public static String reverseUsingGetBytes(String s){
		byte[] input = s.getBytes();
		System.out.println(Arrays.toString(input));
		byte[] result = new byte[input.length];
		for(int i =0; i < input.length; i++){
			result[i] = input[input.length -1-i];
		}
		System.out.println(Arrays.toString(result));

		return new String(result);
	}
}
