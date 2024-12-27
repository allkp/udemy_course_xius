package com.example.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comp = (a, b) -> a.compareTo(b);
	static BinaryOperator<Integer> binaryOp = (a, b) -> a*b;

	public static void main(String[] args) {
		System.out.println(binaryOp.apply(5, 5));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comp);
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comp);

		
		System.out.println("Result of maxBy is : " + maxBy.apply(5, 10));
		System.out.println("Result of minBy is : " + minBy.apply(5, 10));

	}

}
