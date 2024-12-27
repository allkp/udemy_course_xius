package com.example.StreamApi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamsExample1 {
	
	
	public static void main(String[] args) {
		
		Predicate<Student> p1 = (s -> s.getGradeLevel() >= 3);
		Predicate<Student> p2 = (s -> s.getGpa() >= 3.8);
		
		Map<String, List<String>> stdMap = StudentDataBase.getAllStudents().stream()
				.peek((student -> {
					System.out.println("before 1st filter : "+student);
				}))
				.filter(p1)
				.peek(student -> {
					System.out.println("after 1st filter : "+student);
				})
				.filter(p2)
				.peek(student -> {
					System.out.println("after 2nd filter : "+student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(stdMap);
	}

}
