package com.example.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.user.pojo.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
}