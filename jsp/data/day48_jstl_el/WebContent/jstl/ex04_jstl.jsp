<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex04_jstl.jsp  JSTL core - set, out, remove </title>

<script  src="https://code.jquery.com/jquery-3.6.1.slim.min.js"></script>

</head>
<body>
<img alt = "test" src = "../images/1.jpg">
<h3> JSTL core - set, out, remove</h3>
<p>Browser 변수 값 설정 
<c:set  var="browser"   value="${ header['user-agent'] }"/> <br />
<c:set  var="browser2"   value="${ header['cookie'] }"/> <br />
<c:out value="${ browser }" /><p>
<h2>그냥 EL : ${ browser } </h2><hr>
</p>
<p>browser 변수 값 제거 후
<c:remove var="browser"/>
<c:out value="${ browser }" /><p>
</p>
</body>
</html>