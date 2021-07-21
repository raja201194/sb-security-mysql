package com.sb.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "accessible to everyone";
	}
	
	@GetMapping("/user")
	public String user() {
		return "accessible to user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "accessible to admin";
	}
}
