package com.example.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class ParallelStreamExample_1 {
	
	public static List<String> printActivities(){
		long startTime = System.currentTimeMillis();
		List<String> actvtList = StudentDataBase.getAllStudents()
				.stream()
				.parallel()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Parallel Stream : " + (startTime-endTime));
		return actvtList;
	}
	
	public static List<String> printActivities1(){
		long startTime = System.currentTimeMillis();
		List<String> actvtList = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Sequential Stream : " + (startTime-endTime));
		return actvtList;
	}
	
	public static void main(String[] args) {
		
		printActivities();
		printActivities1();
		
	}

}
