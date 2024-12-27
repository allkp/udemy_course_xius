package com.example.rest.jpa_hibernate.course.repo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.rest.jpa_hibernate.course.model.Course;


@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	private static String INSERT_QUERY = 
			"""
				insert into course(id, name, author)
				values(?, ?, ?);
				
			""";
	
	private static String DELETE_QUERY = 
			"""
				delete from course 
				where id = ?;
				
			""";
	
	private static String SELECT_QUERY = 
			"""
				select * from course 
				where id = ?; 
				
			""";
	
	public void insertQry(Course course) {
		template.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteQry(int id) {
		template.update(DELETE_QUERY, id);
	}
	
	public Course findById(int id) {
		return template.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
