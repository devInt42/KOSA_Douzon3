<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!public int add(int x, int y) {
		return x + y;
	}

	public int mul(int x, int y) {
		return x * y;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_basic.jsp JSP Basic</title>
</head>
<body>
	Hello World
	<br />
	<%
		int i = 9999;
	%>
	변수 값 :
	<%=i%>
	<br /> 함수 호출 :
	<%
		int result = add(10, 2);
	int result2 = mul(30, 20);
	%>
	결과 :
	<%=result%>
	<p>
		결과2 :
		<%=result2%>
	<p>

		1~ 100 까지의 합을 출력 합니다.
		<%
		int sum = 0;
	for (int j = 1; j <= 100; j++) {
		sum += j;
	}
	out.print(sum);
	%>
	
	<h3>
		sum =
		<%=sum%></h3>
	<hr>
	<h3>구구단 전체 출력하기</h3>
	<%
	int res;
		for (int k = 2; k <= 9; k++) {
		for (int n = 1; n <= 9; n++) {
			out.print(k + "*" + n + "=" + k*n + "\t");
		}
		out.println("<br>"); 
	}
	%>
</body>
</html>









