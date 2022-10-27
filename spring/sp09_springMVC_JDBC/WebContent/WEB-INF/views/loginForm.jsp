<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.kosa" method = "post">
		ID : <input type = "text" name ="id"> <br/>
		PWD : <input type = "password" name ="pwd"> <br/>
		<input type = "submit" value ="로그인">&nbsp;&nbsp;&nbsp;<input type = "reset" name ="취 소"> <br/>
		<input type="button" value="회원가입" onclick="javascript:window.location.href='join.kosa'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="아이디확인" onclick="javascript:window.location.href='check.kosa'">&nbsp;&nbsp;&nbsp;
		
	</form>

</body>
</html>