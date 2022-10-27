package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")   //  http://localhost:8080/api/get/path-variable/king
public class ApiController {

	@GetMapping("/hello")
	public String getHello() {
		return "get hello, 안녕하세요. 스프링 부트입니다.";
	}
}
