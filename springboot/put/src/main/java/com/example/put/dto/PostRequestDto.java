package com.example.put.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)	//해당 클래스 전체에 일괄적으로 스네이크 케이스 적용
public class PostRequestDto {
	
	private String name;
	private int age;
	private List<CarDto> carList;
	
	
	
	
}
