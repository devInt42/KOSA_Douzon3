<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kosa.ex04.Emp" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex04_emp.jsp</title>
</head>
<body>
<%!
	public String message() {
		return "DouZone th3 화이팅!!";
	}
%>
<%
	Emp e = new Emp();  // 객체 생성
	out.print(e.toString() + "<p><hr>");
	
	e.setEmpno(7788);
	e.setName("감찬아");
	e.setPay(8000);
	
	int num = 99;
%>

<%=e.toString() %>
외부 package에 있는 클래스 객체 생성 <br/>
<%= 1+2+3 %><br/>
<%= num %><br/>
<%= message() %><br/>
</body>
</html>






