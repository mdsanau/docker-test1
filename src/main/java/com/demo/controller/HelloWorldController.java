package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		return "abhi mai aapse kya baat karu...saari chizen aapne to 
		bta hi di jab mujhe aisa kuch legega to mai aapse baat karunga";
	}
}
