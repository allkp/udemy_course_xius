package com.example.methodReferences;

import java.util.function.Function;
import java.util.function.Supplier;

import com.studentClassFiles.Student;

public class ConstructorReferenceExample {
	
	static Supplier<Student> stdSupplier = Student :: new;
	
	static Function<String, Student> stdFunction = Student::new;
	
	
	public static void main(String[] args) {
		System.out.println(stdSupplier.get());
		System.out.println(stdFunction.apply("Lokesh"));
	}

}
