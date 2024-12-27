package com.example.streamsTerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.collectingAndThen;


import java.util.LinkedHashMap;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class TwoLevelGroupingByExample {

	public static void twoLevel() {
		Map<Integer, Map<String, List<Student>>> stdMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel,
						groupingBy(s -> s.getGpa() >= 3.8 ? "OutStanding" : "Average")));
		
		System.out.println(stdMap);
	}
	
	public static void twoLevel_1() {
		Map<String, Integer> stdMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getName,
						summingInt(Student::getNoteBooks)));
		
		System.out.println(stdMap);
	}
	
	public static void threeLevel() {
		LinkedHashMap<String, Set<Student>> stdLinkedHashMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
		
		System.out.println(stdLinkedHashMap);
	}
	
	public static void threeLevel_1() {
		Map<Integer, Optional<Student>> stdMapOpt = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(stdMapOpt);
	}
	
	public static void threeLevel_2() {
		Map<Integer, Student> stdMapOpt = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println(stdMapOpt);
	}
	
	public static void main(String[] args) {
		twoLevel();
		twoLevel_1();
		threeLevel();
		threeLevel_1();
		threeLevel_2();
	}
}
