<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>messageView.jsp</title>
</head>
<body>
아무것도안뜸
   <h1>${result }</h1>
   <c:set value="${result }" var="result" />
   <h2>
      <font color="red" size="5"> <c:out value="${result}" /></font>
   </h2>
   
   <h1>${ str }</h1>
</body>
</html>