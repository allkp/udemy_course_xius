package com.example.rest.jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.rest.jpa_hibernate.course.model.Course;
import com.example.rest.jpa_hibernate.course.repo.springdataJPA.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	/*
	 * @Autowired private CourseJdbcRepository repository;
	 */
	
	/*
	 * @Autowired private CourseJpaRepository repository;
	 */
	
	@Autowired private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn-JAVA", "Udemy"));
		repository.save(new Course(2, "Learn-JDBC", "Udemy"));
		repository.save(new Course(3, "Learn-SpringBoot", "Udemy"));
		repository.save(new Course(4, "Learn-JPA", "Udemy"));
		repository.save(new Course(5, "Learn-Servlets", "Udemy"));

		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("Udemy"));
		System.out.println(repository.findByAuthor("ud"));
		System.out.println(repository.count());

	}

}
