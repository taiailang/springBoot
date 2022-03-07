package com.lang.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/getHi")
	public String getHi(){
		return "hi";
	}
}
