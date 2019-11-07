package com.bigdata72.algorithms;

import com.bigdata72.algorithms.util.AlgoUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.collection.ArrayMatching.hasItemInArray;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.ArrayMatching.arrayContaining;
import static org.junit.Assert.*;

public class ArrayProblemsTest {

	@Test
	public void maxTest1() {
		int [] input = {3, 45, 67, 82, 44, 55};
		int max = ArrayProblems.max(input);
		assertThat(max, is(82));
	}

	@Test
	public void maxTest2() {
		int [] input = {83, 45, 67, 82, 44, 55};
		int max = ArrayProblems.max(input);
		assertThat(max, is(83));
	}

	@Test
	public void maxTest3() {
		int [] input = {83, 45, 67, 82, 44, 86};
		int max = ArrayProblems.max(input);
		assertThat(max, is(86));
	}

	@Test
	public void avgTest1() {
		double [] input = {5.0 ,10.0, 15.0, 20.0};
		double avg = ArrayProblems.avg(input);
		assertThat(avg, is(12.5));
	}

	@Test
	public void copyTest1(){
		int [] source1 = {1, 2, 3};
		Integer [] source2 = {1,2,3};
		List<Integer> numList = Arrays.asList(source2);
		assertThat(Arrays.toString(ArrayProblems.copyArray(source1)), is("[1, 2, 3]"));
		assertArrayEquals(ArrayProblems.copyArray(source1), source1);
		assertThat(numList,contains(1,2,3));
	}

	@Test
	public void copyTest2(){
		int [] source = AlgoUtils.createIntArray(5,1, 100);
		assertThat(Arrays.toString(ArrayProblems.copyArray(source)),
				is(Arrays.toString(source)));
		assertArrayEquals(ArrayProblems.copyArray(source), source);
	}
}