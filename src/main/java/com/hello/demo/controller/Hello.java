package com.hello.demo.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/")
	public String helloWorld(@RequestHeader("x-location") String location) {
		return "Hello from " + location + "!";
	}

}
