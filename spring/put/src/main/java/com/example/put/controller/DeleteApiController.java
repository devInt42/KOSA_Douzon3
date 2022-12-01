package com.example.put.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable  String userId, @RequestBody String account) {
		
		System.out.println(userId);
		
		System.out.println(account);
	}
}
