package com.example.rest.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import com.example.rest.dao.PostRepository;
import com.example.rest.dao.UserRepository;
import com.example.rest.exception.UserNotFoundException;
import com.example.rest.user.Post;
import com.example.rest.user.User;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
public class UserJpaController {

	//private UserDaoService daoService;

	private UserRepository userRepository;
	
	private PostRepository postRepository;

	public UserJpaController(UserRepository repository, PostRepository postRepository) {
		this.userRepository = repository;
		this.postRepository = postRepository;
	}

	@Transactional
	@GetMapping("/jpa/users")
	public List<User> getAllUsers() {
		//User user = new User();
		return userRepository.findAll();
	}

	@Transactional
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> getById(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isEmpty()) {
			throw new UserNotFoundException("id : " + id);
		}

		EntityModel<User> entityModel = EntityModel.of(user.get());

		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());

		entityModel.add(link.withRel("all-users"));

		return entityModel;
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
		User savedUser = userRepository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();

		EntityModel<User> entityModel = EntityModel.of(savedUser);
		entityModel.add(linkTo(methodOn(this.getClass()).getById(savedUser.getId())).withRel("created-user"));

		return ResponseEntity.created(location).body(entityModel);
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public String deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		return "Deletion of userId : " + id + " is completed successfully...!!!";
	}
	
	
	
	@GetMapping("/jpa/posts")
	public List<Post> getAllPosts() {
		List<Post> posts = postRepository.findAll();
		return posts;
	}
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> getPostsForUsers(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		if(user.isEmpty()) {
			throw new UserNotFoundException("id : " + id);
		}
		
		return user.get().getPosts();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object> createPostsForUsers(@PathVariable int id, @Valid @RequestBody Post post) {
		Optional<User> user = userRepository.findById(id);
		if(user.isEmpty()) {
			throw new UserNotFoundException("id : " + id);
		}
		post.setUser(user.get());
		
		@Valid
		Post savedPost = postRepository.save(post);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedPost.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		}

}
