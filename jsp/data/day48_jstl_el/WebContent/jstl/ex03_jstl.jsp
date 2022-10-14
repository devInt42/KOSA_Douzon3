<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="date.jsp"  var="today" />

<%-- <% request.setCharacterEncoding("utf-8");  %> --%>
<fmt:requestEncoding   value="UTF-8" />

<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>ex03_jstl.jsp  JSTL core, fmt libaray </title>
</head>
<body>
${ today } <br><hr>

파라미터 : <c:out value="${ param.id }" /> <br />
			    <c:out value="${ param['id'] }" /> <br /><p>

<form action="ex03_jstl.jsp"  method="post">
	<input type="text"  name="id">
	<input type="submit"  value="확인">
</form><hr>

<%
		String id2 = request.getParameter("id");
		out.print("id = " + id2 + "<br>" );
%>
</body>
</html>








