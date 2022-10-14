package edu.kosa.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kosa/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// DB ��ü
	public String user = "kingsmile";
	public String passwd = "1004";

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login call~~");
		
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			
			response.setCharacterEncoding("euc-kr");
			
			PrintWriter out = response.getWriter();
			out.write("<html><head><title> Login Result </title></head><body><b><br>");
			
			if( user.equals(id) && !passwd.equals(pwd) ) {
				out.println("��ȣ�� Ʋ�Ƚ��ϴ�. <br />");
				out.println("<a href='html/loginForm.html'> Login </a> ");
				
			} else if( user.equals(id) && passwd.equals(pwd) ) {
				out.println("�ݰ����ϴ�....���~~~ <br />");
				out.println("���� ���̵�� " + id + " �̱���<br />");
				out.println("���� ��й�ȣ�� " + pwd + " �Դϴ�. <br />");
			} else {
				out.println("��ϵ��� ���� ����� �Դϴ�. <br />");
				out.println("<a href='./html/loginForm.html'> Login </a> ");
			}
			
			out.println("</b></body></html>");
			out.close();
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
