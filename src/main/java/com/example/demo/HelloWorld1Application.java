package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld1Application {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(HelloWorld1Application.class, args);
	}

}
