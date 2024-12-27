package com.example.OptionalClass;

import java.util.Optional;

public class OptionalExample2 {
	
	public static Optional<String> ofNullable(){
		Optional<String> stringOptional = Optional.ofNullable(null);
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptionalOf = Optional.of("Hello");
		return stringOptionalOf;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println(ofNullable());
		System.out.println(of());
		System.out.println(empty());
	}

}
