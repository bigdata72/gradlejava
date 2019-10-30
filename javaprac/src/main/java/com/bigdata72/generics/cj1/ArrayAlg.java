package com.bigdata72.generics.cj1;

public class ArrayAlg {
	/**
	 * gets the min and max of an array of Strings
	 * @param array of String
	 * @return a Pair with the min or max value
	 */
	public static <T extends Comparable> Pair<T, T> minMax(T [] array){
		T min = array[0];
		T max = array[0];

		for(int i=1; i< array.length; i++){
			if(min.compareTo(array[i]) > 0) {
				min = array[i];
			}
			if(max.compareTo(array[i]) <0) {
				max = array[i];
			}
		}
		return new Pair<>(min, max);
	}

	public static void main(String[] args) {
		System.out.println("Test");
	}
}
