package com.example.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	static UnaryOperator<String> uOp = (s) -> s.concat(" Default");
	
	public static void main(String[] args) {
		System.out.println(uOp.apply("Java"));
	}

}
