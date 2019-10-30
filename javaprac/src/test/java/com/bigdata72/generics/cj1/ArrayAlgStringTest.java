package com.bigdata72.generics.cj1;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayAlgStringTest {

	@Test
	public void minMaxTest1() {
		String [] input = {"The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
		Pair<String, String> result = ArrayAlg.minMax(input);
		assertThat(result.getFirst(), is("The"));
		assertThat(result.getSecond(), is("the"));
	}

	@Test
	public void minMaxTest2() {
		String [] input = {"Mary", "had", "a", "little", "lamb"};
		Pair<String, String> result = ArrayAlg.minMax(input);
		assertThat(result.getFirst(), is("Mary"));
		assertThat(result.getSecond(), is("little"));
	}

	@Test
	public void minMaxTest3(){
		GregorianCalendar[] birthdays  =
				{
						new GregorianCalendar(1972, Calendar.NOVEMBER, 18),
						new GregorianCalendar(1975, Calendar.MARCH, 5),
						new GregorianCalendar(2003, Calendar.APRIL, 13),
						new GregorianCalendar(2008, Calendar.SEPTEMBER, 20)
				};

		Pair<GregorianCalendar, GregorianCalendar> minMax = ArrayAlg.minMax(birthdays);
		System.out.println("min ="+minMax.getFirst().getTime());
		System.out.println("max ="+minMax.getSecond().getTime());
	}
}