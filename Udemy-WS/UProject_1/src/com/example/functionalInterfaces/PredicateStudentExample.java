package com.example.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class PredicateStudentExample {
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	public static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel : ");
		List<Student> stdList = StudentDataBase.getAllStudents();
		
		stdList.forEach((student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudentsByGPA() {
		System.out.println("filterStudentsByGPA : ");
		List<Student> stdList = StudentDataBase.getAllStudents();
		
		stdList.forEach((student -> {
			if(p2.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudents() {
		System.out.println("filterStudents : ");
		List<Student> stdList = StudentDataBase.getAllStudents();
		
		stdList.forEach((std -> {
			if(p1.and(p2).test(std)) {
				System.out.println(std);
			}
		}));
		
	}
	
	public static void main(String[] args) {
		
		filterStudentsByGradeLevel();
		
		filterStudentsByGPA();
		
		filterStudents();
		
	}

}
