<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>
	<h2>${ title }</h2>
	<h2>${ writer }</h2>
	<h2>${ content }</h2>
	<button onclick="history.back()">뒤로가기</button>&nbsp;&nbsp;
	<button onclick="history.go(-1)">go(-1)</button>
</body>
</html>