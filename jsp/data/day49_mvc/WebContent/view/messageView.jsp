<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>messageView.jsp</title>
</head>
<body>
전달된 결과 :
	<c:set  var="result"  value="${ message }" />
	<h2>${ result }</h2>
	<h2> <c:out value="${ result }"></c:out> </h2>
</body>
</html>