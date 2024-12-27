package com.functional.programming;

import java.util.List;
import java.util.Optional;

public class FP05_Optional {

	public static void main(String[] args) {
		List<String> fruitsList = List.of("Apple", "Banana", "Mango", "Lichi", "Kiwi");
		
		//Predicate<? super String> predicate = fr -> fr.startsWith("B");
		Optional<String> first = fruitsList.stream().filter(fr -> fr.startsWith("B")).findFirst();
		System.out.println(first);
		System.out.println(first.isEmpty());
		System.out.println(first.isPresent());
		System.out.println(first.get());
	}
	
}
