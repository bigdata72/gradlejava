package com.bigdata72.effjava.ch6;

import java.util.Scanner;

public class WeightTable {
	public static void main(String[] args) {
		System.out.println("Please enter your weight ");
		Scanner scanner = new Scanner(System.in);
		double earthWeight = scanner.nextDouble();
		System.out.println("The weight entered is = "+ earthWeight);

		double earthMass = earthWeight / Planet.EARTH.surfaceGravity();
		System.out.println("Earth mass = "+ earthMass);

		for(Planet p : Planet.values()){
			System.out.printf("The weight on %s is %f%n", p, p.surfaceWeight(earthMass));
		}

	}
}
