package com.functional.programming;

import java.util.List;

public class FP01_Structured {

	public static void main(String[] args) {
		List<Integer> numList = List.of(2, 3, 8, 5, 7, 1, 4, 6, 9, 10);
		PrintAllNumbersList(numList);
		PrintAllNumbersListInFP(numList);
	}

	private static void PrintAllNumbersList(List<Integer> numList) {
		numList.stream().forEach(System.out::println);
	}


	private static void PrintAllNumbersListInFP(List<Integer> numList) {
		for (int num : numList) {
			System.out.print(num + ", ");
		}
	}

}
