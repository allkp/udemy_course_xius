package com.example.streamsTerminalOperations;

import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class SummingAveragingIntExample {
	
	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}


	public static void main(String[] args) {
		
		System.out.println(sum());
		
		System.out.println(avg());
		
	}
	
}
