package com.example.defaults;

public interface Interface1 {

	default void methodA() {
		System.out.println("This is from Interface-1, Method-A : " + Interface1.class);
	}
	
}
