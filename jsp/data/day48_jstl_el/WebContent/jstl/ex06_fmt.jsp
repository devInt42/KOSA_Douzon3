<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jstl/fmt" %>


<%-- <fmt:setLocale value="en"/>
<fmt:requestEncoding  value="UTF-8" /> --%>
<fmt:setLocale value="ko_KR"/>
<fmt:requestEncoding  value="UTF-8" />
					
														  <!-- .properties 를 뺀 파일명만 기재 -->
 <fmt:bundle  basename="bundle.testBundle">	<!-- 경로.파일명 -->
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL fmt - bundle, message</title>
</head>
<body>
	<fmt:message key="name" />
	<fmt:message key="say" />
	<fmt:message key="message"  var="msg" />
<%-- 	<c:out value="${ msg }" />
 --%></body>
</html>

 </fmt:bundle>  
 
 