package com.example.rest.controller;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.rest.dao.UserDaoService;
import com.example.rest.exception.UserNotFoundException;
import com.example.rest.user.User;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	private UserDaoService daoService;
	
	public UserController(UserDaoService daoService) {
		this.daoService = daoService;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return daoService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User>getById(@PathVariable int id) {
		User user = daoService.getById(id);
		if(user == null) {
			throw new UserNotFoundException("id : " + id);
		}
		
		EntityModel<User> entityModel = EntityModel.of(user);
		
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
		
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		daoService.deleteById(id);
		return "Deletion of userId : " + id + " is completed successfully...!!!";
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
		User savedUser = daoService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		EntityModel<User> entityModel = EntityModel.of(savedUser);
		entityModel.add(linkTo(methodOn(this.getClass()).getById(savedUser.getId())).withRel("created-user"));
		
		return ResponseEntity.created(location).body(entityModel);
	}

}
