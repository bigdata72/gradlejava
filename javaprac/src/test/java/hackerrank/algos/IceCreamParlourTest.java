package hackerrank.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamParlourTest {

	@Test
	public void findChoicesTest1() {
		int[] input = {2, 7, 13, 5, 4, 13, 5};
		int sum = 10;
		assertArrayEquals(new int[]{3,6}, IceCreamParlour.findChoices(input, sum));
	}

	@Test
	public void findChoicesTest2() {
		int[] input = {3, 10, 0, 4, 6, 5, 5, 9, 1, 8, 7, 2};
		int sum = 10;
		assertArrayEquals(new int[]{1,2}, IceCreamParlour.findChoices(input, sum));
	}
}