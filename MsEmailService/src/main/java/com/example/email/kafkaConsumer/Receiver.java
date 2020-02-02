package com.example.email.kafkaConsumer;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.email.dto.UserDto;
import com.example.email.service.EmailService;

public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(UserDto payload) {
        System.out.println("received payload='{}'"+ payload);
        emailService.sendSimpleMessage(payload);
        latch.countDown();
    }
}
