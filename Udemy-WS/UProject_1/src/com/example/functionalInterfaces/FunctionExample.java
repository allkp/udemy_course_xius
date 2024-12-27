package com.example.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> f1 = (name) -> name.toUpperCase();
	
	static Function<String, String> f2 = (name) -> name.toUpperCase().concat(" Adireddi");


	public static void main(String[] args) {
		
		System.out.println("Result is : " + f1.apply("lokesh"));
		
		System.out.println("Result is : " + f1.andThen(f2).apply("lokesh"));
		
		System.out.println("Result is : " + f1.compose(f2).apply("lokesh"));


		
	}
	
}
