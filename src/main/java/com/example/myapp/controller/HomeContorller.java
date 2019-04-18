package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContorller {
	
	@GetMapping("/test")
	public String home() {
		return "Hello Spring";
	}

}
