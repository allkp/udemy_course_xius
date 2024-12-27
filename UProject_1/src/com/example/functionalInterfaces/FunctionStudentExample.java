package com.example.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> stdFunction = (students -> {
		Map<String, Double> stdMap = new HashMap<>();
		
		students.forEach(student -> {
			if(PredicateStudentExample.p1.test(student)) {
				stdMap.put(student.getName(), student.getGpa());
			}
		});
		return stdMap;
	});

	
	public static void main(String[] args) {
		System.out.println(stdFunction.apply(StudentDataBase.getAllStudents()));
	}
}
