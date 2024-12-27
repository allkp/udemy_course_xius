package com.example.ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,5,6,9);
		
		/**
		 * Imperative Approach
		 */
		List<Integer> uniqueList = new ArrayList<Integer>();
		
		for(Integer integer:integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Unique List with Imperative Approach : " + uniqueList);
		
		/**
		 * Declarative Approach
		 */
		List<Integer> uniqueList1 = integerList.stream().distinct()
				.collect(Collectors.toList());
		System.out.println("Unique List with Declarative Approach : " + uniqueList1);
	}

}
