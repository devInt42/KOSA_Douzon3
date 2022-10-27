package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.MemberDAO;

@Controller
public class LogoutController {

	@Autowired
	private MemberDAO memberDAO;
	
	@RequestMapping("/logout.kosa")
	public String out(HttpSession session) {
		session.invalidate(); // 세션 정보 종료
		return "redirect:login.kosa";
	}
	
}
