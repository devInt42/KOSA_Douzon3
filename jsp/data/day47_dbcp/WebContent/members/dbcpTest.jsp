<%@page import="edu.kosa.members.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>connection test</title>
</head>
<body>
<%
	try{
		MemberDAO dao = MemberDAO.getInstance();
		out.print("3333connection success!!!");
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	

%>
</body>
</html>