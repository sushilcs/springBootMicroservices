package com.sky.restfulwebservices;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
	private String message;
	
	public HelloWorldBean(String message) {
		this.message=message;
	}
	public HelloWorldBean() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
