package edu.kosa.board.action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ��û �Ķ���ͷ� ���ɾ �����ϴ� ����� ���� �������̽�
public interface CommandAction {

	public String process(HttpServletRequest request, 
				HttpServletResponse response) throws Exception;
}