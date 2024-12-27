package com.example.StreamApi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethodsExample {

	
	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("Lokesh", "Adireddi", "Allkp");
		stringStream.forEach(System.out::println);
		
		//System.out.println(stringStream.count());
		
		Stream.iterate(1, x -> x*2)
		.limit(10)
		.forEach(System.out::println);
		
		Supplier<Integer> intSupplier = new Random()::nextInt;
		Stream.generate(intSupplier).limit(4).forEach(System.out::println);
		
	}
}
