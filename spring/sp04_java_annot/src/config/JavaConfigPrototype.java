package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client2;

@Configuration    // XML 설정 파일 역할
public class JavaConfigPrototype {

	@Bean(initMethod = "")
	public Client2 client2() {
		Client2 client2 = new Client2();
		client2.setHost("server 2222!!!");
		
		return client2;
	}
}
