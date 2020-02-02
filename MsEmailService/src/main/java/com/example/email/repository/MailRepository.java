package com.example.email.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.email.pojo.Mail;

public interface MailRepository extends CrudRepository<Mail, Long> {

}