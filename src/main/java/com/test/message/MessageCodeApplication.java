package com.test.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MessageCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageCodeApplication.class, args);
	}
}
