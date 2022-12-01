package com.example.put.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PostRequestDto;


@RestController
@RequestMapping("/api")	//PUT, 	http://localhost:8080/api
public class PutApiController {

	/*
	  @PutMapping("/put") // http://localhost:8080/api/put 
	  public void put(@RequestBody PostRequestDto requestDto) { System.out.println(requestDto);
	  }
	 */
	
	@PutMapping("/put")  // http://localhost:8080/api/put public void
	public PostRequestDto put(@RequestBody PostRequestDto requestDto) {
		
		System.out.println(requestDto);
		return requestDto;
	}
	
	@PutMapping("/put-id/{userId}") // http://localhost:8080/api/put-id/1
	public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {
		
		System.out.println(id);

		return requestDto;
	}
	
		
	
}

/*
{
 		"name" : "kingsmile",
 		"age" : 27,
 		"car_list" : [
          	{
 				"name" : "BMW",
 				"car_number" : "11가 1234"
 			},
 			{
 			"name" : "A4",
 			"car_number" : "22가 7890"
 			}
        ]
 	}
 
 
 */
