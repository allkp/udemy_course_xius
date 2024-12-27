package com.example.OptionalClass;

import java.util.Optional;

import com.studentClassFiles.Bike;
import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class OptionalFilterMapFlatMapExample {

	// filter()
	public static void optionalFilter() {
		Optional<Student> stdFilter = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		stdFilter.filter(s -> s.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
	}

	// flatMap()
	public static void optionalFlatMap() {
		Optional<Student> stdFlatMap = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<String> name = stdFlatMap.filter(s -> s.getGpa() >= 3.5)
			.flatMap(Student::getBike)
			.map(Bike::getName);

		name.ifPresent(s -> System.out.println(s));
		
		//System.out.println(stdFlatMap.get());
	}

	// map()
	public static void optionalMap() {
		Optional<Student> stdMap = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		if(stdMap.isPresent()) {
			Optional<String> optString = stdMap.filter(s -> s.getGpa() >= 3.5)
			.map(Student::getName);
		System.out.println(optString.get());
		}
		
	}

	public static void main(String[] args) {
		optionalFilter();
		
		optionalMap();
		
		optionalFlatMap();
		
	}

}
