package com.bigdata72.generics.ch2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.*;

public class GenericsUtilTest {

	@Test
	public void addAll() {
		List<Number> dst = new ArrayList<>();
		GenericsUtil.addAll(dst, 1, 3.14);
		assertThat(dst.toString(), is("[1, 3.14]"));
	}

	@Test
	public void copyTest1(){
		List<Integer> srcInts = Arrays.asList(1,2); // also can be List<Number>, or List<Double>, or List<Object>
		List<Object> dstObjs = Arrays.<Object> asList(3, 3.14, "four"); // can be List<Integer>, List<Number>

		// type parameter is implicit here, Integer is the most specific choice
		GenericsUtil.copyWhenTypeIsGeneric(srcInts, dstObjs);
		assertThat(dstObjs.toString(), is("[1, 2, four]"));

		List<Number> srcNums = Arrays.asList(1.1, 2.2, 3);
		GenericsUtil.<Number>copyWhenTypeIsGeneric(srcNums, dstObjs);
		assertThat(dstObjs.toString(), is("[1.1, 2.2, 3]"));

		List<Double> srcDbls = Arrays.asList(1.1, 2.2);
		GenericsUtil.<Double>copyWhenTypeIsGeneric(srcDbls, dstObjs);
		assertThat(dstObjs.toString(), is("[1.1, 2.2, 3]"));

		List<Object> srcObjs = Arrays.asList("one", "two", "three");
		GenericsUtil.<Object>copyWhenTypeIsGeneric(srcObjs, dstObjs);
		assertThat(dstObjs.toString(), is("[one, two, three]"));

		List<Integer> dstInts = Arrays.asList(4, 5);
		GenericsUtil.copyWhenTypeIsGeneric(srcInts, dstInts);
		assertThat(dstInts.toString(), is("[1, 2]"));

	}


	@Test
	public void copyTest3(){
		List<Integer> srcInts = Arrays.asList(1,2);
		List<Object> dstObjs = Arrays.<Object> asList(3, 3.14, "four");
		GenericsUtil.<Number>copyWhenTypeIsGeneric(srcInts, dstObjs);
		assertThat(dstObjs.toString(), is("[1, 2, four]"));
	}

	@Test
	public void copyTest4(){
		List<Integer> srcInts = Arrays.asList(1,2);
		List<Object> dstObjs = Arrays.<Object> asList(3, 3.14, "four");
		GenericsUtil.<Integer>copyWhenTypeIsGeneric(srcInts, dstObjs);
		assertThat(dstObjs.toString(), is("[1, 2, four]"));
	}

	@Test
	public void copyTest5(){
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage(GenericsUtil.SOURCE_AND_OR_DEST_NULL);
		List<Object> dstObjs = Arrays.<Object> asList(3, 3.14, "four");
		GenericsUtil.copyWhenTypeIsGeneric(null, dstObjs);
	}

	@Test
	public void copyTest6(){
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage(GenericsUtil.SOURCE_AND_OR_DEST_NULL);
		List<Object> srcObjs = Arrays.<Object> asList(3, 3.14, "four");
		GenericsUtil.copyWhenTypeIsGeneric(srcObjs, null);
	}

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void copyTest7(){
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage(GenericsUtil.SOURCE_BIG_THAN_DEST); //
		List<Object> srcObjs = Arrays.<Object> asList(1, 2, 3);
		List<Object> dstObjs = Arrays.<Object> asList(3.14, "four");
		GenericsUtil.copyWhenTypeIsGeneric(srcObjs, dstObjs);
	}

	@Test
	public void copyTest8(){
		List<Object> dstObjs = Arrays.<Object> asList(3.14, "four");
		List<Object> srcObjs = Arrays.<Object> asList(1, 2);
		GenericsUtil.copy2(srcObjs,dstObjs);
		assertThat(dstObjs, contains(equalTo(1), equalTo(2)));

	}

	@Test
	public void copyTest9(){
		List<Number> dstObjs = Arrays.<Number> asList(4.4, 5.5);
		List<Integer> ints = Arrays.<Integer> asList(1, 2);
		List<? extends Number> nums = ints;

		//GenericsUtil.<Number>copy3(dstObjs,nums); // compilation error

		//assertThat(dstObjs, contains(equalTo(1), equalTo(2)));

	}

	@Test
	public void testSum(){
		List<Integer> ints = Arrays.asList(1,2);
		assertThat(GenericsUtil.sum(ints), is(3)); //Collection<? extends Number> coll = ints;

		List<Double> dbls = Arrays.asList(2.4, 3.4);
		assertThat(GenericsUtil.sum(dbls),is(5.8)); //Collection<? extends Number> coll = dbls;

		List<Number> nums = Arrays.asList(1, 3.4, 2);
		assertThat(GenericsUtil.sum(dbls),is(5.8)); //	Collection<? extends Number> coll = nums;

	}

//	@Test
//	public void testCount(){
//		List<Integer> ints = Arrays.asList(1,2);
//		assertThat(GenericsUtil.count(ints,3), is(3)); //Collection<? extends Number> coll = ints;
//
//		List<Double> dbls = Arrays.asList(2.4, 3.4);
//		assertThat(GenericsUtil.sum(dbls),is(5.8)); //Collection<? extends Number> coll = dbls;
//
//		List<Number> nums = Arrays.asList(1, 3.4, 2);
//		assertThat(GenericsUtil.sum(dbls),is(5.8)); //	Collection<? extends Number> coll = nums;
//
//	}
}