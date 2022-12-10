package com.example.loginh2console;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("/")
	String hello() {
		return "logged in, welcome";
	}
}
