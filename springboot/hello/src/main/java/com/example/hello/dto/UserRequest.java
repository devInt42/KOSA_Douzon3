package com.example.hello.dto;

import lombok.Data;

@Data	// getter / setter / toString
public class UserRequest {
	
	private String name, email;
	private int age;
	
}
