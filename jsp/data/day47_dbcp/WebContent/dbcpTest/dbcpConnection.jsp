<%@page import="javax.naming.*, java.sql.*, javax.sql.DataSource"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcpConnection.jsp</title>
</head>
<body>
	<%
try{
	Context initCtx = new InitialContext();
	Context envCtx = (Context) initCtx.lookup("java:comp/env");
	DataSource ds = (DataSource) envCtx.lookup("jdbc:dbcpTestDB");
	
	Connection conn = ds.getConnection();
	
	out.println("DBCP Connection success...<br><br>");
	
}catch(Exception e){ 
	e.printStackTrace();
}
%>
</body>
</html>