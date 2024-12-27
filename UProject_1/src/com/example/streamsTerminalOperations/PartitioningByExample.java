package com.example.streamsTerminalOperations;

import java.util.List;

import java.util.Map;
import java.util.function.Predicate;
import static java.util.stream.Collectors.partitioningBy;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class PartitioningByExample {
	
	public static void partitioningMtd() {
		Predicate<Student> gpaPredicate = s -> s.getGpa() >= 3.8;
		
		Map<Boolean, List<Student>> stdMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(partitioningBy(gpaPredicate));
		
		System.out.println(stdMap);
	}
	
	public static void main(String[] args) {
		partitioningMtd();
	}

}
