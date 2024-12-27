package com.example.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		List<Student> stdList = StudentDataBase.getAllStudents();
		
		BiConsumer<String, List<String>> biCon = (a, b) -> {
			System.out.println(a + " : " + b);
		};
		stdList.forEach((std -> biCon.accept(std.getName(), std.getActivities())));
		
		BiConsumer<String, String> bc1 = (a, b) -> {
			System.out.println("a : " + a + " ," + " b : " + b);
		};
		
		bc1.accept("Adireddi", "Lokesh");
		
		BiConsumer<Integer, Integer> bc2 = (a, b) -> {
			System.out.println(a*b);
		};
		BiConsumer<Integer, Integer> bc3 = (a, b) -> {
			System.out.println(a/b);
		};
		
		bc2.andThen(bc3).accept(25, 5);
				
	}
	
}
