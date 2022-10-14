<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>test.jsp</title>
</head>
<body>

	<!-- http://localhost:8080/day42_jQuery/ajax/exam00/test.jsp -->
	
	<form action="test.jsp"  method="get">
		 ID : <input  type="text"  name="id"  placeholder="id input"> <br />
		 PWD: <input  type="password"  name="pwd"  placeholder="password input"> <br />
		 <input type="submit"  value="Send">
	</form><p><hr>
</body>

<%
	 String id = request.getParameter("id");
	 String pwd = request.getParameter("pwd");
	 
	 out.print(id + ", " + pwd);
%>
</html>