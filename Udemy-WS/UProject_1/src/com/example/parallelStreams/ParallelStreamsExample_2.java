package com.example.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamsExample_2 {
	
	public static int sequentialSum(List<Integer> numList) {
		long startTime = System.currentTimeMillis();
		int sum = numList.stream()
				.reduce(0, (x,y) -> x+y);
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Sequential Duration : " + duration);
		return sum;
	}
	
	public static int parallelSum(List<Integer> numList) {
		long startTime = System.currentTimeMillis();
		int sum = numList.parallelStream()
				.reduce(0, (x,y) -> x+y);
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Parallel Duration : " + duration);
		return sum;
	}
	
	
	public static void main(String[] args) {
		List<Integer> numList = IntStream.rangeClosed(1, 10000)
				.boxed()
				.collect(Collectors.toList());
		
		sequentialSum(numList);
		parallelSum(numList);
	}

}
