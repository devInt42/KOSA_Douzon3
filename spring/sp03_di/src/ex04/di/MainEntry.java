package ex04.di;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("ex04/di/playerCtx.xml");
		
		PlayerImpl  p = ctx.getBean("player", PlayerImpl.class);
		
		String[] sportsName = { "축구", "농구", "컬링" };
		Object[] className = { ctx.getBean("soccer"), ctx.getBean("basketBall"), ctx.getBean("curling") };
		
		for (int i = 0; i < sportsName.length; i++) {
			System.out.println(sportsName[i]);
			//p = (PlayerImpl)className[i];   // Autowired ?? 
			p.input();
			p.info();
		}
		
		
		/*
		 * Curling c = ctx.getBean("curling", Curling.class); 
		 * Soccer s = ctx.getBean("soccer", Soccer.class); 
		 * s.setPlayer(p); 
		 * p.input(); 
		 * p.info();
		 * 
		 * c.setPlayer(p); 
		 * p.input(); 
		 * p.info();
		 */
		
//		Point pt = new Point();
//		Point pt2 = new Point();
//		Point pt3 = new Point();
//		
//		pt.input();
//		pt2.input();
		
	}
}
