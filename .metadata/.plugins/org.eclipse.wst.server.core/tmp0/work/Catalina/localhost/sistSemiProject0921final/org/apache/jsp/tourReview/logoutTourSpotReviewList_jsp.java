/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-21 01:48:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tourReview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import data.dto.TourSpotDto;
import data.dto.TourReviewDto;
import data.dto.GuestDto;
import data.dao.GuestDao;
import data.dao.MemberDao;
import data.dto.GuestCommentDto;
import data.dao.GuestCommentDao;
import data.dto.GuestCommentDto;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import data.dto.GuestReviewDto;
import java.util.List;
import data.dao.GuestTourSpotReviewDao;

public final class logoutTourSpotReviewList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("data.dto.GuestDto");
    _jspx_imports_classes.add("data.dao.GuestCommentDao");
    _jspx_imports_classes.add("data.dao.GuestTourSpotReviewDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("data.dao.MemberDao");
    _jspx_imports_classes.add("data.dto.TourSpotDto");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("data.dto.GuestCommentDto");
    _jspx_imports_classes.add("data.dao.GuestDao");
    _jspx_imports_classes.add("data.dto.TourReviewDto");
    _jspx_imports_classes.add("data.dto.GuestReviewDto");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link\r\n");
      out.write("   href=\"https://fonts.googleapis.com/css2?family=Cute+Font&family=Dongle:wght@300&family=Gamja+Flower&family=Gowun+Batang&family=Gowun+Dodum&family=Hi+Melody&family=Nanum+Gothic&family=Nanum+Gothic+Coding&family=Nanum+Pen+Script&family=Poor+Story&family=Sunflower:wght@300&display=swap\"\r\n");
      out.write("   rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("   href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("   rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.0/font/bootstrap-icons.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("$(\"span.likes\").click(function() {\r\n");
      out.write("      \r\n");
      out.write("      var num=$(this).attr(\"num\");\r\n");
      out.write("      //alert(num);\r\n");
      out.write("      var tag=$(this);\r\n");
      out.write("      \r\n");
      out.write("      $.ajax({\r\n");
      out.write("         \r\n");
      out.write("         type:\"get\",\r\n");
      out.write("         dataType:\"json\",\r\n");
      out.write("         url:\"tourReview/likes.jsp\",\r\n");
      out.write("         data:{\"num\":num},\r\n");
      out.write("         success:function(data){\r\n");
      out.write("            \r\n");
      out.write("            //alert(data.likes);\r\n");
      out.write("            tag.next().text(data.likes);\r\n");
      out.write("          \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("         });\r\n");
      out.write("      });\r\n");
      out.write("$(\"span.answer:eq(0)\").click(function() {\r\n");
      out.write("    \r\n");
      out.write("    // $(this).prev().toggle();\r\n");
      out.write("    //$(this).next().toggle()\r\n");
      out.write("    $(\"div.answer:eq(0)\").toggle();\r\n");
      out.write("    \r\n");
      out.write("  });\r\n");
      out.write("$(\"span.answer:eq(1)\").click(function() {\r\n");
      out.write("    \r\n");
      out.write("    // $(this).prev().toggle();\r\n");
      out.write("    //$(this).next().toggle()\r\n");
      out.write("    $(\"div.answer:eq(1)\").toggle();\r\n");
      out.write("    \r\n");
      out.write("  });\r\n");
      out.write("$(\"span.answer:eq(2)\").click(function() {\r\n");
      out.write("    \r\n");
      out.write("    // $(this).prev().toggle();\r\n");
      out.write("    //$(this).next().toggle()\r\n");
      out.write("    $(\"div.answer:eq(2)\").toggle();\r\n");
      out.write("    \r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  $(\"span.answer\").click();\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   /* function showStars(sv,seq){\r\n");
      out.write("      for(var i=1;i<sv;i++){\r\n");
      out.write("         $(\"#n\"+seq+\" i.star\"+i+\"0\").attr(\"class\",\"bi bi-star-fill star\"+i+\"0\");\r\n");
      out.write("      }\r\n");
      out.write("      if(sv*2%2==0){\r\n");
      out.write("         $(\"#n\"+seq+\" i.star\"+sv+\"0\").attr(\"class\",\"bi bi-star-fill star\"+sv+\"0\");\r\n");
      out.write("      }\r\n");
      out.write("      else{\r\n");
      out.write("         $(\"#n\"+seq+\" i.star\"+(sv+0.5)+\"0\").attr(\"class\",\"bi bi-star-half star\"+sv+\"0\");\r\n");
      out.write("      }\r\n");
      out.write("   } */\r\n");
      out.write("   function showStars(sv){\r\n");
      out.write("      var s=\"\";\r\n");
      out.write("      var empty=\"<i class='bi bi-star'>\";\r\n");
      out.write("      var half=\"<i class='bi bi-star-half'>\";\r\n");
      out.write("      var full=\"<i class='bi bi-star-fill'>\"\r\n");
      out.write("      if(sv==0){\r\n");
      out.write("         s+=empty+empty+empty+empty+empty;\r\n");
      out.write("      }\r\n");
      out.write("      else if(sv*2%2==0){\r\n");
      out.write("         for(var i=1;i<=sv;i++){\r\n");
      out.write("            s+=full;\r\n");
      out.write("         }\r\n");
      out.write("         for(var i=5;i>sv;i--){\r\n");
      out.write("            s+=empty;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      else{\r\n");
      out.write("         for(var i=1;i<sv;i++){\r\n");
      out.write("            s+=full;\r\n");
      out.write("         }\r\n");
      out.write("         s+=half;\r\n");
      out.write("         for(var i=4;i>sv;i--){\r\n");
      out.write("            s+=empty;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      return s;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" div.table {\r\n");
      out.write("   border: 1px solid gray;\r\n");
      out.write("   margin: 20px auto;\r\n");
      out.write("   padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title {\r\n");
      out.write("   flex-grow: 1;\r\n");
      out.write("   white-space: nowrap;\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("   text-overflow: ellipsis;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".photo {\r\n");
      out.write("   width: 80px;\r\n");
      out.write("   height: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bi {\r\n");
      out.write("   cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("   margin: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.table+* {\r\n");
      out.write("   margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".review-content {\r\n");
      out.write("   margin-top: 500px;\r\n");
      out.write("   white-space: pre-wrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("   i{\r\n");
      out.write("      color: orange;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");


String loginok = (String) session.getAttribute("loginok");

GuestTourSpotReviewDao dao = new GuestTourSpotReviewDao();
ArrayList<GuestReviewDto> list = dao.getAllGuestReviews();


int totalCount = dao.getTotalCount(); //전체 개수
int totalPage; //총 페이지 수
int startPage; //각 블럭에서 보여질 시작페이지
int endPage; //각 블럭에서 보여질 끝페이지   
int startNum; //db에서 가져올 글의 시작번호 (mysql은 첫글이 0,오라클은 1)
int perPage = 3; //한 페이지당 보여지는 글의 개수
int perBlock = 5; //한 블럭당 보여지는 페이지 개수
int currentPage; //현재 페이지
int no; //각 페이지당 출력할 시작번호

//현재페이지 읽기(단 null일 경우는 1페이지로 준다)계산을 해야하므로 int로 형변환 해줌
if (request.getParameter("currentPage") == null)
   currentPage = 1;
else
   currentPage = Integer.parseInt(request.getParameter("currentPage"));

//총 페이지수 구하기
//총 글의 개수 / 한 페이지당 보여질 개수로 나눔(7/5=1)
//나머지가 1이라도 있으면 무조건 1페이지 추가(1+1=2페이지가 필요)

totalPage = totalCount / perPage + (totalCount % perPage == 0 ? 0 : 1);
//예)  7개 = 전체 글 20개 / 한페이지당 보이는 개수 3  + ( )
//각 블럭당 보여야 할 시작페이지
//perBlock=5일 경우는 현재 페이지 1~5 시작:1 끝:5
//현재페이지 13  시작:11 끝:15
startPage = (currentPage - 1) / perBlock * perBlock + 1;
//     

endPage = startPage + perBlock - 1;

//총페이지가 23일 경우 마지막블럭은 25가 아니라 23이다     
if (endPage > totalPage)
   endPage = totalPage;

//각 페이지에서 보여질 시작번호
//1페이지:0, 2페이지:5 3페이지:10...
startNum = (currentPage - 1) * perPage;

//각페이지당 출력할 시작번호 구하기 no
//총 글개수가 23이면 1페이지 23, 2페이지는 18, 3페이지:13...
no = totalCount - (currentPage - 1) * perPage;

//페이지에서 보여질 글만 가져오기
List<GuestReviewDto> guestreviewlist = dao.getPagingList(startNum, perPage);



      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "logoutTourSpotReviewForm.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");

   if (guestreviewlist.size() == 0) {
   
      out.write("\r\n");
      out.write("   <tr>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <a style=\"margin-left: 650px;\"><b>등록된 게시글이 없습니다</b></a>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <table class=\"table table-bordered\" style=\"margin-top: 300px; \">\r\n");
      out.write("      ");

      } else {

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      out.write("\r\n");
      out.write("      <div style=\"margin-top: 150px;\"></div>\r\n");
      out.write("\r\n");
      out.write("      ");

      for (int i = 0; i < guestreviewlist.size(); i++) {
         GuestReviewDto guestreviewdto = guestreviewlist.get(i);
      
      out.write("\r\n");
      out.write("      <div class=\"table table-bordered\" style=\"width: 1135px; margin-left: 180px; padding: 20px; \">\r\n");
      out.write("         <tr>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-8\">\r\n");
      out.write("                  ");
      out.print(no--);
      out.write("\r\n");
      out.write("                  <a style=\"font-size: 0.9em\">&nbsp;&nbsp;\r\n");
      out.write("                  <i class=\"bi bi-person-circle\" style=\"font-size: 30px;\"></i>&nbsp;&nbsp;&nbsp;");
      out.print(guestreviewdto.getNickname());
      out.write("</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                  <a><b>&nbsp;&nbsp;");
      out.print(guestreviewdto.getTitle());
      out.write("</b></a>\r\n");
      out.write("                  ");
double sv=guestreviewdto.getStars()!=null?Double.parseDouble(guestreviewdto.getStars()):0;
      out.write("\r\n");
      out.write("                  <div data-index=\"");
      out.print( i );
      out.write("\" class=\"d\">\r\n");
      out.write("               <script>\r\n");
      out.write("               var starsHtml = showStars(");
      out.print(sv);
      out.write(");\r\n");
      out.write("               var divs = document.querySelectorAll('div.d');\r\n");
      out.write("                  divs.forEach(function(div) {\r\n");
      out.write("                      var dataIndex = div.getAttribute('data-index');\r\n");
      out.write("                      if (dataIndex == ");
      out.print(i);
      out.write(") {\r\n");
      out.write("                         div.innerHTML = starsHtml;\r\n");
      out.write("                      }\r\n");
      out.write("                      });\r\n");
      out.write("               </script>\r\n");
      out.write("               ");
      out.print(sv );
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-md-4 text-end\">\r\n");
      out.write("                  <td>\r\n");
      out.write("                     <div float=\"right;\">\r\n");
      out.write("                        <span class=\"likes\"><a style=\"font-size: 0.7em; color: gray;\">좋아요</a>&nbsp;\r\n");
      out.write("                        <i class=\"bi bi-hand-thumbs-up\" style=\"color: gray;\"></i>&nbsp;&nbsp;&nbsp;");
      out.print(guestreviewdto.getLikes());
      out.write("</span>\r\n");
      out.write("                        <a style=\"font-size: 0.7em; color: gray;\">작성일&nbsp;");
      out.print(sdf.format(guestreviewdto.getWriteday()));
      out.write("</a>&nbsp;&nbsp;\r\n");
      out.write("                        <a style=\"font-size: 0.7em; color: gray;\">조회수&nbsp;");
      out.print(guestreviewdto.getViewcount());
      out.write("</a>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </td>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <br>\r\n");
      out.write("            <tr class=\"photo\">\r\n");
      out.write("            <td>");
      out.print(guestreviewdto.getPhoto());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <br>\r\n");
      out.write("         <td>내용&nbsp;&nbsp;");
      out.print(guestreviewdto.getContent());
      out.write("</td> \r\n");
      out.write("         <br> \r\n");
      out.write("         <br>\r\n");
      out.write("         <br>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
      
               //각 방명록에 달린 댓글 목록 가져오기
               GuestCommentDao guestcommentdao = new GuestCommentDao();
              
               List<GuestCommentDto> glist = guestcommentdao.getAllGuestComments(guestreviewdto.getCom_seq());
               String writer = request.getParameter("writer");
               String pass2 = request.getParameter("pass2");
               
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <form action=\"tourReview/guestCommentInsert.jsp\" method=\"post\">\r\n");
      out.write("      \r\n");
      out.write("         <div class=\"d-flex\">\r\n");
      out.write("         <input type=\"text\" name=\"writer\" class=\"form-control\">\r\n");
      out.write("         <input type=\"password\" name=\"pass\" class=\"form-control\">\r\n");
      out.write("            <textarea style=\"width: 1000px; height: 120px; margin-right: 50px;\"\r\n");
      out.write("               name=\"content\"  class=\"form-control\"></textarea>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-outline-dark\"\r\n");
      out.write("               style=\"width: 100px; height: 100px; margin-bottom: 40px;\">등록</button>\r\n");
      out.write("   \r\n");
      out.write("         </div>\r\n");
      out.write("         <input type=\"hidden\" name=\"com_seq\"   value=\"");
      out.print(guestreviewdto.getCom_seq());
      out.write("\"> \r\n");
      out.write("         \r\n");
      out.write("         <input type=\"hidden\" name=\"currentPage\" value=\"");
      out.print(currentPage);
      out.write("\">\r\n");
      out.write("         </form>\r\n");
      out.write("         </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      <span class=\"answer\" style=\"cursor: pointer;\"\r\n");
      out.write("               num=");
      out.print(guestreviewdto.getCom_seq());
      out.write(">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <i class=\"bi bi-chat-dots-fill\" id=\"id");
      out.print(guestreviewdto.getCom_seq() );
      out.write("\" style=\"\"></i>&nbsp;&nbsp;댓글 ");
      out.print(glist.size() );
      out.write("</span>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");

      

      String com_seq = guestreviewdto.getCom_seq();
         GuestCommentDao guestCommentDao = new GuestCommentDao();
            List<GuestCommentDto> gcList = guestcommentdao.getAllGuestComments(com_seq);
            MemberDao memberDao = new MemberDao();
      out.write("\r\n");
      out.write("            \r\n");
      out.write("         <div class=\"answer\">\r\n");
      out.write("            <table class=\"table\" style=\"width:1118px;margin-left: 180px;\">\r\n");
      out.write("               ");

                  for(GuestCommentDto g : gcList){ 
      out.write("\r\n");
      out.write("                     <tr>\r\n");
      out.write("                     <!-- <td width=\"60\">\r\n");
      out.write("                     <i class=\"bi bi-person-circle\"></i>\r\n");
      out.write("                     </td> -->\r\n");
      out.write("                     <td>\r\n");
      out.write("                     <i class=\"bi bi-person-circle\"></i>\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                     <b>");
      out.print(g.getWriter() );
      out.write("</b>\r\n");
      out.write("                     &nbsp;\r\n");
      out.write("                     \r\n");
      out.write("\r\n");
      out.write("                     <span style=\"font-size:9pt;color:gray;margin-left:20px\">");
      out.print(sdf.format(g.getWriteday()) );
      out.write("</span>\r\n");
      out.write("                     <br>\r\n");
      out.write("                     <span class=\"scontent\">");
      out.print(g.getGuestcomment().replace("\n","<br>") );
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("                        <i class=\"bi bi-trash3 adel\" style=\"color: red; cursor: pointer; float:right; font-size:20px\" com_seq=");
      out.print(g.getCom_seq() );
      out.write("></i>\r\n");
      out.write("                        <i class=\"bi bi-pencil-square aup\" data-bs-toggle=\"modal\" style=\"color: green; cursor: pointer; float:right; font-size:20px\" com_seq=");
      out.print(g.getCom_seq() );
      out.write("></i>\r\n");
      out.write("\r\n");
      out.write("                     </td>\r\n");
      out.write("                     </tr>\r\n");
      out.write("                  ");
}
               
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("</div>\r\n");
      out.write("         \r\n");

      
      }

      }
  
      
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!--페이지번호 출력-->\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <div align=\"bottom\">\r\n");
      out.write("         <ul class=\"pagination justify-content-center\">\r\n");
      out.write("            <li class=\"page-item\"><a class=\"page-link\"\r\n");
      out.write("               href=\"tourReview/logoutTourSpotReviewList.jsp?currentPage=");
      out.print(startPage - 1);
      out.write("\"\r\n");
      out.write("               aria-label=\"Previous\"> <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("            </a></li>\r\n");
      out.write("            ");

            //이전
            if (startPage > 1) {
            
      out.write("\r\n");
      out.write("         <li class=\"page-item active\">\r\n");
      out.write("             <a class=\"page-link\" href=\"index.jsp?main=tourReview/logoutTourSpotReviewList.jsp?currentPage=");
      out.print(currentPage-1);
      out.write("\"><span aria-hidden=\"true\">&laquo;</span></a>\r\n");
      out.write("               ");

            }

            for (int pp = startPage; pp <= endPage; pp++) 
            {
            if (pp == currentPage) {
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <li class=\"page-item active\"><a class=\"page-link\"\r\n");
      out.write("               href=\"index.jsp?main=tourReview/logoutTourSpotReviewList.jsp?currentPage=");
      out.print(pp);
      out.write('"');
      out.write('>');
      out.print(pp);
      out.write("</a></li>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <li class=\"page-item\"><a class=\"page-link\"\r\n");
      out.write("               href=\"index.jsp?main=tourReview/logoutTourSpotReviewList.jsp?currentPage=");
      out.print(pp);
      out.write('"');
      out.write('>');
      out.print(pp);
      out.write("</a></li>\r\n");
      out.write("            ");

            }
            }
            if (endPage < totalPage) {
               
      out.write("\r\n");
      out.write("            <li class=\"page-item\">\r\n");
      out.write("            <a class=\"page-link\" aria-label=\"Next\"\r\n");
      out.write("               href=\"index.jsp?main=tourReview/logoutTourSpotReviewList.jsp?currentPage=");
      out.print(endPage+1 );
      out.write("\"><span aria-hidden=\"true\">&raquo;</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            ");

            }
            
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
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
