package com.example.post.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.post.dto.PostRequestDto;

/*
  	String : valule
  	number : value
  	boolean : value
  	object : value { }
  	array : value [ ]
  	
  	// camelCase, PascalCase, snake_case
  	{
  		"phone_numbe" : "010-9872-0202",    
  		"age" : 10,
  		"isAgree" : false,
  		"account" : {
  				"email" : "kingsmile@kosa.or.kr",
  				"password" : "1234"
  		}
  	}
  	
  	// user 조회 하는 경우
  	{
  		"user_list" : [
  				{
  					"account" : "kingsmile",
  					"password" : "1234"
  				},
  				{
  					"account" : "aaa",
  					"password" : "1111"
  				},
  				{
  					"account" : "bbb",
  					"password" : "2222"
  				},
  		]
  	}
  	
*/

@RestController
@RequestMapping("/api")     // POST,  http://localhost:8080/api
public class PostApiController {

	@PostMapping("/post")    // http://localhost:8080/api/post
	public void post(@RequestBody Map<String, Object> requestData) {
		/*
		 * requestData.entrySet().forEach(strObjectEntry -> {
		 * System.out.println("key : " +strObjectEntry.getKey());
		 * System.out.println("value : " +strObjectEntry.getValue()); });
		 */
		
		requestData.forEach((key, value) ->{
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		});
	}
	
	@PostMapping("/post-object")
	public void postObject(@RequestBody PostRequestDto requestDto) {
		System.out.println(requestDto);
	}

}









