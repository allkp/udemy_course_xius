package com.example.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	
	public static void main(String[] args) {
		
		Multiplier multiplier = new MultiplierImpl();
		
		List<Integer> numList = Arrays.asList(1,2,3,5);
		
		System.out.println("Instance method Result is : " + multiplier.multiply(numList));
		System.out.println("default method Size is : " + multiplier.size(numList));
		System.out.println("static method isEmpty is : " + Multiplier.isEmpty(numList));
		
	}

}
