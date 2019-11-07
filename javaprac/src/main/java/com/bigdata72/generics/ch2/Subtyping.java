package com.bigdata72.generics.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subtyping {
	/**
	 * Notes:
	 * One type is a subtype of another if they are related by extends or implements
	 * Integer, Double are subtypes of Number
	 * ArrayList<E> is a subtype of List<E>
	 * List<E> is a subtype of Collection<E>
	 * Collection<E> is a subtype of Iterable<E>
	 *
	 * Substitution princtiple: wherever a value of any type is expected one may supply a value of a subtype
	 * of that type
	 */

	private void subtype(){
		A a = new B();
		System.out.println("subType() called");
		a.foo(); // prints "In B"
	}

	private void listNum(){
		System.out.println("listNum() called");
		List<Number> nums = new ArrayList<>();
		// List<Number> is a subtype of Collection<Number>
		nums.add(1);
		nums.add(3.14);
		System.out.println(nums);
		assert nums.toString().equals("[1, 3.14]");
	}

	private void invalidSubType(){
		System.out.println("invalidSubType() called");
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(3);
//		List<Number> nums = ints; // compile time error
//		nums.add(3.14);
//		assert nums.toString().equals("1, 3, 3.14]"); // uh ohh we cannot have a double in a list of integers
		/*
		Substitution principle do not apply as List<Integer> is not a subtype of List<Number>
		 */
	}

	private void validAddAll(){
		System.out.println("validAddAll() called");
		List<Number> nums = new ArrayList<>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.1, 3.2);
		nums.addAll(ints);
		nums.addAll(dbls);
		System.out.println(nums);
		assert nums.toString().equals("[1, 2, 2.1, 3.2]");
	}

	public static void main(String[] args) {
		Subtyping instance = new Subtyping();

		// demo subtyping
		instance.subtype();

		// demo adding Integer and Double to a List<Number>
		instance.listNum();

		// demo invalid assignment, List<Integer> is not a subtype of List<Number>
		instance.invalidSubType();

		//demo valid addAll(Collection<? extends E> c)
		instance.validAddAll();

	}

	class A{
		public void foo(){
			System.out.println("In A");
		}
	}

	class B extends A{
		public void foo() {
			System.out.println("In B");
		}
	}
}
