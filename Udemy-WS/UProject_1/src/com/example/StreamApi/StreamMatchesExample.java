package com.example.StreamApi;

import com.studentClassFiles.StudentDataBase;

public class StreamMatchesExample {

	public static boolean allMatchMtd() {
		return StudentDataBase.getAllStudents().stream()
				.allMatch(s -> s.getGpa() >= 3.5);
	}
	
	public static boolean anyMatchMtd() {
		return StudentDataBase.getAllStudents().stream()
				.anyMatch(s->s.getGpa()>=4.5);
	}
	
	public static boolean noneMatchMtd() {
		return StudentDataBase.getAllStudents().stream()
				.noneMatch(s -> s.getGpa()>=4.1);
	}
	
	public static void main(String[] args) {
		System.out.println(allMatchMtd());
		System.out.println(anyMatchMtd());
		System.out.println(noneMatchMtd());
		
	}
	
}
