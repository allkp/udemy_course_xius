package com.example.NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
	
	public static List<Integer> mapToObj(){
		return IntStream.rangeClosed(1, 5)
				.mapToObj((x) -> {
					return new Integer(x);
				}).collect(Collectors.toList());
				
	}
	
	public static Long mapToLong() {
		return IntStream.rangeClosed(1, 5)
				.mapToLong((x) -> x)
				.sum();
	}

	public static void main(String[] args) {
		
		System.out.println(mapToObj());
		
		System.out.println(mapToLong());
		
	}
	
}
