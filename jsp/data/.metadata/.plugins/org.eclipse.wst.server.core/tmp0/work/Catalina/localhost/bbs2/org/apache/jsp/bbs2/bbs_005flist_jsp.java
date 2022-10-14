/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-07 01:17:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import my.bbs2.*;
import java.io.*;

public final class bbs_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("my.bbs2");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

	BbsManager mgr = BbsManager.getInstance();
	
	//총게시물 수
	int totalCount = mgr.getTotalGulCount();
	// 총게시물수:totalCount,
	// 페이지 사이즈 : pagesize --- ps[ 5개 단위로 보여주기 ]
	// 현재 페이지 : cpage ----- cp[1페이지, 2페이지....]
	// 페이지수 : pageCount

	String psStr = request.getParameter("ps");
	String cpStr = request.getParameter("cp");
	
	if(psStr == null || psStr.trim().equals("")){
		psStr=(String)session.getAttribute("ps");
		if(psStr==null|| psStr.trim().equals("")){
		psStr ="3"; // 기본페이지 사이즈로 3을 지정
					   // 즉 3개 단위로 보여주기 
		}
	}
	if(cpStr == null || cpStr.trim().equals("")){
		cpStr=(String)session.getAttribute("cp");
		if(cpStr==null|| cpStr.trim().equals("")){
			cpStr ="1"; 
		}
		// default = 현재페이지를 1페이지로 지정....
	}
	
	session.setAttribute("cp",cpStr);
	session.setAttribute("ps",psStr);
	
	int pageSize = Integer.parseInt(psStr.trim());
	int cpage = Integer.parseInt(cpStr.trim());
	int pageCount = 0;
	
	//페이지수 구하기.....
	//pageSize : 5개
	//totalCount :1~ 4 |  5
	//pageCount : 1    | 1
	
	//if(totalCount%pageSize == 0){
	//	pageCount = totalCount/pageSize;
	//}else{
	//	pageCount = totalCount/pageSize+1;	
	//}
	
	pageCount = (totalCount-1)/pageSize+1;
	
	///////////////////////////////////////////////////////
	ArrayList<BbsDTO> arr = mgr.listAll(cpage,pageSize);
	// 매개변수로 현재페이지[cpage]와 페이지사이즈[pageSize]를 넣어주자..
	///////////////////////////////////////////////////////
		
	
	
	

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>bbs_list.jsp</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("a:link { text-decoration:none; }\r\n");
      out.write("a:visited { text-decoration:none; }\r\n");
      out.write("a:active { text-decoration:none; }\r\n");
      out.write("a:hover { color:rgb(82,156,255); text-decoration:none; }\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("A:link, A:active A:visited { \r\n");
      out.write("color: red; \r\n");
      out.write("font-size: 11pt; \r\n");
      out.write("text-decoration: none; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A:visited { \r\n");
      out.write("color: green; \r\n");
      out.write("font-size: 11pt; \r\n");
      out.write("text-decoration: none; \r\n");
      out.write("}  \r\n");
      out.write("\r\n");
      out.write("A:hover { \r\n");
      out.write("color: 000000; \r\n");
      out.write("font-size: 11pt; \r\n");
      out.write("text-decoration: underline; \r\n");
      out.write("}  \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\r\n");
      out.write("		<font size=5 color=\"blue\" face=\"굴림체\">\r\n");
      out.write("			Kosta 게시판\r\n");
      out.write("		</font>\r\n");
      out.write("	<br>\r\n");
      out.write("	<hr width=500 color=\"red\">\r\n");
      out.write("	<a href=\"/bbs2/bbs2/bbs_write.jsp\">글쓰기</a>|<a href=\"/bbs2/bbs2/bbs_list.jsp\">HOME</a>\r\n");
      out.write("	<hr width=500 color=\"red\">\r\n");
      out.write("	<br>\r\n");
      out.write("	<!-- 페이지 사이즈 선택 select박스 -->\r\n");
      out.write("	<form name=\"f\" method=\"get\">\r\n");
      out.write("		<select name=\"ps\" onchange=\"submit()\">\r\n");
      out.write("		");
if (pageSize == 3) {
      out.write("\r\n");
      out.write("			<option value=\"3\" selected>페이지 SIZE선택 3</option>\r\n");
      out.write("		");
}else{ 
      out.write("\r\n");
      out.write("			<option value=\"3\">페이지 SIZE선택 3</option>	\r\n");
      out.write("		");
} 
			for(int i=5;i<=20;i+=5){
				if(pageSize==i){
		
      out.write("\r\n");
      out.write("					<option value=\"");
      out.print(i );
      out.write("\" selected>페이지 SIZE선택 ");
      out.print(i );
      out.write("\r\n");
      out.write("		");
			
				}else{
		
      out.write("\r\n");
      out.write("					<option value=\"");
      out.print(i );
      out.write("\">페이지 SIZE선택 ");
      out.print(i );
      out.write("\r\n");
      out.write("		");

				} //else -----
			} // for ----------
		
		
		
      out.write("\r\n");
      out.write("		</select>\r\n");
      out.write("	\r\n");
      out.write("	</form>\r\n");
      out.write("	<table width=500 border=1>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=\"10%\">순번</th>\r\n");
      out.write("			<th width=\"40%\">제목</th>\r\n");
      out.write("			<th width=\"15%\">글쓴이</th>\r\n");
      out.write("			<th width=\"20%\">날짜</th>\r\n");
      out.write("			<th>조회</th>\r\n");
      out.write("		</tr>\r\n");

		
	if( arr ==null || arr.size()==0){

      out.write("	\r\n");
      out.write("	<Tr>\r\n");
      out.write("		<td colspan = 5 align=\"center\">서버오류이거나 게시물이 없어요</td>\r\n");
      out.write("	</Tr>		\r\n");

	}else{
		ListIterator it = arr.listIterator();
		// 성민이 코드
		// for(BbsDTO : arr)
		while(it.hasNext()){
			BbsDTO dto = (BbsDTO)it.next();
		// 말줄임표 사용하기 위해셔~~	
			String subject = dto.getSubject();
			String writer = dto.getWriter();
			
		if(subject != null && subject.length() >10){
			// 제목이 10문자 이상이라면...
			subject = subject.substring(0,11);
			subject += "...";
		}
		
		if(writer != null && writer.length() >10){
			// 제목이 10문자 이상이라면...
			writer = writer.substring(0,11);
			writer += "...";
		}
			

      out.write("\r\n");
      out.write("		<tr align=\"center\">\r\n");
      out.write("			<td>");
      out.print( dto.getIdx() );
      out.write("</td>\r\n");
      out.write("			<td align=\"left\">\r\n");
      out.write("			");
//쿼리 스트링 만들기...
				// 들여쓰기 하기 위해서~
				String qstr = "refer="+dto.getRefer()+"&sunbun="+dto.getSunbun()+"&lev="+dto.getLev()+"&";
			
				int lev = dto.getLev(); //답글 들여쓰기
				for(int i=0; i<lev; i++){
					out.println("&nbsp;&nbsp;&nbsp;");
				}
				if(lev >0){ // 답글이라면....
					out.println("-->");
				}
			
      out.write("\r\n");
      out.write("			<a href=\"bbs_content.jsp?");
      out.print(qstr);
      out.write("idx=");
      out.print(dto.getIdx());
      out.write("&cp=");
      out.print(cpage);
      out.write("&ps=");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("				");
      out.print( subject );
      out.write("\r\n");
      out.write("			</a></td>\r\n");
      out.write("			<td><a href=\"mailto:");
      out.print(dto.getEmail() );
      out.write("\">\r\n");
      out.write("				");
      out.print( writer );
      out.write("\r\n");
      out.write("			</a></td>\r\n");
      out.write("			<td>");
      out.print( dto.getWritedate() );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print( dto.getReadnum() );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");

		}
	}

      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=5 align = center>\r\n");
      out.write("			<hr width=500 color=greed>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td colspan=3 align=\"center\">\r\n");
 
	if(cpage >1){

      out.write("\r\n");
      out.write("		<a href=\"bbs_list.jsp?cp=");
      out.print(cpage-1);
      out.write("&ps=");
      out.print(pageSize);
      out.write("\">◀이전</a>|\r\n");
		
	} // if ------

	for(int i =1; i<=pageCount; i++){

		if(cpage == i){

      out.write("\r\n");
      out.write("			[");
      out.print( i );
      out.write("]\r\n");
      out.write("\r\n");

		}else{

      out.write("\r\n");
      out.write("			<a href=\"bbs_list.jsp?cp=");
      out.print(i);
      out.write("&ps=");
      out.print(pageSize);
      out.write('"');
      out.write('>');
      out.write('[');
      out.print( i );
      out.write("]</a>\r\n");

		}
	} // for --------------
	if(cpage < pageCount){

      out.write("\r\n");
      out.write("		|<a href=\"bbs_list.jsp?cp=");
      out.print(cpage+1);
      out.write("&ps=");
      out.print(pageSize);
      out.write("\">이후▶</a>\r\n");

	}

      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("\r\n");
      out.write("			<td colspan=2 align=\"center\">총 게시물수 :<font 	color=\"red\"><b> ");
      out.print( totalCount );
      out.write("</b></font> \r\n");
      out.write("			<br>현재 페이지<font color=\"blue\"> ");
      out.print(cpage);
      out.write("</font>/");
      out.print(pageCount );
      out.write(" </td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	\r\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}