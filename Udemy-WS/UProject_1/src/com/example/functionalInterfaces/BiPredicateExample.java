package com.example.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class BiPredicateExample {
	
	BiPredicate<Integer, Double> bp1 = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
	
	BiConsumer<String, List<String>> stdBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> stdConsumer = (std -> {
		if(bp1.test(std.getGradeLevel(), std.getGpa())) {
			stdBiConsumer.accept(std.getName(), std.getActivities());
		}
	});
	
	public void printNameAndActivities(List<Student> stds) {
		stds.forEach(stdConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		//new BiPredicateExample().printNameAndActivities(stdList);
		stdList.forEach(new BiPredicateExample().stdConsumer);

	}
	

}
