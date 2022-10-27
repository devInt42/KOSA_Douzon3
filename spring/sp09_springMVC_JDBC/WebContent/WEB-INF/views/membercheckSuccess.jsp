<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>membercheckSuccess</title>
</head>
<body>
	<h1>MembercheckSuccess</h1>

	<c:forEach items="${memberok.id }" var="memberok.id">
		${memberok.id }&nbsp;&nbsp;&nbsp;&nbsp;
		${memberok.name }&nbsp;&nbsp;&nbsp;&nbsp;
		${memberok.age }&nbsp;&nbsp;&nbsp;&nbsp;
	</c:forEach>
	
	<input type = "button" value = "뒤로가기" onclick = "javascript:location.href='check.kosa'"/>

</body>
</html>