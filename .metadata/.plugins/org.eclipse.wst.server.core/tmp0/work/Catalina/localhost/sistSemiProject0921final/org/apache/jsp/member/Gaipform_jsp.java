/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-21 01:37:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gaipform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("   integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("   crossorigin=\"anonymous\">\r\n");
      out.write("<link\r\n");
      out.write("   href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("   rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css\">\r\n");
      out.write("   ");

   String root=request.getContextPath();
   
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("@import url(//fonts.googleapis.com/earlyaccess/jejugothic.css);\r\n");
      out.write("body * { \r\n");
      out.write(" font-family: 'Jeju Gothic', sans-serif;\r\n");
      out.write(" background-color: \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("   min-height: 100vh;\r\n");
      out.write("   background-image: url('");
      out.print(root );
      out.write("/jeju/gaip.JPG');\r\n");
      out.write("   background-size: 100%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-form {\r\n");
      out.write("   max-width: 680px;\r\n");
      out.write("   margin-top: 80px;\r\n");
      out.write("   padding: 32px;\r\n");
      out.write("   background: #fff;\r\n");
      out.write("   -webkit-border-radius: 10px;\r\n");
      out.write("   -moz-border-radius: 10px;\r\n");
      out.write("   border-radius: 10px;\r\n");
      out.write("   -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("   -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);\r\n");
      out.write("   box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.container {\r\n");
      out.write("   box-shadow: 0 0 10px rgba(0, 0, 0, 0.0);\r\n");
      out.write("   margin-left: 400px;\r\n");
      out.write("   margin-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("      <div class=\"input-form-backgroud row\">\r\n");
      out.write("         <div class=\"input-form col-md-12 mx-auto\">\r\n");
      out.write("            <h4 class=\"mb-3\">\r\n");
      out.write("               <i class=\"bi bi-hand-thumbs-up\"></i>&nbsp;회원가입\r\n");
      out.write("            </h4>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <form class=\"validation-form\" novalidate action=\"member/memberAction.jsp\"\r\n");
      out.write("               method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                  \r\n");
      out.write("                  <!-- https://iamiet.tistory.com/68 이 사람 블로그에 더 자세한거 있음. -->\r\n");
      out.write("                  <label for=\"profile\">프로필사진</label>\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\" id=\"profile1\" style=\"border: 1px solid gray; width: 150px; height: 170px; margin-left: 15px; border-radius:10px;\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                     <input type=\"file\" class=\"form-control\" name=\"profile\"\r\n");
      out.write("                        id=\"profile\" accept=\"image/*\" style=\"width: 250px;\">\r\n");
      out.write("                     <!-- 선택한 이미지 파일을 저장하는 숨겨진 입력 필드 -->\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <!-- fix : 중복안되게 수정 -->\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"id\">아이디&nbsp;</label><i class=\"bi bi-check-all\"\r\n");
      out.write("                        id=\"btncheck\" style=\"font-size: 1.2em; cursor: pointer;\"></i> <input\r\n");
      out.write("                        type=\"text\" class=\"form-control\" name=\"id\" id=\"id\"\r\n");
      out.write("                        placeholder=\"아이디를 입력하세요\" value=\"\" required=\"required\"> <span\r\n");
      out.write("                        class=\"idsuccess\"> </span>\r\n");
      out.write("                     <div class=\"invalid-feedback\">아이디를 입력하세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"password\">비밀번호</label> <input type=\"password\"\r\n");
      out.write("                        class=\"form-control\" name=\"pass\" id=\"pass\" placeholder=\"\"\r\n");
      out.write("                        value=\"\" required>\r\n");
      out.write("                     <div class=\"invalid-feedback\">비밀번호를 입력해주세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"name\">이름</label> <input type=\"text\"\r\n");
      out.write("                        class=\"form-control\" name=\"name\" id=\"name\"\r\n");
      out.write("                        placeholder=\"이름을 입력하세요\" value=\"\" required=\"required\">\r\n");
      out.write("                     <div class=\"invalid-feedback\">아이디를 입력하세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"gender\">성별</label> \r\n");
      out.write("                     <select\r\n");
      out.write("                        class=\"custom-select d-block w-100\" id=\"gender\" name=\"gender\">\r\n");
      out.write("                        <option value=\"male\">남</option>\r\n");
      out.write("                        <option value=\"female\">여</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"age\">나이</label> \r\n");
      out.write("                     <input type=\"text\"\r\n");
      out.write("                        class=\"form-control\" name=\"age\" id=\"age\" placeholder=\"나이\"\r\n");
      out.write("                        value=\"\" required=\"required\">\r\n");
      out.write("                     <div class=\"invalid-feedback\">나이를 입력하세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                     <label for=\"mbti\">MBTI</label><br>\r\n");
      out.write("                     <div>\r\n");
      out.write("                     <select name=\"mbti1\" class=\"form-control custom-select\" style=\"width: 50px;float: left;margin-right: 10px\">\r\n");
      out.write("                        <option value=\"e\" selected>E</option>\r\n");
      out.write("                        <option value=\"i\">I</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                     <select name=\"mbti2\" class=\"form-control custom-select\" style=\"width: 50px;float: left;margin-right: 10px\">\r\n");
      out.write("                        <option value=\"n\" selected>N</option>\r\n");
      out.write("                        <option value=\"s\">S</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                     <select name=\"mbti3\" class=\"form-control custom-select\" style=\"width: 50px;float: left;margin-right: 10px\">\r\n");
      out.write("                        <option value=\"t\" selected>T</option>\r\n");
      out.write("                        <option value=\"f\">F</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                     <select name=\"mbti4\" class=\"form-control custom-select\" style=\"width: 50px;margin-right: 10px\">\r\n");
      out.write("                        <option value=\"p\" selected>P</option>\r\n");
      out.write("                        <option value=\"j\">J</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"invalid-feedback\">MBTI를 입력하세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"mb-3\">\r\n");
      out.write("                  <label for=\"email\">이메일</label> <input type=\"email\"\r\n");
      out.write("                     class=\"form-control\" name=\"email\" id=\"email\"\r\n");
      out.write("                     placeholder=\"your@example.com\" required=\"required\">\r\n");
      out.write("                  <div class=\"invalid-feedback\">이메일을 입력해주세요.</div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"mb-3\">\r\n");
      out.write("                  <label for=\"address\">주소</label> \r\n");
      out.write("                  <select class=\"custom-select d-block w-100\" id=\"area\" name=\"area\">\r\n");
      out.write("                        <option value=\"서울\">서울특별시</option>\r\n");
      out.write("                        <option value=\"인천\">인천광역시</option>\r\n");
      out.write("                        <option value=\"경기\">경기도</option>\r\n");
      out.write("                        <option value=\"강원\">강원도</option>\r\n");
      out.write("                        <option value=\"충북\">충청북도</option>\r\n");
      out.write("                        <option value=\"충남\">충청남도</option>\r\n");
      out.write("                        <option value=\"광주\">광주광역시</option>\r\n");
      out.write("                        <option value=\"전북\">전라북도</option>\r\n");
      out.write("                        <option value=\"전남\">전라남도</option>\r\n");
      out.write("                        <option value=\"대구\">대구광역시</option>\r\n");
      out.write("                        <option value=\"부산\">부산광역시</option>\r\n");
      out.write("                        <option value=\"경북\">경상북도</option>\r\n");
      out.write("                        <option value=\"경남\">경상남도</option>\r\n");
      out.write("                        <option value=\"제주\">제주도</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <div class=\"invalid-feedback\">주소를 입력해주세요.</div>\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"mb-3\">\r\n");
      out.write("                  <label for=\"hp\">세부 주소</label> \r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"area1\" id=\"area1\" placeholder=\"세부 주소를 입력해주세요\" required=\"required\">\r\n");
      out.write("                  <div class=\"invalid-feedback\">세부주소를 입력해주세요.</div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"mb-3\">\r\n");
      out.write("                  <label for=\"hp\">전화번호</label> <input type=\"text\"\r\n");
      out.write("                     class=\"form-control\" name=\"hp\" id=\"hp\"\r\n");
      out.write("                     placeholder=\"010-1234-5678\" required>\r\n");
      out.write("                  <div class=\"invalid-feedback\">전화번호를 입력해주세요.</div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-8 mb-3\">\r\n");
      out.write("                     <label for=\"root\">가입 경로</label> <select\r\n");
      out.write("                        class=\"custom-select d-block w-100\" id=\"root\">\r\n");
      out.write("                        <option value=\"\"></option>\r\n");
      out.write("                        <option>검색</option>\r\n");
      out.write("                        <option>카페,블로그</option>\r\n");
      out.write("                        <option>지인추천</option>\r\n");
      out.write("                        <option>광고</option>\r\n");
      out.write("                        <option>SNS</option>\r\n");
      out.write("                     </select>\r\n");
      out.write("                     <div class=\"invalid-feedback\">가입 경로를 선택해주세요.</div>\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-md-4 mb-3\">\r\n");
      out.write("                     <label for=\"code\">추천인 코드</label> <input type=\"text\"\r\n");
      out.write("                        class=\"form-control\" id=\"code\" placeholder=\"\" required>\r\n");
      out.write("                     <div class=\"invalid-feedback\">추천인 코드를 입력해주세요.</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <hr class=\"mb-4\">\r\n");
      out.write("               <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\" id=\"aggrement\"\r\n");
      out.write("                     required> <label class=\"custom-control-label\"\r\n");
      out.write("                     for=\"aggrement\">개인정보 수집 및 이용에 동의합니다.</label>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"mb-4\"></div>\r\n");
      out.write("               <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">가입\r\n");
      out.write("                  완료</button>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <footer class=\"my-3 text-center text-small\">\r\n");
      out.write("         <p class=\"mb-1\">&copy; Sist 2조</p>\r\n");
      out.write("      </footer>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <script>\r\n");
      out.write("     /* 입력란이 required 들어간게 안들어가면 회원가입 안되게 유효성검사 */\r\n");
      out.write("    window.addEventListener('load', () => {\r\n");
      out.write("      const forms = document.getElementsByClassName('validation-form');\r\n");
      out.write("\r\n");
      out.write("      Array.prototype.filter.call(forms, (form) => {\r\n");
      out.write("        form.addEventListener('submit', function (event) {\r\n");
      out.write("          if (form.checkValidity() === false) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            event.stopPropagation();\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          form.classList.add('was-validated');\r\n");
      out.write("        }, false);\r\n");
      out.write("      });\r\n");
      out.write("    }, false);\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("   <script>\r\n");
      out.write("   \r\n");
      out.write("      //회원가입시 아이디 중복체크 로직\r\n");
      out.write("    $(\"#btncheck\").click(function(){\r\n");
      out.write("      var id = $(\"#id\").val();\r\n");
      out.write("      var id1 = $(\"span.idsuccess\").text();\r\n");
      out.write("      //alert(id);\r\n");
      out.write("      \r\n");
      out.write("      //중복체크 없이 id를 만들어서 회원가입 버튼 누르면 안되게 끔 만들어야함\r\n");
      out.write("      \r\n");
      out.write("      if(id1==\"사용가능한 아이디 입니다.\") {\r\n");
      out.write("         \r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      $.ajax({\r\n");
      out.write("         type : \"get\",\r\n");
      out.write("         url : \"member/IdSearch.jsp\",\r\n");
      out.write("         dataType : \"json\",\r\n");
      out.write("         data : {\"id\":id},\r\n");
      out.write("         success:function(data) {\r\n");
      out.write("            \r\n");
      out.write("            if(data.count==1) {\r\n");
      out.write("               $(\"span.idsuccess\").text(\"중복된 아이디가 있습니다.\");\r\n");
      out.write("               $(\"#id\").val(\"\");\r\n");
      out.write("            } else {\r\n");
      out.write("               $(\"span.idsuccess\").text(\"사용가능한 아이디 입니다.\");\r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("      }); \r\n");
      out.write("   \r\n");
      out.write("   }); \r\n");
      out.write("      \r\n");
      out.write("    // 파일을 선택하면 프로필 사진 미리보기를 업데이트하는 함수\r\n");
      out.write("// 파일을 선택하면 프로필 사진 미리보기를 업데이트하는 함수\r\n");
      out.write("$(\"#profile\").change(function() {\r\n");
      out.write("    // 파일 인풋에서 선택한 파일 가져오기\r\n");
      out.write("    var file = this.files[0];\r\n");
      out.write("    \r\n");
      out.write("    // 이미지 파일인지 확인 (예: jpg, jpeg, png, gif 등)\r\n");
      out.write("    if (file && /\\.(jpe?g|png|gif)$/i.test(file.name)) {\r\n");
      out.write("        var reader = new FileReader();\r\n");
      out.write("        \r\n");
      out.write("        reader.onload = function(e) {\r\n");
      out.write("            // 선택한 파일을 이미지로 표시하기\r\n");
      out.write("            $(\"#profile1\").html('<img src=\"' + e.target.result + '\" alt=\"프로필 이미지\" style=\"width: 140px; height: 160px; border-radius:10px;\">');\r\n");
      out.write("        };\r\n");
      out.write("        \r\n");
      out.write("        // 파일을 읽어오기\r\n");
      out.write("        reader.readAsDataURL(file);\r\n");
      out.write("    } else {\r\n");
      out.write("        alert(\"올바른 이미지 파일을 선택하세요 (jpg, jpeg, png, gif).\");\r\n");
      out.write("        $(\"#profile\").val(\"\"); // 파일 선택을 초기화\r\n");
      out.write("        $(\"#profile1\").html(\"\"); // 미리보기 삭제\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("      </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
