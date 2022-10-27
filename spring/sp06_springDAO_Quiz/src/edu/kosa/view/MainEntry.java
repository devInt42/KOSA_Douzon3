package edu.kosa.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao_di.GiftDAO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		
		GiftDAO dao = ctx.getBean("dao", GiftDAO.class);
		dao.selectAll();
	}
}
