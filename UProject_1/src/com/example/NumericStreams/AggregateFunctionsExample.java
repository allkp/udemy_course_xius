package com.example.NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunctionsExample {
	
	public static void main(String[] args) {
		OptionalInt optInt = IntStream.rangeClosed(1, 10).max();
		
		//System.out.println(intstrm.count());
		System.out.println(optInt.isPresent() ? optInt.getAsInt() : 0);
		
		OptionalLong optLong = LongStream.rangeClosed(1, 10).min();
		System.out.println(optLong.isPresent() ? optLong.getAsLong() : 0);
		
		Long optLong1 = LongStream.rangeClosed(1, 10).sum();
		System.out.println(optLong1);
		
		OptionalDouble optDouble = IntStream.rangeClosed(1, 10).average();
		System.out.println(optDouble.isPresent() ? optDouble.getAsDouble() : 0);
	}

}
