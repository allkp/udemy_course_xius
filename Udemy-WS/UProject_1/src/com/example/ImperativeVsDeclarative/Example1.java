package com.example.ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class Example1 {
	
	public static void main(String[] args) {
		
		// Imperative Style
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum using Imperative Approach : " + sum);
		
		
		// Declarative Style
		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("Sum using Declarative Approach : " + sum1);
		
	}

}
