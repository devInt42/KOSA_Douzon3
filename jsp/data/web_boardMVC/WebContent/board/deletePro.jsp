<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="edu.kosta.board.controller.*,java.sql.Timestamp"   %>
<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="vo" class="edu.kosta.board.model.BoardVO">
	<jsp:setProperty name="vo" property="*"  />
</jsp:useBean>



<c:if  test="${ check == 0 }">

	<script type="text/javascript">
		<!--
			alert("비밀 번호가 맞지 않습니다.");
			history.go(-1);
		//-->
	</script>
</c:if>

<c:if  test="${ check == 1 }">	
		<meta http-equiv="Refresh"  content="0; url=list.jsp?pageNum=${ pageNum }">
</c:if>





