package com.example.defaults;

public interface Interface3 extends Interface2{

	default void methodC() {
		System.out.println("This is from Interface-3, Method-C");
	}
	
}
