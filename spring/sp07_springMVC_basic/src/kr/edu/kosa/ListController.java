package kr.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		ModelAndView  mav = new ModelAndView();
		
		mav.addObject("list", "List Page �Դϴ�");  // data save
		mav.addObject("title", "Title �Դϴ�"); 
		mav.addObject("content", "Content �Դϴ�");
		
		mav.setViewName("/views/list.jsp");  // move view page
		
		return mav;
	}

}
