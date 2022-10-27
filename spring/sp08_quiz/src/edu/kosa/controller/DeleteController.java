package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.GogakDAO;
import edu.kosa.model.GogakDTO;

@Controller
public class DeleteController {

	@Autowired
	private GogakDAO gogakDAO;

	@RequestMapping("/delete.do")
	public String write(Model model, HttpServletRequest request) {
		int gno = Integer.parseInt(request.getParameter("gno"));
		
		GogakDTO dto = new GogakDTO();
		dto.setGno(gno);
		
		gogakDAO.deleteGogak(dto);
		return "redirect:list.do";
	}
}