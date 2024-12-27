package com.example.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class SupplierExample {
	
	
	public static void main(String[] args) {
		Supplier<Student> stdSupplier = () -> {
			return new Student("Lokesh", 3, 3.9, "male", Arrays.asList("swimming", "playing", "watchingmovies"));
		};
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println(stdSupplier.get());
		
		System.out.println(listSupplier.get());

		
		listSupplier.get().forEach(s -> System.out.println(s));
	}

}
