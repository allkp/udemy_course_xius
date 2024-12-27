package com.functional.programming;

import java.util.List;

public class FP04_Map {

	public static void main(String[] args) {
		
		List<Integer> numList = List.of(2, 3, 8, 5, 7, 1, 4, 6, 9, 10);
		printSquareNumsOfNumList(numList);
		
	}

	private static void printSquareNumsOfNumList(List<Integer> numList) {
		numList.stream().map(i -> i*i).forEach(System.out::println);
	}

}
