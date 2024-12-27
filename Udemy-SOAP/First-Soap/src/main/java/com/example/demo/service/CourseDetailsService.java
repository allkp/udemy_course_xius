package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.beans.Course;

@Component
public class CourseDetailsService {
	
	public enum Status{
		SUCCESS, FAILURE;
	}
	
	private static List<Course> courseList = new ArrayList<>();
	
	static {
		Course c1 = new Course(1, "Java", "Core Java");
		courseList.add(c1);
		
		Course c2 = new Course(2, "Maven", "Advanced Java");
		courseList.add(c2);

		Course c3 = new Course(3, "Spring", "Spring Boot");
		courseList.add(c3);

		Course c4 = new Course(4, "SQL", "mySQL");
		courseList.add(c4);
	}
	
	//find by id
	public Course findById(int id) {
		for(Course course : courseList) {
			if(id == course.getId()) {
				return course;
			}
		}
		return null;
	}
	
	public List<Course> findAllCourses(){
		return courseList;
	}
	
	public Status deleteById(int id) {
		Iterator<Course> iterator = courseList.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if(course.getId() == id) {
				iterator.remove();
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}

}
