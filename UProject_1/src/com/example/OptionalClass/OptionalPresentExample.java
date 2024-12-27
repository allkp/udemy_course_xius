package com.example.OptionalClass;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {
		
		//isPresent()
		Optional<String> optString = Optional.ofNullable("Hello John...!!!");
		System.out.println(optString.isPresent());
		if(optString.isPresent()) {
			System.out.println(optString.get());
		}
		
		//ifPresent()
		optString.ifPresent(s -> System.out.println(s));
		
	}

}
