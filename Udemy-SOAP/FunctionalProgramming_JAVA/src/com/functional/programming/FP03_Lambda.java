package com.functional.programming;

import java.util.List;

public class FP03_Lambda {

	public static void main(String[] args) {
		
		List<Integer> numList = List.of(2, 3, 8, 5, 7, 1, 4, 6, 9, 10);
		PrintAllNumbersList(numList);
		System.out.println("===================================================");
		PrintAllNumbersListInFP(numList);
		
	}

	private static void PrintAllNumbersListInFP(List<Integer> numList) {
		numList.stream().filter(FP02_Filter::isEven)
				.forEach(System.out::println);
	}

	private static void PrintAllNumbersList(List<Integer> numList) {
		numList.stream().filter(i -> i%2 == 0)
		.forEach(System.out::println);
	}
}
