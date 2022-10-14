package com.kosa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/douzone")
public class MessageProcess extends HttpServlet implements CommandProcess {

	@Override
	public String doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws Throwable {
		
		// 저장
		request.setAttribute("message", "안녕, 힘내셩~~~ MVC 기반의 데이터 보내기");

		// 이동할 뷰 페이지
		return "/view/messageView.jsp";
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			RequestDispatcher d = request.getRequestDispatcher(doProcess(request, response));
			d.forward(request, response);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			RequestDispatcher d = request.getRequestDispatcher(doProcess(request, response));
			d.forward(request, response);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	
}
