package com.example.streamsTerminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class MappingExample {

	public static void main(String[] args) {
		
		List<String> namesList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		Set<String> nameSet = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getGender, Collectors.toSet()));
		
		System.out.println(namesList);
		
		System.out.println(nameSet);

	}

}
