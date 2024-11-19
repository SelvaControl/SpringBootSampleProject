package com.samplespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class sample {
	
	@GetMapping("/test-api")
	public String testing() {
		return "Today Is Good Day";
	}

}
