package com.example.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamFlatMapExample {
	
	public static List<String> printActivities(){
		List<String> actvtList = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		return actvtList;
	}
	
	public static List<String> printDistinctActivities(){
		List<String> actvtList = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		
		return actvtList;
	}
	
	public static long printActivitiesCount(){
		long noOfactvtList = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
				//.collect(Collectors.toList());
		
		return noOfactvtList;
	}
	
	public static List<String> printSortedActivities(){
		List<String> actvtList = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		return actvtList;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(printActivities());
		System.out.println(printDistinctActivities());
		System.out.println(printActivitiesCount());
		System.out.println(printSortedActivities());
		
	}

}
