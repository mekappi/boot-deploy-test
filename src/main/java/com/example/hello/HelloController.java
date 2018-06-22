package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("init");
		return "hello";
	}
	
}
