package edu.kosa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandProcess;

public class WriteController extends HttpServlet implements CommandProcess {

	@Override
	public String doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		request.setAttribute("message", "Write Page ?Դϴ?");
		
		return "/board/write.jsp";
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			RequestDispatcher  d = req.getRequestDispatcher(doProcess(req, resp));
			d.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		try {
			RequestDispatcher  d = req.getRequestDispatcher(doProcess(req, resp));
			d.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
