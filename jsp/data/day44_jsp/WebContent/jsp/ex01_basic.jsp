<%@ page  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>ex01_basic.jsp    JSP Basic</title>
</head>
<body>

 <h2>  JSP  Basic </h2>
 <div>아무거나~~~</div><hr>
 
 <%
	// 스크립트릿 : 함수를 제외한 자바 코드- 자바, 변수선언, 제어문 등등.... 
	String str2 = "안녕!!!!22222  JSP를 이용한 웹 브라우저에 출력 합니다.";
%>
<h3><%= str2 %></h3><hr>

<%
	// 스크립트릿 : 함수를 제외한 자바 코드- 자바, 변수선언, 제어문 등등.... 
	String str = "안녕!!!!  JSP를 이용한 웹 브라우저에 출력 합니다.";
	out.print(str);
	
	int su = 300;
%><hr>

<%!
	// 선언문 : 자바, 변수선언, 함수 등등.... 
	
	public String show() {
		return "안녕 Jsp 입니다";
	}
%><hr>

<!-- 표현식 -->
<%= show() %><br />
<%= "문자열 출력입니다." %><br />
<%= 123547 %><br />
<h2>su + 200 =  <%= su + 200 %></h2>
<br><%= str %>

 
</body>
</html>






