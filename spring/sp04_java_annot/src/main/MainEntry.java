package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.JavaConfig;
import spring.Client;

public class MainEntry {
	public static void main(String[] args) {
//		ApplicationContext  ctx = 
//				new ClassPathXmlApplicationContext("config/appCtx.xml");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		Client c = ctx.getBean("client", Client.class);
		c.setHost("??????");

		Client c2 = (Client) ctx.getBean("client");
		c2.setDefaulthost("defaultHost");
		c2.send();
		// spring?? ?̱??? ??????
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());

		ctx.close();

	}
}
