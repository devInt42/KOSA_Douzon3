<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz.jsp</title>
</head>
<body>
	<div>
		${name} <br>
		<hr>
		파라미터
		<form action="" method="post">
			이름 : <input type="text" name="name"><br> 주소 : <input
				type="text" name="addr"><br> <input type="submit"
				value="확인">
		</form>
		이름 :
		<c:out value="${param.name}" />
		<br> 주소 :
		<c:out value="${param.addr}" />
	</div>

	2. 1~100까지 숫자 중에서 3의 배수의 개수와 합을 출력하는 프로그램 작성하기
	<div>
		<c:set var="sum" value="0" />
		<c:set var="cnt" value="0" />
		<c:forEach var="i" begin="1" end="100" step="1">
			<c:if test="${i%3==0}">
				<c:set var="cnt" value="${cnt + 1}" />
				<c:set var="sum" value="${sum + i}" />
			</c:if>
		</c:forEach>

		3의 배수의 합 : ${sum}<br>
		3의 배수의 개수 : ${cnt}
		
	</div>
</body>
</html>