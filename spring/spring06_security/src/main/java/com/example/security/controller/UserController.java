package com.example.security.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.security.model.dao.UserDAO;
import com.example.security.service.ShaEncoder;

@Controller //��Ʈ�ѷ� ��
public class UserController {

//	@Inject
	@Autowired
	ShaEncoder shaEncoder; //��ȣȭ ��
	
	@Inject
	UserDAO userDao; 
	
	@RequestMapping("/") //���� ������
	public String home(Model model) {
		model.addAttribute("key", "������ ��ť��Ƽ �׽�Ʈ �Դϴ�");
		return "home"; //home.jsp�� �̵�
	}
	//�α��� �������� �̵�
	@RequestMapping("/user/login.do")
	public String login() {
		return "user/login";
	}
	//ȸ������ �������� �̵�
	@RequestMapping("/user/join.do")
	public String join() {
		return "user/join";
	}
	//ȸ������ ó�� 	
	@RequestMapping("/user/insertUser.do")
	public String insertUser(@RequestParam String userid, 
			@RequestParam String passwd,
			@RequestParam String name, 
			@RequestParam String authority) {
		//��й�ȣ ��ȣȭ
		String dbpw=shaEncoder.saltEncoding(passwd, userid);
		
		Map<String,String> map=new HashMap<>();
		map.put("userid", userid);
		map.put("passwd", dbpw);
		map.put("name", name);
		map.put("authority", authority);
		// affected rows, ������ ���� ���� ���� ���ϵ�
		int result=userDao.insertUser(map);
		return "user/login"; // login.jsp�� �̵�
	}
	//������ ���� ������	
	@RequestMapping("/admin/")
	public String admin() {
		return "admin/main";
	}
	
	//������ ���� ������	
	@RequestMapping("/user/")
	public String user() {
		return "user/userMain";
	}
}












