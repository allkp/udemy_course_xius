package com.example.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
	
	public static Optional<Integer> limitFun(List<Integer> numList){
		return numList.stream()
				.limit(3)
				.reduce((x,y) -> x+y);
	}
	
	public static Optional<Integer> skipFun(List<Integer> numList){
		return numList.stream()
				.skip(3)
				.reduce((x,y) -> x+y);
	}

	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		//List<Integer> numList1 = new ArrayList<Integer>();
		
		Optional<Integer> result = limitFun(numList);
		System.out.println(result.isPresent() ? result.get():result);
		
		Optional<Integer> result1 = skipFun(numList);
		System.out.println(result1.isPresent() ? result1.get() : result1);
		
	}
}
