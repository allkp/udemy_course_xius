package com.example.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Lokesh", "Allkp", "Siva sai", "Sagar", "Naresh");
		
		//Collections.sort(nameList);
		
		nameList.sort(Comparator.naturalOrder());
		System.out.println(nameList);
		
		nameList.sort(Comparator.reverseOrder());
		System.out.println(nameList);

		
	}
	
}
