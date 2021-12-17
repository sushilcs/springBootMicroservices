package com.sky.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@Autowired
	@Value(value = "hello worldssssssss")
	HelloWorldBean bean;
	
	//method returning hello world;
	@GetMapping("/helloworld")
	public String ssayHello() {
		return "helloworld";
	}
	
	//method returning hello world;
		@GetMapping("/helloworld-bean")
		public String ssayHelloBean() {
			return bean.getMessage();
		}

}
