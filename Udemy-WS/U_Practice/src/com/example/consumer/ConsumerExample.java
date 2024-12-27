package com.example.consumer;

import java.util.List;
import java.util.function.Consumer;
import com.example.base.Friends;
import com.example.base.FriendsDatabase;

public class ConsumerExample {

	
	public static void main(String[] args) {
		
		List<Friends> frndLst = FriendsDatabase.getAllFrnds();
		
		Consumer<Friends> c1 = f -> System.out.print(f.getName() + " - " + f.getAddress());
		Consumer<Friends> c2 = f -> System.out.println();
		Consumer<Friends> c3 = (f) -> {
			if(f.getName().equals("Sagar")) {
				f.setAddress("VizayaNagaram");
			}
		};
		
		frndLst.forEach(c1.andThen(c2));
		frndLst.forEach(c3);
		frndLst.forEach(c1.andThen(c2));

		
		
		
		
		
	}

}
