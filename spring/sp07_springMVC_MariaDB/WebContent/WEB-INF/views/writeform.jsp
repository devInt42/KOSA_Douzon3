<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>writeform.jsp   Write Page</title>
</head>
<body>
	<h3>회사 지점 위치 글쓰기</h3>
	<form action="write.do"  method="post">
		지점번호 :  <input type="text"  name="deptno"> <br />
		영업소명 :  <input type="text"  name="deptname"> <br />
		위      치 :   <input type="text"  name="deptloc"> <br />
		
		  <input type="submit"  value="지점쓰기"> &nbsp; &nbsp;
		  <input type="reset"  value="취소"> &nbsp; &nbsp;
		  <input type="button" value="목록보기" onclick="javascript:window.location.href='list.do'  ">
		  
	</form>
</body>
</html>