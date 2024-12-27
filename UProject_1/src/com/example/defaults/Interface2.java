package com.example.defaults;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("This is from Interface-2, Method-B");
	}
	
	default void methodA() {
		System.out.println("This is from Interface-1, Method-A : " + Interface2.class);
	}
	
}
