package com.example.StreamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamVsCollection {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Lokesh");
		names.add("Siva Sai");
		names.add("Naidu");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		names.remove(2);
		System.out.println(names);
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		//nameStream.forEach(System.out::println);

	}
}
