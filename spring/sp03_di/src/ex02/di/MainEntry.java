package ex02.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext  ctx = 
				new ClassPathXmlApplicationContext("ex02/di/memberCtx.xml");
		
		//MemberDAO dao = ctx.getBean("dao", MemberDAO.class);
		MemberDAO dao = (MemberDAO)ctx.getBean("dao");
		dao.insert();
	}
}
