package com.example.OptionalClass;

import java.util.Optional;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class OptionalOrElseExample {
	
	//orElse()
	public static String optionalOrElse() {
		//Optional<Student> stdOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> stdOptional = Optional.ofNullable(null);
		String name = stdOptional.map(Student::getName).orElse("Default");
		return name;
	}
	
	//orElseGet()
	public static String optionalOrElseGet() {
		Optional<Student> stdGetOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> stdGetOptional = Optional.ofNullable(null);
		String nameGet = stdGetOptional.map(Student::getName).orElseGet(() -> "Default Get");
		return nameGet;
	}
	
	//orElseThrow()
	public static String optionalOrElseThrow() {
		//Optional<Student> stdThrowOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> stdThrowOptional = Optional.ofNullable(null);
		String nameThrow = stdThrowOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
		return nameThrow;
	}
	

	public static void main(String[] args) {
		
		System.out.println("optionalOrElse : " + optionalOrElse());
		
		System.out.println("optionalOrElseGet : " + optionalOrElseGet());
		
		System.out.println("OptionalOrElseThrow : " + optionalOrElseThrow());
		
	}

}
