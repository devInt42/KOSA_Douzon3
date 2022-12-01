package com.example.hello.contorller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.dto.UserRequest;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

	@GetMapping(path = "/hello")
	public String getHello() {
		return "Hello SpringBoot";
	}

	@RequestMapping(path = "/hi", method = RequestMethod.GET)
	public String hi() {
		return "<font color = 'red'>hi~~~~</font>";
	}
	
	@GetMapping("/path-variable/{id}")	// 매번 주소가 변화되는 내용 받겠다면 { } 변경될 내용 기재,  주소줄에는 대문자 사용X  ex) pathVariable X
	public String pathVariable(@PathVariable(name="id") String pathId) {
		
		System.out.println("PathVariable : " + pathId);
		
		return pathId;
	}
	
	@GetMapping(path = "query-param")  //http://localhost:8080/api/get/query-param?user=yuna&email=aa@kosa.or.kr&age=22
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		queryParam.entrySet().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			sb.append(entry.getKey() + "=" + entry.getValue());
		});
		
		return sb.toString();
	}
	
	//http://localhost:8080/api/get/query-param02?name=yuna&email=aa@kosa.or.kr&age=22
	@GetMapping(path = "query-param02")  
	public String queryParam02(
						@RequestParam String name,
						@RequestParam String email,
						@RequestParam String age
			) {
		
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		return name +", "+email+", "+age;
	}
	
	// ?name=smile&email=kingsmile@kosa.or.kr&age=33
	@GetMapping(path = "query-param03")  
	public String queryParam02(UserRequest userRequest) {	// 객체 타입으로 리턴할때는  @RequestParam을 안쓴다.
		
		System.out.println(userRequest.getName());
		System.out.println(userRequest.getEmail());
		System.out.println(userRequest.getAge());

		
		return userRequest.toString();
	}
}
