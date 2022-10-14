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
		
		// ����
		request.setAttribute("message", "�ȳ�, ������~~~ MVC ����� ������ ������");

		// �̵��� �� ������
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
