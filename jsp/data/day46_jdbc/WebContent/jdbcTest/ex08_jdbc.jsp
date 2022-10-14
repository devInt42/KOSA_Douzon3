<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex08_jdbc.jsp</title>
</head>
<body>
	<%
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		out.print("drvier load success <br>");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Oracle/Wallet_edudb",
				"int42", "Frenzy4236!!");
		out.print("connection success <br>");

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		//conn.close();
	}
%>
</body>
</html>