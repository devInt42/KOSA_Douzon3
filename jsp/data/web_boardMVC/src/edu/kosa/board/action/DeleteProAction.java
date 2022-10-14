package edu.kosa.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kosta.board.controller.BoardDAO;

public class DeleteProAction implements CommandAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		BoardDAO  dao = BoardDAO.getInstance();
		String num = request.getParameter("num");
		String pageNum = request.getParameter("pageNum");
		
		int check = dao.delete(Integer.parseInt(num), request.getParameter("passwd"));
		
		// save
		request.setAttribute("num", num);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("check", check);

	return "/board/deletePro.jsp";
	}

}
