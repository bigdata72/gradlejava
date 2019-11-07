package com.bigdata72.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PalindromeTest {

	@Test
	public void isPalindromeTest1() {
		String s = "madam";
		assertThat(Palindrome.isPalindromUsingSBReverse(s), is(true));
	}

	@Test
	public void isPalindromeTest2() {
		String s = "notapalindrome";
		assertThat(Palindrome.isPalindromUsingSBReverse(s), is(false));
	}

	@Test
	public void isPalindromeTest3() {
		String s = "madam";
		assertThat(Palindrome.isPalidromeUsingCharAt(s), is(true));
	}

	@Test
	public void isPalindromeTest4() {
		String s = "notapalindrome";
		assertThat(Palindrome.isPalidromeUsingCharAt(s), is(false));
	}
}