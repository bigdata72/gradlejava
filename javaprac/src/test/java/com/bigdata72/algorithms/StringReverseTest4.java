package com.bigdata72.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.junit.Assert.*;

public class StringReverseTest4 {
	@Test
	public void reverseTest1(){
		String input ="reverse";
		String expected = "esrever";
		assertThat(StringReverse.reverseUsingGetBytes(input), is(expected));
		assertThat(StringReverse.reverseUsingGetBytes(input), is(equalTo(expected)));
		assertThat(StringReverse.reverseUsingGetBytes(input), equalToIgnoringCase(expected));
	}

}