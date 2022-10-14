<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>ex03_loginOK.jsp  Result Page</title>
</head>
<body>
<%
	/*
	1. 한글처리
	method="post"
	request.setCharacterEncoding("euc-kr");

	2. method="get"
	http://localhost:8080/day44_jsp/jsp/ex03_login.jsp?userId=kingsmile&pwd=1004&hobby=baseball&hobby=basketball
	
	<Connector URIEncoding="UTF-8"
  		connectionTimeout="20000" port="8080"protocol="HTTP/1.1"		redirectPort="8443"/>
	*/
	
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("userId");
	String pw = request.getParameter("pwd");

	//String[] hobbys = request.getParameterValues("hobby");
	Map map = request.getParameterMap();
	String[] hobbys = (String[])map.get("hobby");
	
%>
당신의  id : <%= id %> <br>
당신의  password : <%= pw %> <br>
당신의  취미는 : 

<%
	if( hobbys != null ) {
		for(int i =0; i < hobbys.length; i++) {
%>
	<%= hobbys[i] %> &nbsp; &nbsp; &nbsp;
<%
		} // for end
	} // if end
%>

</body>
</html>




