package com.bigdata72.interviewprac;

// Fibonacci series:
/*
n =	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14
xn =	0	1	1	2	3	5	8	13	21	34	55	89	144	233	377
 */

import java.util.Scanner;

public class GetNthFib implements StopWatch{
	private long START = 0l;
	private long FINISH = 0l;
	private int [] arr;
	private int countb = 0;
	private int counta = 0;

	private void run(){
		// TODO get input from Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter which Fibonacci number to compute. Valid input is non negative integers\n" +
		"starting with 1");
		int n = scanner.nextInt();
		System.out.println("N="+n);
		start();
		System.out.println("Calling getNthFib() with n ="+n);
		System.out.println("Result is = "+getNthFib(n));
		stop();
		double run1 = durationInSeconds();
		System.out.println("Time taken = "+run1 + " seconds");
		reset();
		System.out.println();
		System.out.println(counta);

		//
		// Calling the optimized version with caching
		arr = new int[n+1];
		start();
		System.out.println("Calling getNthFibCached() with n ="+n);
		System.out.println("Result is = "+getNthFibCached(n));
		stop();
		double run2 = durationInSeconds();
		System.out.println("Time taken = "+run2 + " seconds");
		System.out.println(countb);

		System.out.println("Cached version is "+(run1/run2) +" times faster");

	}

	public static void main(String[] args) {
		new GetNthFib().run();
	}

	// Time complexity O(2^n) - not efficient
	// Space complexity O(n)
	public int getNthFib(int n){
		counta++;
		if(n<0) throw new IllegalArgumentException("n cannot be <0");
		if(n==2) {
			return 1;
		}
		if (n==1) {
			return 0;
		}
		return getNthFib(n-1) + getNthFib(n-2);
	}

	public int getNthFibCached(int n){
		countb++;
		if(n==1) return 0;
		if(n==2) return 1;

		if(arr[n] != 0) return arr[n];
		arr[n] = getNthFibCached(n-1) + getNthFibCached(n-2);
		return arr[n];
	}

	@Override
	public void start() {
		if(START != 0L) throw new IllegalStateException("StopWatch not reset");
		START = System.nanoTime();
	}

	@Override
	public void stop() {
		if(FINISH !=0L) throw new IllegalStateException("StopWatch state not valid");
		FINISH = System.nanoTime();
	}

	@Override
	public long nanoDuration() {
		return FINISH - START;
	}

	@Override
	public void reset() {
		START = 0L;
		FINISH = 0L;
	}
}

