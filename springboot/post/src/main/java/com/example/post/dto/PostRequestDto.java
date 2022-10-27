package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
/*
	JSON 예시
	{
		"account" : "류정수",
		"email" : "wjdtn402@naver.com",
		"address" : "경기도",
		"password" : "1004",
		"phone_number" : "010-1234-5678",
		"OPT" : "OPT"
	}
*/


@Data
public class PostRequestDto {

	private String account, email, address, password;
	
	@JsonProperty("phone_number")
	private String phoneNumber;
	
	@JsonProperty("OPT")
	private String OPT;	//카멜, 스네이크도 아닌것들
}
