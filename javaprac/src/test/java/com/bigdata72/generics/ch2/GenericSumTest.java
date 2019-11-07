package com.bigdata72.generics.ch2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GenericSumTest {

	@Test
	public void sumWithInteger() {
		List<Integer> ints = Arrays.asList(1,2,3);
		assertThat(GenericSum.sum(ints), is(6.0));
	}

	@Test
	public void sumWithDouble() {
		List<Double> dbls = Arrays.asList(1.0, 2.0, 3.0);
		assertThat(GenericSum.sum(dbls), is(equalTo(6.0)));
	}

	@Test
	public void sumWithNumbers(){
		List<Number> nums = Arrays.asList(1.0, 2, 3.0);
		assertThat(GenericSum.sum(nums), is(equalTo(6.0)));

	}
}