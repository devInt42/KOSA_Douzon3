package ex02.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ex02/di/autowired/appCtx.xml");
		
		MonitorViewer viewer = ctx.getBean("monitorViewer", MonitorViewer.class);
		viewer.print();
	
	}
}
