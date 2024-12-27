package com.example.OptionalClass;

import java.util.Optional;

import com.studentClassFiles.Student;

public class OptionalExample1 {

	@SuppressWarnings("unused")
	public static String getStudentName() {
		//Student std = StudentDataBase.studentSupplier.get();
		Student std = null;
		
		if(std != null) {
			return std.getName();
		}
		
		return null;
		
	}

	public static Optional<String> getStudentNameOptional() {
		// Optional<Student> stdOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		Optional<Student> stdOptional = Optional.ofNullable(null);

		if (stdOptional.isPresent()) {
			stdOptional.get();
			return stdOptional.map(Student::getName);
		}

		return Optional.empty();

	}

	public static void main(String[] args) {
//		String name = getStudentName();
//		if(name != null)
//			System.out.println("Length of the Student Name : " + name.length());
//		else
//			System.out.println("Student Not Found");

		Optional<String> stringOptional = getStudentNameOptional();
		if (stringOptional.isPresent()) {
			System.out.println("Length of the Student Name : " + stringOptional.get().length());
		} else {
			System.out.println("Student Not Found");
		}
	}

}
