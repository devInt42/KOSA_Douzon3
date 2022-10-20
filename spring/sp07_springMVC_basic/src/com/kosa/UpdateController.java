package com.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateController {
	
	@RequestMapping(value = "/update.bo", method = RequestMethod.GET)
	public String update(Model model) {
		
		String name = "����ȯ";
		model.addAttribute("name", name);
		model.addAttribute("update", "Update Page �Դϴ�");
				
		return "update";      //  /WEB-INF/views/ + update + .jsp
	}

	  
//		@RequestMapping(value = "/update.bo", method = RequestMethod.GET)
//		public ModelAndView update() {
//			
//			ModelAndView mav = new ModelAndView();
//			
//			String name = "����ȯ";
//			mav.addObject("name", name);
//			mav.addObject("update", "Update Page �Դϴ�");
//			
//			mav.setViewName("update");   //  /WEB-INF/views/update.jsp
//			
//			return mav ;      //  /WEB-INF/views/ + update + .jsp
//		}
		
}
