package com.example.methodReferences;

import java.util.function.Function;

public class MethodReferrenceExample {
	
	
	public static void main(String[] args) {
		Function<String, String> lm = (s) -> s.toUpperCase();
		
		Function<String, String> mrm = String::toUpperCase;
		
		System.out.println(lm.apply("java8-8"));
		System.out.println(mrm.apply("core java"));
	}

}
