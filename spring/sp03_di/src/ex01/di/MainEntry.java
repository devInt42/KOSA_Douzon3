package ex01.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
//		MessageImpl mb = new MessageImpl("yuna", "Hello");
//		mb.sayHello();
//		mb.setGreeting("hi");
//		mb.setName("gildong");
//		mb.sayHello();
//		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		MessageImpl bean = (MessageImpl)ctx.getBean("messageImpl");
		MessageImpl bean = (MessageImpl)ctx.getBean("mb");
		bean.sayHello();
		
	}
}
