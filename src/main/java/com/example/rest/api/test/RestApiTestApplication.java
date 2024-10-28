package com.example.rest.api.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RestApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestApplication.class, args);
	}

}
