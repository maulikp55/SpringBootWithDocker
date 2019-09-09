package com.spring.boot.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "home")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Welcome to my first Spring Boot Docker Example";
	}

}
