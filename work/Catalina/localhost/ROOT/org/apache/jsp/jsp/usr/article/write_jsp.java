/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-06-18 10:29:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.usr.article;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/usr/article/../common/foot.jspf", Long.valueOf(1718361880717L));
    _jspx_dependants.put("/jsp/usr/article/../common/head.jspf", Long.valueOf(1718367439162L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<script>\r\n");
      out.write("function ArticleSave__submitForm(form) {\r\n");
      out.write("	form.title.value = form.title.value.trim();\r\n");
      out.write("\r\n");
      out.write("	if(form.title.value.length == 0) {\r\n");
      out.write("		alert('제목을 입력해주세요.');\r\n");
      out.write("		form.title.focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	form.body.value = form.body.value.trim();\r\n");
      out.write("\r\n");
      out.write("	if(form.body.value.length == 0) {\r\n");
      out.write("		alert('내용을 입력해주세요.');\r\n");
      out.write("		form.body.focus();\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	form.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("  <!-- 모바일에서 디자인이 축소되 않게 하기 위한 코드 -->\r\n");
      out.write("  <meta name=\"viewport\"\r\n");
      out.write("        content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>JSP 게시판</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- 제이쿼리 불러오기 -->\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- 테일윈드 불러오기 -->\r\n");
      out.write("  <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- 폰트어썸 불러오기  -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <style>\r\n");
      out.write("    @font-face {\r\n");
      out.write("      font-family: 'GmarketSansMedium';\r\n");
      out.write("      src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');\r\n");
      out.write("      font-weight: normal;\r\n");
      out.write("      font-style: normal;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    html > body {\r\n");
      out.write("      font-family: 'GmarketSansMedium';\r\n");
      out.write("      text-underline-position: under;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("  <header class=\"top-bar h-[50px] bg-[#cfcfcf]\">\r\n");
      out.write("    <div class=\"container mx-auto px-3 h-full flex\">\r\n");
      out.write("      <a href=\"/\" class=\"logo flex h-full items-center px-3 gap-x-1\">\r\n");
      out.write("        <span>\r\n");
      out.write("          <i class=\"fa-solid fa-apple-whole\"></i>\r\n");
      out.write("        </span>\r\n");
      out.write("        <span>\r\n");
      out.write("          JSP BOARD\r\n");
      out.write("        </span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <nav class=\"top-bar__menu-1 ml-auto\">\r\n");
      out.write("        <ul class=\"flex h-full\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"/usr/article/write/free\" class=\"flex h-full items-center px-[20px] hover:text-underline hover:text-white gap-x-1\">\r\n");
      out.write("              <span>\r\n");
      out.write("                <i class=\"fa-solid fa-newspaper\"></i>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span>자유게시물 작성</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"/usr/article/list/free\" class=\"flex h-full items-center px-[20px] hover:text-underline hover:text-white gap-x-1\">\r\n");
      out.write("              <span>\r\n");
      out.write("                <i class=\"fa-solid fa-list\"></i>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span>자유게시물 리스트</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"article-write-wrap mt-[10px]\">\r\n");
      out.write("  <div class=\"container mx-auto\">\r\n");
      out.write("    <form method=\"POST\" onsubmit=\"ArticleSave__submitForm(this); return false;\">\r\n");
      out.write("      <div>\r\n");
      out.write("        <span>제목</span>\r\n");
      out.write("        <div>\r\n");
      out.write("          <input name=\"title\" type=\"text\" maxlength=\"50\" placeholder=\"제목을 입력해주세요.\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div>\r\n");
      out.write("        <span>내용</span>\r\n");
      out.write("        <div>\r\n");
      out.write("          <textarea name=\"body\" cols=\"30\" rows=\"10\" placeholder=\"내용을 입력해주세요.\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"flex gap-x-[5px] mt-[5px]\">\r\n");
      out.write("        <button type=\"submit\">작성</button>\r\n");
      out.write("        <a href=\"/usr/article/list\">취소</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
