package com.sky.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	//method returning hello world;
	@GetMapping("/helloworld")
	public String ssayHello() {
		return "helloworld";
	}

}
