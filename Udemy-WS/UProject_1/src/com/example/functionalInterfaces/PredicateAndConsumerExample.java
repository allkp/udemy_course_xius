package com.example.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> stdBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> stdConsumer = (std -> {
		if(p1.and(p2).test(std)) {
			stdBiConsumer.accept(std.getName(), std.getActivities());
		}
	}) ;
	
	public void printNameAndActivities(List<Student> std) {
		std.forEach(stdConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		
		new PredicateAndConsumerExample().printNameAndActivities(stdList);
		
	}

}
