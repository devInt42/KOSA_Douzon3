<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>Hello Page</title>
</head>
<body>
<h1>Hello Page</h1>
인사 합시다! :
	<h3>${ greeting }</h3>
	
	<input type="button" value="목록보기" onclick="javascript:window.location.href='list.do' ">
	
</body>
</html>