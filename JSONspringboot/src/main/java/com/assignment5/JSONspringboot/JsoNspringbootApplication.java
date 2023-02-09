package com.assignment5.JSONspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsoNspringbootApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","9866");
		SpringApplication.run(JsoNspringbootApplication.class, args);
	}

}
