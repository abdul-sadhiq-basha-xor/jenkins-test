package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
	
	
	@GetMapping
	public String getMethod() {
		return "Hello jenkins, Successfully added the Ngrok for auto build whenerver there is a change";	
	}

}
