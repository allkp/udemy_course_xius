package com.example.rest.jpa_hibernate.course.repo.springdataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.jpa_hibernate.course.model.Course;


@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer>{
	
	List<Course> findByAuthor(String author);

}
