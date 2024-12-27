package com.example.spring_boot;

public class Course {

	private int id;

	private String courseName;

	private String tutor;

	public int getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getTutor() {
		return tutor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", tutor=" + tutor + "]";
	}

	public Course(int id, String courseName, String tutor) {
		this.id = id;
		this.courseName = courseName;
		this.tutor = tutor;
	}

}
