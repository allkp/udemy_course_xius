package com.example.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		/**
		 * prior java-1.8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);	// o1 == o2 ==> 0
				// o1 > o2 ==> 1
				// o1 < o2 ==> -1
			}
		};
		
		System.out.println("Result of the Comparator is : " + comparator.compare(5, 2));
		
		/**
		 * java-8 lambda
		 */
		Comparator<Integer> compLambda = (Integer a, Integer b) -> a.compareTo(b);
		
		System.out.println("Result of the compLambda is : " + compLambda.compare(3, 4));
		
		Comparator<Integer> compLambda1 = (a, b) -> a.compareTo(b);
		System.out.println("Result of the compLambda1 is : " + compLambda1.compare(3, 3));

	}

}
