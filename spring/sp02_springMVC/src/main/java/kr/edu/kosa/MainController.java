package kr.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller {   // Controller
	
	Logger log = LoggerFactory.getLogger(MainController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		//System.out.println("Welcome home! The client locale is main controller call");
		log.info("�̰� �츮�� ���� ��Ʈ�ѷ� Ŭ���� �Դϴ�.");
		
		String name = "�迬��";
		ModelAndView  mav = new ModelAndView();
		
		mav.addObject("name", name);    // data save
		mav.addObject("irum", "�̿���"); 
		mav.addObject("age", 33); 
		mav.addObject("test", "Test3333"); 
		
		//mav.setViewName("/WEB-INF/jsp/main.jsp");  // move view page
		mav.setViewName("main");  //   /WEB-INF/jsp + main + .jsp
		
		return mav;
	}

}