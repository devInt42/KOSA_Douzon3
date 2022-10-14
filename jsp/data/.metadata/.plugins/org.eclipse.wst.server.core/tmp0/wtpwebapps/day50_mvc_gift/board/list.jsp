<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="edu.kosa.board.controller.*,edu.kosa.board.model.*,  java.sql.* ,  java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>선물 리스트 보기</title>
</head>

<body>
	<center>
		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<td >번호</td>
				<td >이름</td>
				<td >최저가</td>
				<td >최고가</td>
			</tr>
			<%
			GiftDAO dao = GiftDAO.getInstance();
			ArrayList<GiftVO> list = dao.selectAll();
			GiftVO vo = null;

			for (int i = 0; i < list.size(); i++) {
				vo = (GiftVO) list.get(i);
				int gno = vo.getGno();
				String gname = vo.getGname();
				int g_start = vo.getG_start();
				int g_end = vo.getG_end();
			%>
			<tr>
				<td><%=gno%></td>
				<td><%=gname%></td>
				<td><%=g_start%></td>
				<td><%=g_end%></td>
			</tr>
			<%
				} // for end
			%>
		</table>
	</center>
</body>
</html>