package com.rest.example.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.rest.example"})
public class HelloWorldApiApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApp.class, args);
	}
}
