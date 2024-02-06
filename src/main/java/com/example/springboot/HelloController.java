package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("user/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/post")
	public String index_01(String name) {
		return "hi";
	}



}