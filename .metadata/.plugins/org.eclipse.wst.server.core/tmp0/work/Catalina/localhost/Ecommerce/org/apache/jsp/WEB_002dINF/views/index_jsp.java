/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-04-13 03:02:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" href=\"./resources/images/Arun_brandings/Hatsun_icon.jpg\">\n");
      out.write("\n");
      out.write("    <title>HOME_PAGE</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"./resources/images/Arun_brandings/slide2.png\" alt=\"Scooping_Varieties\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"./resources/images/Arun_brandings/slide4.png\" alt=\"Scooping\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"./resources/images/Arun_brandings/slide5.jpg\" alt=\"Scooping\">\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("<!-- end -->\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/Exotic_IceCreams/AICEE004-500x500.jpg\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">Exotic_IceCreams</h3>\n");
      out.write("        <p style=\"font-family:cursive\">Different desserts of IceCreams</p>\n");
      out.write("        <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   <div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/Cup_IceCreams/Screen_Shot_2017-08-28_at_1.46.58_PM_1024x1024@2x.png\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">Cup IceCreams</h3>\n");
      out.write("        <p style=\"font-family:cursive\">Variety of cup of IceCreams</p>\n");
      out.write("        <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   <div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/Cone_IceCreams/0.51-500x500.jpg\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">Cone IceCreams</h3>\n");
      out.write("        <p style=\"font-family:cursive\">Variety of Cone IceCreams</p>\n");
      out.write("        <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   </div><div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/FamilyPack_IceCreams/Arun Ice Cream Vanilla Blossom Choco 250 ml-500x500.jpg\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">FamilyPack IceCreams</h3>\n");
      out.write("        <p style=\"font-family:cursive\">Variety of FamilyPack IceCreams</p>\n");
      out.write("        <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/Stick_IceCreams/arun i bar Classic vanilla-500x500.jpg\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">Stick IceCreams</h3>\n");
      out.write("        <p style=\"font-family:cursive\">Varities of stick IceCreams</p>\n");
      out.write("      <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/Other_Products/Dairy-Whitner-200g-570x598.png\" alt=\"...\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3 style=\"font-family:cursive\">HatsunProducts</h3>\n");
      out.write("        <p style=\"font-family:cursive\">DiaryWhitner</p>\n");
      out.write("        <p><a href=\"noAccessPage\" class=\"btn btn-primary\" style=\"font-family:cursive\" role=\"button\">AddCart</a> <a href=\"reg\" class=\"btn btn-default\" role=\"button\">Buy</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   <!-- start code -->\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <a href=\"#\" class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/img2.jpg\" alt=\"...\">\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <a href=\"#\" class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/img3.jpg\" alt=\"...\">\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("   <div class=\"col-md-3\">\n");
      out.write("    <a href=\"#\" class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/img4.jpg\" alt=\"...\">\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <a href=\"#\" class=\"thumbnail\">\n");
      out.write("      <img src=\"./resources/images/img5.jpg\" alt=\"...\"></a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- end code -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
