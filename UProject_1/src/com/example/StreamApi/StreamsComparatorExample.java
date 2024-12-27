package com.example.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName(){
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGPA(){
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("sortStudentsByName : ");
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("sortStudentsByGPA : ");
		sortStudentsByGPA().forEach(System.out::println);
	}
	
}
