package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kosa.model.GogakDAO;
import edu.kosa.model.GogakDTO;

@Controller
public class WriteController {

	@Autowired
	private GogakDAO gogakDAO;

	@RequestMapping("/write.do")
	public String write(Model model, HttpServletRequest request) {
		int gno = Integer.parseInt(request.getParameter("gno"));
		String gname = request.getParameter("gname");
		String jumin = request.getParameter("jumin");
		int point = Integer.parseInt(request.getParameter("point"));

		GogakDTO dto = new GogakDTO();
		dto.setGno(gno);
		dto.setGname(gname);
		dto.setJumin(jumin);
		dto.setPoint(point);
		gogakDAO.insertGogak(dto);
		return "redirect:list.do";
	}

}
