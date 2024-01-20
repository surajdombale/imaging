package com.example.start.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("status")
	public String status() {
		return "Running";
		
	}
	@GetMapping("run")
	public String status12() {
		return "Running123";
		
	}

}
