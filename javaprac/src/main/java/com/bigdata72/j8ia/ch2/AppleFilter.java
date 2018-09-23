package com.bigdata72.j8ia.ch2;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class AppleFilter {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppleFilter.class);
	private List<Apple> apples;

	public static void main(String[] args) {
		AppleFilter filter = new AppleFilter();
		List<Apple> apples = filter.createApples();
		LOGGER.debug("Number of apples in inventory ="+apples.size());
		List<Apple> greenAndHeavyApples = filter.getGreenAndHeavyApples(apples, new GreenAndHeavyApplePredicate());
		LOGGER.debug("Number of apples which are both green and heavy="+greenAndHeavyApples.size());
	}

	private List<Apple> createApples(){
		this.apples = new ArrayList<>();
		apples.add(new Apple("green", 155));
		apples.add(new Apple("green", 145));
		apples.add(new Apple("red", 160));
		apples.add(new Apple("green", 165));
		return apples;

	}

	private List<Apple> getGreenAndHeavyApples(List<Apple> inventory, ApplePredicate pred){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if(pred.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
}
