package com.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class InformationController {   // annotation controller 
	
	private static final Logger log = LoggerFactory.getLogger(InformationController.class);
	
	@RequestMapping(value = "/info", method = RequestMethod.GET )
	public String info(Model  m) {
		
		log.info("InformationController  컨트롤러에서 실행 된 내용입니다.");
		
		String irum = "kang gamchan";
		
		m.addAttribute("address", "서울 연희동");
		m.addAttribute("tel", "010-9872-0202");
		m.addAttribute("name", irum);
				
		return "info";    //    /WEB-INF/views/info.jsp 
	}
}
