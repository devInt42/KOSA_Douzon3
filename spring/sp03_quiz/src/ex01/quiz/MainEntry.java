package ex01.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("score.xml");
		ScoreViewImpl view = (ScoreViewImpl)ctx.getBean("view");
		System.out.println("===========================");
		view.print();
		
		System.out.println("=========setter method==========");
		view.input();
		view.print();
		
		
		
		
	
	}
}
