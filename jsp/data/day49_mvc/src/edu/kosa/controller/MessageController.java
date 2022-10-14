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
	
	// 1. 전송방식 결정
	// 2. 사용자 요청 분석 (doGet / doPost )
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String msg = request.getParameter("msg");
		String douzone = "우리는 모두 더존 갑니다.";
		
		Object result = null;
		
		if( msg == null || msg.equals("test")) {
			result ="메세지가 없거나, test로 넘어왔습니다.";
		} else if( msg.equals("name")) {
			result ="나의 이름은 kingsmile 입니다";
		} else if( msg.equals("aa")) {
			result ="나의 이름은 aa 입니다";
		} else {
			result ="찾는 type이 없군요";
		} // if end
		
		//3. 저장 - request.setAttribute("변수", 값 또는 변수 (데이터) );
		request.setAttribute("result", result);
		request.setAttribute("str", douzone);
		
		//4. 이동할 뷰 페이지 지정
		RequestDispatcher  dispatcher = 
				request.getRequestDispatcher("/jsp/messageView.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}





