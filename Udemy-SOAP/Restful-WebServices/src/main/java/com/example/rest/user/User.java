package com.example.rest.user;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue
	private int id;

	@Size(min = 2, message = "Name should have atleast 2 Characters........")
	@JsonProperty("User_Name")
	private String name;

	@Past(message = "Birth date should be in the past.......")
	@JsonProperty("Date_Of_Birth")
	private LocalDate dateOfBirth;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Post> posts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
