package com.example.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{

	@Override
	public int multiply(List<Integer> intList) {
		return intList.stream()
			.reduce(3, (x,y) -> x*y);
	}

}
