package com.bigdata72.algorithms;

public class Palindrome {
	public static boolean isPalindromUsingSBReverse(String input) {
		// m a d a m
		// 0 1 2 3 4
		// N=5
		// N/2 = 2
		StringBuilder builder = new StringBuilder(input);

		String reverse = builder.reverse().toString();
		if(input.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}

	public static boolean isPalidromeUsingCharAt(String input){
		int N = input.length();
		for(int i=0; i<= N/2; i++){
			if(input.charAt(i) != input.charAt(N-1-i))
				return false;
		}
		return true;
	}
}