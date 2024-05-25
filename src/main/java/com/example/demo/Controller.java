package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/monitor")
	public String Monitor() {
	return "Monitor";	
	}

	@GetMapping("/hello")
	public String Hello() {
	return "Hello";	
	}

}
