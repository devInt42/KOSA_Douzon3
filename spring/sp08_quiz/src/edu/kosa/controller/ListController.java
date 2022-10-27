package edu.kosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.GogakDAO;

@Controller
public class ListController {

	@Autowired
	private GogakDAO gogakDao; // DB 연결 관련

	private void setGogakDao(GogakDAO gogakDao) {	//DI
		this.gogakDao = gogakDao;
	}

	@RequestMapping("/list.do")
	public String list(Model model) {
		List list = gogakDao.listGogak();

		model.addAttribute("list", list); // data save

		return "list"; // /WEB-INF/views/list.jsp
	}

}
