package ex03.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("player.xml");
		FootballViewImpl football = (FootballViewImpl) ctx.getBean("football");
		football.print();
		BascketballViewImpl bascketball = (BascketballViewImpl) ctx.getBean("bascketball");
		bascketball.print();
		CurlingImpl curling = (CurlingImpl) ctx.getBean("curling");
		curling.print();
		
	}
}
