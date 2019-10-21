package com.bigdata72.interviewprac;

import java.util.Arrays;

public class Angram2Strings2CountArrays {
	static int NO_OF_CHARS = 256;

	/* function to check whether two strings
	are anagram of each other */

	/**
	 * This method assumes that the set of possible characters in both strings is small.
	 * In the following implementation, it is assumed that the characters are stored using 8 bit and there can be 256 possible characters.
	 *
	 * Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
	 * Iterate through every character of both strings and increment the count of character in the corresponding count arrays.
	 * Compare count arrays. If both count arrays are same, then return true.
	 * @param str1
	 * @param str2
	 * @return
	 */
	static boolean areAnagram(char str1[], char str2[])
	{
		// Create 2 count arrays and initialize
		// all values as 0
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);
		int i;

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (i = 0; i < str1.length && i < str2.length;
			 i++) {
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		// If both strings are of different length.
		// Removing this condition will make the program
		// fail for strings like "aaca" and "aca"
		if (str1.length != str2.length)
			return false;

		// Compare count arrays
		for (i = 0; i < NO_OF_CHARS; i++)
			if (count1[i] != count2[i])
				return false;

		return true;
	}

	/* Driver program to test to print printDups*/
	public static void main(String args[])
	{
		char str1[] = ("geeksforgeeks").toCharArray();
		char str2[] = ("forgeeksgeeks").toCharArray();

		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
			+ "anagram of each other");
		else
			System.out.println("The two strings are not"
			+ " anagram of each other");
	}
}
