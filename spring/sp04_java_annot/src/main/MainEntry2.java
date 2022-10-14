package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import config.JavaConfigPrototype;
import spring.Client2;

public class MainEntry2 {
	
	public static void main(String[] args) {
//		ApplicationContext  ctx = 
//				new ClassPathXmlApplicationContext("config/appCtx2.xml");
		
		GenericApplicationContext ctx = 
				new GenericXmlApplicationContext("config/appCtx2.xml");
		
//		AbstractApplicationContext ctx = 
//				new AnnotationConfigApplicationContext(JavaConfigPrototype.class);
		
		Client2 client = ctx.getBean("client2", Client2.class);
		Client2 c2 = ctx.getBean("client2", Client2.class);
		client.send();
		
		// spring¿∫ ΩÃ±€≈Ê ∆–≈œ¿”
		System.out.println(client.hashCode());
		System.out.println(c2.hashCode());
		
		ctx.close();
	}
}
