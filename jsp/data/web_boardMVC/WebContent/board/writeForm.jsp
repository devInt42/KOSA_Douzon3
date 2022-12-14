<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../view/color.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 글쓰기</title>
<link href = "../view/mystyle.css" rel = "stylesheet" type = text/css">
<script type = "text/javascript" src = "../view/script.js"></script>
</head>
  <!-- 답변글의 경우 : 부모글의 글번호, 그룹화 번호, 그룹내의 순서, 들여쓰기의 결정 -->
  <!-- content.jsp 페이지로 넘어옴(상세보기) -->

<body bgcolor = "${bodyback_c }">
<center><b>글쓰기</b></center><br>
<form action = "writePro.jsp" method="post" name = "writeform" onsubmit="return writeSave()">
	 <!-- 숨겨서 가져감 -->
	<input type="hidden" name="num" value="${num}">
	<input type="hidden" name="ref" value="${ref}">
	<input type="hidden" name="re_step" value="${re_step}">
	<input type="hidden" name="re_level" value="${re_level }">

<table width='400' border='1' cellspacing='0' cellpadding='0' bgcolor="${bodyback_c }"
align="center">

<tr>
	<td align = "right" colspan="2"  bgcolor="${value_c }">
	<a href = "list.jsp"> 글목록 보기</a>
	</td>
</tr>
<tr>
	<td width="70" bgcolor = "${value_c }" align = "center"> 이  름</td>
	<td width="330"><input type="text" size= "10" maxlenth="10" name ="writer"></td>
</tr>
<tr>
	<td width="70" bgcolor = "${value_c }" align = "center"> 제  목</td>
	<td width="330">
	<!-- 답변인것에 대한 처리 -->
	<c:if test="${num == null }">
		<input type= "text" size = "40" maxlength="50" name = "subject"></td>
	</c:if>
	<c:if test="${num != null }">
	<!-- 답변글이라면, 제목에 [답변] 출력 -->
<input type= "text" size = "40" maxlength="50" name = "subject" value ="[답변] "></td>
</c:if>
</tr>
<tr>
	<td width="70" bgcolor = "${value_c }" align = "center"> EMAIL</td>
	<td width="330"><input type="text" size= "40" maxlenth="30" name ="email"></td>
</tr>
<tr>
	<td width="70" bgcolor = "${value_c }" align = "center"> 내  용</td>
	<td width="330"><textarea rows="13" cols="40" name = "content"></textarea></td>
</tr>
<tr>
	<td width="70" bgcolor = "${value_c }" align = "center"> 비밀번호</td>
	<td width="330"><input type="password" size= "8" maxlenth="10" name ="passwd"></td>
</tr>
<tr>
	<td align="center" colspan="2" bgcolor="${value_c }">
	<input type = "submit" value = "글쓰기">
	<input type= "reset" value = "다시작성">
	<input type = "button" value = "목록보기" onclick="document.location='list.jsp'">
</tr>

</table>

</form>


</body>
</html>