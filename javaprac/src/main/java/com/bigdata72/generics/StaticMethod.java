package com.bigdata72.generics;

import java.util.ArrayList;
import java.util.List;

public class StaticMethod {
	public static void main(String[] args) {
		System.out.println(toList(1,2,3));
		List<Integer> ints = toList();
		List<Object> objs = toList(1, "two");
		System.out.println(ints);
		System.out.println(objs);
	}

	private static <T> List<T> toList(T... arr){
		List<T> list = new ArrayList<>();
		for(T elt : arr){
			list.add(elt);
		}
		return list;
	}

	
}
