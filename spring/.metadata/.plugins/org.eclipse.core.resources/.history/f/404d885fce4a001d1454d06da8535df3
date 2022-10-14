package ex01.di.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		AnnotationConfigApplicationContext ctx = 
//			new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appCtx.xml");

		MyCats mycats1 = ctx.getBean("mycats1", MyCats.class);
		Cats cats1 = ctx.getBean("cats", Cats.class);
		cats1.setMyCatsInfo(mycats1);
		cats1.getMyCatsInfo();

		/*
		 * Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		 * catsInfo.getMyCatsInfo();
		 * 
		 * MyCats cats2 = ctx.getBean("cat2", MyCats.class);
		 * catsInfo.setMyCatsInfo(cats2); catsInfo.getMyCatsInfo();
		 * 
		 * ctx.close();
		 */
	}
}
