package com.example.StreamApi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamsMapExample {

	public static List<String> nameList(){
		List<String> stdList = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		return stdList;
	}
	
	public static Set<String> nameSet(){
		Set<String> stdSet = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
		
		return stdSet;
	}
	
	public static void main(String[] args) {
		System.out.println(nameList());
		System.out.println(nameSet());
		
	}
	
}
