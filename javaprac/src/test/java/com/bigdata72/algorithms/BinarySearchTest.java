package com.bigdata72.algorithms;

import edu.princeton.cs.algs4.In;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class BinarySearchTest {

	private int[] arr;
	private int key;

	@BeforeClass
	public static void init(){

	}

	@Test
	public void binarysearchTest1() {
		int[] input = {3, 21, 33, 45, 72, 75}; // input array should be sorted
		int key = 45;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest2() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 33;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest3() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 21;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest4() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 3;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest5() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 72;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest6() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 75;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest7() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 4;
		assertThat(BinarySearch.binarysearch(input, key), is(-1));
	}

	@Test
	public void binarysearchTest8() {
		int[] input = {3, 21, 33, 45, 72, 75};
		int key = 73;
		assertThat(BinarySearch.binarysearch(input, key), is(-1));
	}

	@Test
	public void binarysearchTest9() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 75;
		assertThat(BinarySearch.binarysearch(input, key), is(-1));
	}

	@Test
	public void binarysearchTest10() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 2;
		assertThat(BinarySearch.binarysearch(input, key), is(-1));
	}

	@Test
	public void binarysearchTes11() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 3;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest12() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 21;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest13() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 33;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTes14() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 45;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest15() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 72;
		assertThat(input[BinarySearch.binarysearch(input, key)], is(key));
	}

	@Test
	public void binarysearchTest16() {
		int[] input = {3, 21, 33, 45, 72};
		int key = 0;
		assertThat(BinarySearch.binarysearch(input, key), is(-1));
	}

	@Test
	public void binarySearchFrom1kintsFile(){
		int [] input = new In("C:/algorithms/algs4-data/1Kints.txt").readAllInts();
		System.out.println("number of elements in array from 1Kints.txt ="+input.length);
		//now brute force search
		long start = System.nanoTime();
		int index = BinarySearch.bruteForceSearch(input, 745942); // last element
		long end = System.nanoTime();
		long duration = (end - start) ;
		System.out.printf("Time taken to do brute force search for 1k integers is %d nanoseconds", duration);
		System.out.println();
		System.out.println();

		// sort the array now
		Arrays.sort(input);

		//155091 is in file 1Kints.txt at index 7
		start = System.nanoTime();
		index = BinarySearch.binarysearch(input,745942);
		System.out.println("Index of 745942 in sorted array is ="+ index);
		end = System.nanoTime();
		duration = (end - start) ;
		System.out.printf("Time taken to do binary search for 1k integers is %d nanoseconds", duration);
		System.out.println();

		assertThat(input[index], is(745942));
		assertThat(BinarySearch.binarysearch(input,155092), is(-1));

	}
}