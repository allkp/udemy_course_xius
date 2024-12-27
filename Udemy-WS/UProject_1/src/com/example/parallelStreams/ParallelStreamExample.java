package com.example.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static long checkPerformanceResult(Supplier<Integer> supply, int noOfTimes) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < noOfTimes; i++){
			supply.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000)
				.sum();
	}
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000)
				.parallel()
				.sum();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sumParallelStream());
		System.out.println(sumSequentialStream());
		
		System.out.println(checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
		//System.out.println(checkPerformanceResult(sumSequentialStream(), 20));
		System.out.println(checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
		
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
		
	}

}
