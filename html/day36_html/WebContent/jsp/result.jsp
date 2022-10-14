<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>결과창</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pass = request.getParameter("pwd");
	String email = request.getParameter("mail");
	out.print(name + "님 반갑습니다. 비번은 : " + pass + "\n" + email);
%>	
</body>
</html>