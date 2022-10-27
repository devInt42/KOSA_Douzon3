package edu.kosa.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao_di.UserDAO;
import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {  // ����ó�� ����
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		
		UserDAO dao = ctx.getBean("dao", UserDAO.class);
		dao.menu();
		Scanner sc = new Scanner(System.in);
		UserVO vo = new UserVO();
		System.out.print("user id = "); 			vo.setId(sc.next());
		System.out.print("user name = "); 			vo.setName(sc.next());
		System.out.print("user pass = "); 			vo.setPassword(sc.next());
		
		dao.insert(vo);
		
		
		/*
		UserDAO dao = new OralceUserDAOImpl();
		Scanner sc = new Scanner(System.in);
		
		dao.menu();
		switch (sc.nextInt()) {
			case 1 :
				UserVO vo = new UserVO();
				System.out.print("user id = "); 			vo.setId(sc.next());
				System.out.print("user name = "); 			vo.setName(sc.next());
				System.out.print("user pass = "); 			vo.setPassword(sc.next());
				
				dao.insert(vo);
				System.out.println(vo.getId() + " �߰� ����!");
				System.out.println("----------------------------------------");
				break;
				
			case 3 :   // selectAll 
				dao.menu();
				dao.selectAll();
				break;
	
			default: System.out.println("���� �޴� ��ȣ �Դϴ�. ���� �ٽ��ϼ���.");
				System.exit(0);		
				break;
		} // switch end
		
		*/
	}
}
