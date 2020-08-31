package com.java.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloController {
	
	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public String getString() {
		return "Hello World";
	}

}
