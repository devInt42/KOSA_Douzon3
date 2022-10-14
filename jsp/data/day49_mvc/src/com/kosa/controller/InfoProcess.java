package com.kosa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoProcess
 */
@WebServlet("/InfoProcess")
public class InfoProcess extends HttpServlet implements CommandProcess {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.getRequestDispatcher(doProcess(request, response)).forward(request, response);;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public String doProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setAttribute("name", "·ùÁ¤¼ö");
		request.setAttribute("tel","010-0000-0000");
		return "/view/myinfo.jsp";
	}

}