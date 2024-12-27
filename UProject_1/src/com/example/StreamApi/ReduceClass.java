package com.example.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class ReduceClass {
	
	public static int reduceFunc(List<Integer> numList) {
		return numList.stream()
				.reduce(1, (a,b) -> a*b);
	}
	
	public static Optional<Integer> optMethod(List<Integer> numList){
		return numList.stream()
				.reduce((a,b) -> a*b);
	}
	
	public static Optional<Student> getHighGpaStd(){
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1, s2) -> s1.getGpa()<s2.getGpa() ? s1 : s2);
	}
	
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,3,5,7);
		System.out.println(numList);
		
		System.out.println(reduceFunc(numList));
		
		Optional<Integer> result = optMethod(numList);
		
		System.out.println(result.get());
		
		System.out.println(result.isPresent());
		
		System.out.println(optMethod(numList).get());
		System.out.println(getHighGpaStd().get());
	}

}
