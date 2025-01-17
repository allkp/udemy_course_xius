package com.functional.programming.excersize;

import java.util.List;

public class FP01_Excersize {

	public static void main(String[] args) {
		List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		printAllOddNums(numList);
		System.out.println("=============================================");

		List<String> courseList = List.of("Java", "Advanced_Java", "Spring_Boot", "SQL", "HTML", "CSS", "React", "Java_Script", "Type_Script", "Spring-MVC");
		printCourses(courseList);
		
		
	}

	private static void printCourses(List<String> courseList) {
		courseList.stream().forEach(System.out::println);
		System.out.println("=============================================");
		courseList.stream().filter(c -> c.contains("S")).forEach(System.out::println);
		System.out.println("=============================================");
		courseList.stream().filter(c -> c.length() > 4).forEach(System.out::println);
		System.out.println("=============================================");
		courseList.stream().map(c -> c + " : " + c.length()).forEach(System.out::println);
	}

	private static void printAllOddNums(List<Integer> numList) {
		numList.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
	}
	
}
