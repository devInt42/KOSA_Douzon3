<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include  file="" %> --%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>ex07_maininfo.jsp Main Info</title>
</head>
<body>
<h1>Main Info</h1>
<table style="width: 700px">
	<tr>
		<td colspan="2">
			<jsp:include page="/module/Top.jsp"  />
		</td>
	</tr>
	<tr>
		<td style="width: 200px">
			<jsp:include page="/module/Left.jsp"  />
		</td>
		
		<td style="width: 500px">
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
			Web Site Main Context...................................<br />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/module/Bottom.jsp"  />
		</td>
	</tr>
</table>
</body>
</html>




