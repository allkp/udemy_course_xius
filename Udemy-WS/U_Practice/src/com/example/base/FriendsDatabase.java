package com.example.base;

import java.util.Arrays;
import java.util.List;

public class FriendsDatabase {
	
	public static List<Friends> getAllFrnds(){
		Friends frnd1 = new Friends(1, "Lokesh", "Vizag", 23, 5.7);
		Friends frnd2 = new Friends(2, "DSP", "Srikakulam", 23, 5.8);
		Friends frnd3 = new Friends(3, "Chinni", "Bobbili", 22, 5.6);
		Friends frnd4 = new Friends(4, "Sagar", "Bobbili", 24, 5.9);
		Friends frnd5 = new Friends(5, "Ramudu", "Vizag", 25, 5.9);
		
		List<Friends> frndList = Arrays.asList(frnd1, frnd2, frnd3, frnd4, frnd5);
		return frndList;
	}
	
	/*
	 * public static void main(String[] args) { FriendsDatabase obj = new
	 * FriendsDatabase(); obj.getAllFrnds().forEach(System.out::println); }
	 */

}
