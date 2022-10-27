package com.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.MemberDAO;

@Controller
/*@RequestMapping("/login.kosa")	//한번에 가능
@RequestMapping(method = RequestMethod.GET)*/
public class LoginController {

	@Autowired
	private MemberDAO memberDAO;

	@RequestMapping(value = "/login.kosa", method = RequestMethod.GET)
	public String form() {

		return "loginForm"; // /WEB-INF/views/+loginForm+.jsp
	}

	@RequestMapping(value = "/login.kosa", method = RequestMethod.POST)
	public String submit(@RequestParam(value = "id") String id, @RequestParam(value = "pwd") String pwd,
			HttpSession session) throws SQLException {
		String viewPage = null;
		boolean isMember = memberDAO.memberCheck(id, pwd);
		
		if(isMember) {
			session.setAttribute("USERID", id);	//data save
			viewPage = "loginSuccess";
		}else {
			viewPage = "loginForm";
		}
		
		return viewPage;
	}

}
