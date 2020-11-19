package com.myorganization.identitymanagement.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.myorganization.identitymanagement.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
