package com.example.streamsTerminalOperations;

import static java.util.stream.Collectors.joining;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class JoiningExample {
	
	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining(","));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(joining(",","(",")"));
	}
	
	public static void main(String[] args) {
		
		System.out.println(joining_1());
		
		System.out.println(joining_2());
		
		System.out.println(joining_3());

		
	}

}
