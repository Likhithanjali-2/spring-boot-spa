package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.User;
import net.guides.springboot2.springboot2jpacrudexample.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class registrationController {
	
//	@Autowired
//	private UserRepository userRepository;
//
//	@GetMapping("/users")
//	public List<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//
//	@GetMapping("/users/{id}")
//	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
//			throws ResourceNotFoundException {
//		User user = userRepository.findById(userId)
//				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//		return ResponseEntity.ok().body(user);
//	}
//
//	@PostMapping("/users")
//	public User createUser(@Valid @RequestBody User user) {
//		return userRepository.save(user);
//	}

}
