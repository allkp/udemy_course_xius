package com.example.NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamsExample {
	
	public static int sumOfNumList(List<Integer> numList) {
		return numList.stream()
				.reduce(0, (x,y) -> x+y);
	}
	
	public static int sumOfIntStream() {
		return IntStream.rangeClosed(1, 9).sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Sum of num List : " + sumOfNumList(numList));
		
		System.out.println("Sum of IntStream : " + sumOfIntStream());
		
		IntStream.rangeClosed(1, 50).asDoubleStream().forEach(x -> System.out.print(x + ","));
		System.out.println();
		DoubleStream ds = IntStream.range(1, 11).mapToDouble(i -> 1.0+i*0.5);
		ds.forEach(System.out::println);
		//System.out.println(ds.count());
		
		//doubleStream.forEach(x -> System.out.print(x + ","));
		
	}

}
