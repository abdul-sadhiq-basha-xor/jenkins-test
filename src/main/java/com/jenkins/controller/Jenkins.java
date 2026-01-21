package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
	
	
	@GetMapping
	public String getMethod() {
		return "Hello jenkins-Added the weeb Hook for the auto deployment";	
	}

}
