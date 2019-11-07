package com.bigdata72.generics.ch2;

import java.util.Collection;
import java.util.List;

public class GenericsUtil {

	public static final String SOURCE_AND_OR_DEST_NULL = "source or destination object are null";
	public static final String SOURCE_BIG_THAN_DEST = "source cannot fit into destination";

	/**
	 * Client example calls
	 * List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
	 * List<Integer> ints = Arrays.asList(1, 2);
	 * GenericsUtil.copy(ints, objs)
	 * GenericsUtil.<Object>copy(ints, objs)
	 * GenericsUtil.<Number>copy(ints, objs)
	 * GenericsUtil.<Integer>copy(ints, objs)
	 */

	public static <T> void copyWhenTypeIsGeneric(List<? extends T> src, List<? super T> dst){
		// TODO change argument from List to Collection
		doTheCopy(src, dst);
	}

	public static <T> void copy2(List<T> src, List<? super T> dst){
		// for above example calls, this will only work when the type parameter is Integer
		doTheCopy(src, dst);
	}

	public static <T> void copy3(List<? super T> dst, List<T> src){
		// for above example calls, this will only work when the type parameter is Integer
		//doTheCopy(src, dst);
		for(int i=0; i < src.size(); i++){
			dst.set(i,src.get(i));

		}
	}

	public static double sum(Collection<? extends Number> nums){
		double s = 0.0;
		for(Number n : nums){
			s += n.doubleValue();
		}
		return s;
	}

	public static void count(Collection<? super Number> ints, int n){
		if(ints!=null){
			for(int i=0; i<n; i++){
				ints.add(i);
			}
		}
	}

	private static <T> void doTheCopy(List<? extends T> src, List<? super T> dst) {
		if(src == null || dst == null ) throw new IllegalArgumentException(SOURCE_AND_OR_DEST_NULL);
		if(dst.size() < src.size()) throw new IllegalArgumentException(SOURCE_BIG_THAN_DEST);
		for(int i=0; i < src.size(); i++){
			dst.set(i,src.get(i));

		}
	}

	// limited function
	public static <T> boolean addAll(Collection<T> dst, T... elements){
		boolean result = false;
		for(T t: elements){
			result |= dst.add(t);
		}
		return true;
	}

}
