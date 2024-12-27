package com.example.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> con1 = (s) -> System.out.println(s);
	static Consumer<Student> c1 = (s) -> System.out.println(s.getName());
	static Consumer<Student> c2 = (s) -> System.out.println(s.getActivities());

	
	public static void printStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(con1);
	}
	
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities : ");
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(c1.andThen(c2));
	}
	
	public static void printNameAndActivitiesByCondition() {
		System.out.println("printNameAndActivitiesByCondition : ");
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((s -> {
			if(s.getGradeLevel() >= 3) {
				c1.andThen(c2).andThen(con1).accept(s);
			}
		}));
	}

	public static void main(String[] args) {
		
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		
		consumer.accept("java-8");
		
		printStudents();
		
		printNameAndActivities();
		
		printNameAndActivitiesByCondition();
		
		
		
	}

}
