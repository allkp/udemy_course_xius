package com.example.base;

public class Friends {
	
	private int id;
	
	private String name;
	
	private String address;
	
	private int age;
	
	private double height;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Friends(int id, String name, String address, int age, double height) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", height=" + height
				+ "]";
	}
	
	
}
