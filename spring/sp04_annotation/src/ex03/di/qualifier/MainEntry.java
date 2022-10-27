package ex03.di.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ex03/di/qualifier/appCtx.xml");
		
		MonitorViewer viewer = ctx.getBean("monitorViewer", MonitorViewer.class);
		viewer.show();
	}
}
