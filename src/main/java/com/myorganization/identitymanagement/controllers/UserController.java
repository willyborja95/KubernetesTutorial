package com.myorganization.identitymanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myorganization.identitymanagement.models.entities.User;
import com.myorganization.identitymanagement.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok().body(userService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findUser(@PathVariable Long id){
		Optional<User> o = userService.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(o.get());
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody User user){
		userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody User user, Long id){
		
		Optional<User> o = userService.findById(id);
		
		if(o.isEmpty()) {
			ResponseEntity.notFound().build();
		}
		
		User userUpdated = o.get();
		userUpdated.setName(user.getName()); 
		userUpdated.setLastName(user.getLastName());
		userUpdated.setEmail(user.getEmail());		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userUpdated));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		userService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
