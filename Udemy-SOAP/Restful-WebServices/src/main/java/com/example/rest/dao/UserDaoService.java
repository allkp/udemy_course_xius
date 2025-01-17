package com.example.rest.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.example.rest.user.User;


@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount, "Lokesh", LocalDate.now().minusYears(23)));
		users.add(new User(++usersCount, "Siva Sai", LocalDate.now().minusYears(22)));
		users.add(new User(++usersCount, "Channa Rao", LocalDate.now().minusYears(24)));
		users.add(new User(++usersCount, "Naidu", LocalDate.now().minusYears(22)));
		users.add(new User(++usersCount, "Pavan", LocalDate.now().minusYears(23)));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getById(int id) {
		Predicate<? super User> predicate = user -> user.getId()==id;
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User saveUser(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		users.removeIf(predicate);
	}

}
