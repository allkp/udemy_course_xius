package com.example.NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
	
	public static List<Integer> boxing(){
		return IntStream.rangeClosed(1, 10)
				.boxed()
				.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> numList)
	{
		return numList.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}

	public static void main(String[] args) {
		
		System.out.println(boxing());
		System.out.println(unBoxing(boxing()));
		
	}
	
}
