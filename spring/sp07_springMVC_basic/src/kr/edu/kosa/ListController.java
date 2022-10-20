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
		
		mav.addObject("list", "List Page22 입니다");  // data save
		mav.addObject("title", "Title222 입니다"); 
		mav.addObject("content", "Content22 입니다");
		
		//mav.setViewName("/views/list.jsp");  // move view page
		mav.setViewName("list");  //  /WEB-INF/views/ + list + .jsp
		
		return mav;
	}

}
