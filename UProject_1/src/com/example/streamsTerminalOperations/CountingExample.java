package com.example.streamsTerminalOperations;

import java.util.stream.Collectors;

import com.studentClassFiles.StudentDataBase;

public class CountingExample {
	
	public static Long counting_1() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.counting());
	}
	
	public static Long counting_2() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa() >= 3.9)
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println(counting_1());
		System.out.println(counting_2());
	}

}
