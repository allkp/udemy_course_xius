package com.example.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class BiFunctionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bfn = ((students, studentPredicate) -> {
		Map<String, Double> stdMap = new HashMap<>();
		students.forEach(student -> {
			if(studentPredicate.test(student)) {
				stdMap.put(student.getName(), student.getGpa());
			}
		});
		return stdMap;
	});

	public static void main(String[] args) {
		
		System.out.println(bfn.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
		
	}
	
}
