package com.myorganization.identitymanagement.services;

import java.util.Optional;

import com.myorganization.identitymanagement.models.entities.User;

public interface UserService {
	
	public Iterable<User> findAll();
	
	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);

}
