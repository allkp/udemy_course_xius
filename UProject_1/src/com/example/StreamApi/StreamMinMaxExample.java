package com.example.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
	
	public static int getMaxNum(List<Integer> numList) {
		return numList.stream()
				.reduce(0, (x, y) -> x>y ? x:y);
	}
	
	public static Optional<Integer> getMaxNumOptional(List<Integer> numList) {
		return numList.stream()
				.reduce( (x, y) -> x>y ? x:y);
	}

	public static void main(String[] args) {
		//List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> numList = new ArrayList<Integer>();
		
		System.out.println(getMaxNum(numList));
		
		Optional<Integer> maxNum = getMaxNumOptional(numList);
		System.out.println(maxNum);
		if(maxNum.isPresent()) {
			System.out.println("max number is : " + maxNum.get());
		}else {
			System.out.println("Input is empty... ");
		}
		
		
		
	}
	
}
