package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client;


@Configuration   // ������������ �˷��ش�
public class JavaConfig {  // XML ��� ������ �ƴ� �ڹ� ��� ����

	@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("server!!!!!");
		return client;
	}
}
