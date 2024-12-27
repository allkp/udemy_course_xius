package com.example.StreamApi;

import java.util.Optional;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyMtd(){
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa() >= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstMtd(){
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGpa() == 3.5)
				.findFirst();
	}
	
	public static void main(String[] args) {
		Optional<Student> result = findAnyMtd();
		System.out.println(result.isPresent() ? result.get() : result);
		
		Optional<Student> result1 = findFirstMtd();
		System.out.println(result1.isPresent() ? result1.get() : result1);
	}
	
}
