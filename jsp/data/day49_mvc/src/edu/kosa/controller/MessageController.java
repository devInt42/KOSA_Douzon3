package edu.kosa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controller")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 1. ���۹�� ����
	// 2. ����� ��û �м� (doGet / doPost )
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String msg = request.getParameter("msg");
		String douzone = "�츮�� ��� ���� ���ϴ�.";
		
		Object result = null;
		
		if( msg == null || msg.equals("test")) {
			result ="�޼����� ���ų�, test�� �Ѿ�Խ��ϴ�.";
		} else if( msg.equals("name")) {
			result ="���� �̸��� kingsmile �Դϴ�";
		} else if( msg.equals("aa")) {
			result ="���� �̸��� aa �Դϴ�";
		} else {
			result ="ã�� type�� ������";
		} // if end
		
		//3. ���� - request.setAttribute("����", �� �Ǵ� ���� (������) );
		request.setAttribute("result", result);
		request.setAttribute("str", douzone);
		
		//4. �̵��� �� ������ ����
		RequestDispatcher  dispatcher = 
				request.getRequestDispatcher("/jsp/messageView.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}





