package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@AllArgsConstructor	//all member field contructor
@NoArgsConstructor	//default contructor
@Data	//setter getter
public class MemberVO {

	private String id, name, pwd, email;
	private int age;
	
}
