package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserServiceApplication.class, args);
	}

}
