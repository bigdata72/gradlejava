package com.bigdata72.j8ia.ch2;

public class GreenAndHeavyApplePredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 150;
	}
}
