<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>고객리스트</h1>

	<c:forEach items="${list }" var="list">
		${list.gno }
		${list.gname }
		${list.jumin }
		${list.point }<hr />

	</c:forEach>
		  <input type="reset"  value="취소"> &nbsp; &nbsp;
		  <input type="button" value="목록보기" onclick="javascript:window.location.href='list.do'  ">
		  <input type="button" value="정보입력" onclick="javascript:window.location.href='writeform.do'  ">
		  <input type="button" value="정보삭제" onclick="javascript:window.location.href='deleteform.do'  ">
		<input type="button" value="정보수정" onclick="javascript:window.location.href='updateform.do'  ">
		  
</body>
</html>