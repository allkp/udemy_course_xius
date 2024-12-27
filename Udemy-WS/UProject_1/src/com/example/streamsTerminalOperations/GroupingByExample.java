package com.example.streamsTerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class GroupingByExample {

	
	public static void groupByGender() {
		Map<String, List<Student>> stdMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(stdMap);
	}
	
	public static void groupByGPA() {
		Map<String, List<Student>> stdMap = StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "Outstanding Performer" : "Average Performer"));
		
		System.out.println(stdMap);
	}
	
	public static void main(String[] args) {
		groupByGender();
		
		groupByGPA();
	}
}
