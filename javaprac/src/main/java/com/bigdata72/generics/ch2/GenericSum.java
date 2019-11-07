package com.bigdata72.generics.ch2;

import java.util.Collection;

public class GenericSum {
	public static double sum(Collection<? extends Number> nums){
		double sum = 0.0;
		for(Number num : nums){
			sum += num.doubleValue();
		}
		return sum;
	}
}
