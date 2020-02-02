package com.example.user.service;

import com.example.user.pojo.User;

public interface UserService {
    
	User registerUser(User input);
    
	Iterable<User> findAll();
}