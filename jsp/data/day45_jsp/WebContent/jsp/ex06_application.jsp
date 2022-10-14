<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06_application.jsp</title>
</head>
<body>
<h2>application 웹 경로</h2>
<!-- 
	가상경로 : (웹 브라우저에서 바라보는 경로)
	http://localhost:8080/day45_jsp/download/memo.txt
	
	물리적 경로 :
	C:\더존비즈온\jsp\data\day45_jsp\WebContent\download\memo.txt
	
	이클립스를 통한 톰캣 구동시 물리적 경로 :
	C:\더존비즈온\jsp\data\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\day45_jsp\download\memo.txt
 -->

<%
	request.setCharacterEncoding("utf-8");	
	String resourcePath = "/download/memo.txt";
	out.print(resourcePath + "<br>");
	//가상 경로에서 ----> 물리적 경로 얻어내기
	out.print(request.getContextPath() + "<br>");
	
	String contextPath = application.getRealPath(request.getContextPath());
	String realPath = application.getRealPath(resourcePath);
	out.print("contextPath : "+ contextPath + "<br/>");
	out.print("realPath : "+ realPath + "<br/>");

%>




</body>
</html>