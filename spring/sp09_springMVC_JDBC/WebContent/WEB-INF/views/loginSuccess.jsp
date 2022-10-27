<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginSuccess.jsp</title>
</head>
<body>
	<h3>${USERID } 님 회원이십니다. 어서오세요</h3>
	<form action="logout.kosa" method="post">
			<input type = "submit" value = "로그아웃"> <br/>
	</form>
</body>
</html>