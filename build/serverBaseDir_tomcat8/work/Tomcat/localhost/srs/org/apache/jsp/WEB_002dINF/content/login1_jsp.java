/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-03 17:35:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t <meta charset=\"utf-8\">\r\n");
      out.write("    <title>选课系统</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    \r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("     <link rel=\"stylesheet\" href=\"assets/css/loader-style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/signin.css\">\r\n");
      out.write("    \r\n");
      out.write("     <link rel=\"shortcut icon\" href=\"assets/ico/minus.png\">\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction login(){\r\n");
      out.write("\t\tvar ssn = $(\"#ssn\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/userAction_login',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tdata:{ssn:ssn,password:$(\"#password\").val(),type:$(\"select\").val()},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\r\n");
      out.write("\t\t\t\t\tif($(\"#select\").val()==\"Student\"){\r\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student?'+ ssn +'';\r\n");
      out.write("\t\t\t\t\t}else if($(\"#select\").val()==\"Professor\"){\r\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/professor?'+ ssn +''\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"账号或密码错误！或者身份错误！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t <div id=\"preloader\">\r\n");
      out.write("        <div id=\"status\">&nbsp;</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"\" id=\"login-wrapper\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                    <div id=\"logo-login\">\r\n");
      out.write("                        <h1>选课系统\r\n");
      out.write("                            <span>v1.3</span>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                    <div class=\"account-box\"> \r\n");
      out.write("                        <form role=\"form\" action=\"index.html\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <!--a href=\"#\" class=\"pull-right label-forgot\">Forgot email?</a-->\r\n");
      out.write("                                <label for=\"inputUsernameEmail\">用户名</label>\r\n");
      out.write("                                <input type=\"text\" id=\"ssn\" class=\"form-control\" placeholder=\"请输用户名\" required autofocus/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <!--a href=\"#\" class=\"pull-right label-forgot\">Forgot password?</a-->\r\n");
      out.write("                                <label for=\"inputPassword\">密码</label>\r\n");
      out.write("                                <input type=\"password\" id=\"password\"  class=\"form-control\" placeholder=\"请输入密码\" required autofocus/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"checkbox pull-left\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <select id=\"select\">\r\n");
      out.write("                \t<option>Student</option>\r\n");
      out.write("                \t<option>Professor</option>\r\n");
      out.write("                \t<option>admin</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                <span>请选择身份</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button class=\"btn btn btn-primary pull-right\" type=\"button\" onclick=\"login()\"> 登 录</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a class=\"forgotLnk\" href=\"index.html\"></a>\r\n");
      out.write("                        <!--div class=\"or-box\">\r\n");
      out.write("                          \r\n");
      out.write("                            <center><span class=\"text-center login-with\">Login or <b>Sign Up</b></span></center>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6 row-block\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"btn btn-facebook btn-block\">\r\n");
      out.write("                                        <span class=\"entypo-facebook space-icon\"></span>Facebook</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6 row-block\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"btn btn-twitter btn-block\">\r\n");
      out.write("                                        <span class=\"entypo-twitter space-icon\"></span>Twitter</a>\r\n");
      out.write("                                        \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"margin-top:25px\" class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6 row-block\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"btn btn-google btn-block\"><span class=\"entypo-gplus space-icon\"></span>Google +</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6 row-block\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"btn btn-instagram btn-block\"><span class=\"entypo-instagrem space-icon\"></span>Instagram</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"row-block\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-12 row-block\">\r\n");
      out.write("                                    <a href=\"index.html\" class=\"btn btn-primary btn-block\">Create New Account</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div-->\r\n");
      out.write("                        <div class=\"row-block\">\r\n");
      out.write("\t                        <div class=\"row\">\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write(" \t\t<p>&nbsp;</p>\r\n");
      out.write("        <div style=\"text-align:center;margin:0 auto;\">\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"test1\" class=\"gmap3\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--  END OF PAPER WRAP -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- MAIN EFFECT -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/preloader.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/app.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/load.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://maps.googleapis.com/maps/api/js?sensor=false\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/map/gmap3.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(function() {\r\n");
      out.write("\r\n");
      out.write("        $(\"#test1\").gmap3({\r\n");
      out.write("            marker: {\r\n");
      out.write("                latLng: [-7.782893, 110.402645],\r\n");
      out.write("                options: {\r\n");
      out.write("                    draggable: true\r\n");
      out.write("                },\r\n");
      out.write("                events: {\r\n");
      out.write("                    dragend: function(marker) {\r\n");
      out.write("                        $(this).gmap3({\r\n");
      out.write("                            getaddress: {\r\n");
      out.write("                                latLng: marker.getPosition(),\r\n");
      out.write("                                callback: function(results) {\r\n");
      out.write("                                    var map = $(this).gmap3(\"get\"),\r\n");
      out.write("                                        infowindow = $(this).gmap3({\r\n");
      out.write("                                            get: \"infowindow\"\r\n");
      out.write("                                        }),\r\n");
      out.write("                                        content = results && results[1] ? results && results[1].formatted_address : \"no address\";\r\n");
      out.write("                                    if (infowindow) {\r\n");
      out.write("                                        infowindow.open(map, marker);\r\n");
      out.write("                                        infowindow.setContent(content);\r\n");
      out.write("                                    } else {\r\n");
      out.write("                                        $(this).gmap3({\r\n");
      out.write("                                            infowindow: {\r\n");
      out.write("                                                anchor: marker,\r\n");
      out.write("                                                options: {\r\n");
      out.write("                                                    content: content\r\n");
      out.write("                                                }\r\n");
      out.write("                                            }\r\n");
      out.write("                                        });\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            map: {\r\n");
      out.write("                options: {\r\n");
      out.write("                    zoom: 15\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</body>\r\n");
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
