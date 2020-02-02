package com.example.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmailServiceApplication.class, args);
	}

}
