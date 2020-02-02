package com.example.email.service;

import com.example.email.dto.UserDto;

public interface EmailService {

	void sendSimpleMessage(UserDto input);
}
