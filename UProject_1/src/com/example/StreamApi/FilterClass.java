package com.example.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class FilterClass {

	public static List<Student> filterMethod(){
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGender().equals("male"))
				.filter(s-> s.getGpa() >= 3.9)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		filterMethod().forEach(System.out::println);
		//filterMethod().forEach(s -> System.out.println(s));
	}
	
}
