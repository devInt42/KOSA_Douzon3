<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"   pageEncoding="UTF-8"%>

<c:set  var="path"  value="${ pageContext.request.contextPath }"  />

<c:out  value="${ path }"  /> <p>
<hr>
${ pageContext.request.contextPath } <p>
${ pageContext.request.requestURI } <p>
${ pageContext.request.requestURL } <p>
${ pageContext.servletContext.contextPath } <p>


<html> <head>	<title>Home</title>
</head><body>
<h1>	Hello world!  </h1>

<%-- <c:url value="경로/파일명.확장자" /> --%>

<img alt="home" src="resources/Flowser2.jpg" /> <p>
<img alt="home" src="<c:url value="resources/Flowser2.jpg" />" /> <p>

<img alt="house" src="${ path }/images/1.jpg" />
<img alt="house2" src="${ path }/kosaData/2.jpg" />


<P>  The time on the server is ${time}. </P>
<div>
	name: ${name } <br>
	number : ${ num }<br>
	su : ${ su }
</div>
</body>
</html>
