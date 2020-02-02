package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.pojo.User;
import com.example.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/member")
	public ResponseEntity<Iterable<User>> getAll() {
	    Iterable<User> all = userService.findAll();
	    return new ResponseEntity<>(all, HttpStatus.OK);
	}
	 
	@PostMapping(path = "/member")
	public ResponseEntity<User> register(@RequestBody User input) {
	    User result = userService.registerUser(input);
	    return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
