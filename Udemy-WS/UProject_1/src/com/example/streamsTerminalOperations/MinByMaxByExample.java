package com.example.streamsTerminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class MinByMaxByExample {
	
	public static Optional<Student> minBy(){
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy(){
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		System.out.println(minBy().get());
		
		System.out.println(maxBy().get());

	}

}
