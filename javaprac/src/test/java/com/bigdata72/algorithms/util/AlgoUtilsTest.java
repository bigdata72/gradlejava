package com.bigdata72.algorithms.util;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class AlgoUtilsTest {

	@Test
	public void createIntArrayTest1() {
		int arrLength = 5;
		int lo = -100;
		int hi = 100;
		int [] result = AlgoUtils.createIntArray(arrLength, lo, hi);
		assertThat(result.length, is(arrLength));
		// check resultant array bounds
		assertThat(AlgoUtils.toIntegerArray(result), is(not(arrayContaining(-100, 100))));

	}

	@Test(expected = IllegalArgumentException.class)
	public void createIntArrayTest2(){
		int arrLength = 5;
		int lo = -100;
		int hi = -100;
		int [] result = AlgoUtils.createIntArray(arrLength, lo, hi);
	}
}