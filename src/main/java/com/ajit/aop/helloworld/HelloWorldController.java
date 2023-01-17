package com.ajit.aop.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String retrieveAllUsers() {
		return "helloworld";
	}
	
}
