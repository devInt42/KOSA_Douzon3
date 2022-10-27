<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta charset="UTF-8">
<title>updateform.jsp   Delete Page</title>
</head>
<body>
	<h3>고객 정보 입력</h3>
	<form action="update.do"  method="post">
		수정 하고자하는 고객번호를 입력해주세요
		고객번호 :  <input type="text"  name="gno"> <br />
		  
		  수정하고싶은 내용을 입력해주세요
		고 객 명 :  <input type="text"  name="gname"> <br />
		주민번호 :   <input type="text"  name="jumin"> <br />
		포 인 트 : <input type="text"  name="point"> <br />
		  <input type="submit"  value="제출"> &nbsp; &nbsp;
		  <input type="reset"  value="취소"> &nbsp; &nbsp;
		  <input type="button" value="목록보기" onclick="javascript:window.location.href='list.do'  ">
		  
	</form>
</body>
</html>