package kr.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WriteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		ModelAndView  mav = new ModelAndView();
		mav.addObject("title", "List Page 입니다.");
		mav.addObject("writer", "작성자 입니다.");
		mav.addObject("content", "내용 입니다.");

		mav.setViewName("/views/write.jsp");  // move view page

		
		return mav;
	}
	

}
