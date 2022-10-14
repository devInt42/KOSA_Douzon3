
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page  import="edu.kosta.board.controller.BoardDAO" %>
<%@page import="edu.kosta.board.model.BoardVO"%>
<%@ page import="java.util.*  ,  java.text.SimpleDateFormat"  %>

<%@ include file = "../view/color.jsp" %>


<html><head><title>게시판</title></head>
<link href="../view/mystyle.css" rel="stylesheet" type="text/css">
<body bgcolor=" ${  bodyback_c } ">
	<center>
		<b>글 목록(전체 글 : ${ count })
		</b>
	
	<table width="800">
		<tr>
			<td bgcolor="${ value_c }" align="right"><a href="writeForm.jsp">글쓰기</a>
			</td>
		</tr>
	</table>
	
<c:if test="${ count == 0 }">
	<table width="800" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">게시판에 저장된 글이 없습니다.</td>
		</tr>
	</table>
</c:if>
	
<c:if test="${ count > 0 }">
	<table width="800" border="1" cellpadding="0" cellspacing="0"		align="center">
		<tr height="30" bgcolor="${ value_c }">
			<td align="center" width="50">번 호</td>
			<td align="center" width="50">제 목</td>
			<td align="center" width="50">작성자</td>
			<td align="center" width="100">작성날짜</td>
			<td align="center" width="50">조회수</td>
			<td align="center" width="50">I P</td>

	<c:forEach var="list" items="${ list }">
	///////////////////////////////////////////////////////////////////////////
		<tr height="30" >
			<td align="center" width="70">${  number - 1 } </td>
			<td width="250">
			
	<%
	 		int wid = 0;
			if( vo.getRe_level() > 0 ) {  //답변글이라면,....
				wid = 5 * (vo.getRe_level());
	%><img src="../images/level.gif " width="<%=wid %>"  height="16" >	
			<img src="../images/re.gif" >
	</c:if>
	<% }else  { %>	
	<c:if test=" ">
		<img src="../images/re.gif" width="<%=wid %>"  height="16" >
	<% } // if end  %>	
	</c:if>	
	
		<a href="content.jsp?num=<%=vo.getNum() %>&pageNum=<%=currentPage %>">
				<%= vo.getSubject() %>
		</a>
		
	<%
			if ( vo.getReadcount() >= 3 ) {
	%> <img src="../images/hot.gif" width="<%=wid %>"  height="16" >
	<%    } // if end %>
			</td>
			<td align="center"  width="100">
					<a href="mailto:<%=vo.getEmail()%>" > <%=vo.getWriter()%> </a></td>
			<td align="center"  width="250"><%= sdf.format(vo.getReg_date()) %> </td>
			<td align="center"  width="150"><%= vo.getReadcount() %> </td>
			<td align="center"  width="150"><%= vo.getIp() %> </td>
		</tr>
	<% } //for end %>
</c:forEach>
	
	</table>
	<% } %>
	
	<%
			if( count > 0 ) {  //전체 페이지의 수를 연산
				int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1 );
				int startPage = (int)(currentPage / 5 ) * 5 + 1 ;
				int pageBlock = 5;
				int endPage = startPage + pageBlock - 1 ;
				
				if ( endPage > pageCount ) endPage = pageCount ;
				
				if ( startPage >5 ) {			
	%>
			<a href="list.jsp?pageNum=<%=startPage-5 %>">[이전]</a>		
	<%
				} //if end
				
				for( int i = startPage ; i <= endPage ;  i++ ) {
	%>
			<a href="list.jsp?pageNum=<%=i %>"><%=i %></a>	
	<%
				} // for end
				if ( endPage < pageCount ) {			
	%>
		<a href="list.jsp?pageNum=<%=startPage+5 %>">[다음]</a>	
	<%
				} //  if end
			} //out if end
	%>
</body>
</center>
</html>
