/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.41
 * Generated at: 2020-06-10 02:57:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t    <meta charset=\"UTF-8\">\n");
      out.write("\t    <title>CSI语音 技术吧</title>\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit|ie-stand\"/>\n");
      out.write("\t\t<meta content=\"IE=edge\" http-equiv=\"X-UA-Compatible\"/>\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t\t<meta name=\"generator\" content=\"\" />\n");
      out.write("\t\t<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("\t\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"static/css/default/bootstrap/bootstrap.css\" />\n");
      out.write("\t\t<!-- Font Awesome Icons -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"chinasofti/login/css/font-awesome.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"static/css/default/simple-line-icons/css/simple-line-icons.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"chinasofti/login/css/animate.min.css\"/>\n");
      out.write("\t\t<!-- Ionicons -->\n");
      out.write("\t\t<link href=\"chinasofti/login/css/ionicons.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!-- Skins. Choose a skin from the css/skins\n");
      out.write("\t     folder instead of downloading all of them to reduce the load. -->\n");
      out.write("\t\t<link href=\"chinasofti/login/css/_all-skins.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!-- Castle 1.0 -->\n");
      out.write("\t\t<link href=\"chinasofti/login/css/castle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!-- Theme style -->\n");
      out.write("\t\t<link href=\"chinasofti/login/css/castle-main.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<link href=\"static/comp/layui/css/layui.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<link href=\"static/comp/scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<link href=\"chinasofti/login/css/fontsize.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"chinasofti/login/css/theme.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"chinasofti/login/css/cover.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"chinasofti/login/css/step.css\" />\n");
      out.write("\t\t<link href=\"chinasofti/login/css/login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"static/css/default/mask.css\" />\n");
      out.write("\t\t  \n");
      out.write("\t\t<script language=\"JavaScript\">\n");
      out.write("\t\tvar context=\"\",__contextPath=\"\",__extendOptions=\"main/options\",__jsPath=\"\",__scriptPath=\"\";</script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<script src=\"static/comp/base/jquery-2.1.4.js\"></script>\n");
      out.write("\t\t<script src=\"static/comp/base/utils-base.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\t<script src=\"static/comp/layui/layui.js\"></script>\n");
      out.write("\t\t<script src=\"static/comp/layui/layui-config.js\"></script>\n");
      out.write("\t\t<script src=\"static/js/common/util.js\"></script>\n");
      out.write("\t\t<script src=\"static/js/common/autoheight.js\"></script>\n");
      out.write("\t\t<script src=\"static/js/common/mask.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/login/lufylegend-1.10.1.simple.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/login/lufylegend.LoadingSample4-0.1.0.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/login/TweenLite.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/login/login.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/comp/jQuery-Storage-API/jquery.storageapi.js\" ></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"chinasofti/login/js/login.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/alert.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<body style=\"width: 100%;height: 100%;margin: 0;padding: 0; \">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"bg-canvas\">\n");
      out.write("\t\t\t<canvas id=\"demo-canvas\" width=\"100%\" height=\"100%\" style=\"width: 100%;height: 99%;overflow: hidden;\"></canvas>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"login-box\" id=\"loginbox\">\n");
      out.write("\t\t    <!-- /.login-logo -->\n");
      out.write("\t\t\t<div class=\"login\"  id=\"main_login\" >     \n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t\t<div class=\"input_text\" >   \n");
      out.write("\t\t\t\t\t<div id=\"message\"style=\"position:absolute;color:red;margin-top:-20px;margin-left:100px;\" > </div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  \t<!--<form  action=\"login.d\" method=\"post\" onsubmit=\"return validateLogin()\"> -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"content\" >\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t           \t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Britannic Bold', 'Britannic';color:#3BC5BB;\">CSI语音</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#1D4474;\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#FF9A4C;\">技术吧</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon fa fa-user\"></span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"username\" name=\"username\" value=\"\" class=\"form-control l35\" fv_type=\"NOTCN\" type=\"text\" maxlength=\"20\" placeholder=\"请输入您的用户名\" value=\"\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon fa fa-key\"></span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"password\" name=\"password\" value=\"\" class=\"form-control highlight_green l35\" fv_type=\"NOTCN\" type=\"password\"  maxlength=\"6\" placeholder=\"请输入您的密码\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"formoperate\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"rememberPwd\" >\n");
      out.write("\t\t\t\t\t        \t\t<input type=\"checkbox\" id=\"rememberPwd\"/><label for=\"rememberPwd\">记住密码</label>\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div >\n");
      out.write("\t\t\t\t\t        \t<button type=\"button\" onclick=\"subLogin()\" class=\"layui-btn  btn-login\"  style=\"width:150px\">&nbsp;&nbsp;登　录&nbsp;&nbsp;</button>\n");
      out.write("\t\t\t\t\t       \t\t<button type=\"button\" onclick=\"gotoregister()\" class=\"layui-btn  btn-login\"  style=\"width:150px\">&nbsp;&nbsp;注     册&nbsp;&nbsp;</button>\n");
      out.write("\t\t\t\t\t\t    </div> \n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t    <div class=\"formoperate\" id=\"tishi\" style=\"text-align: center;color: red;padding-top: 15px\">\n");
      out.write("\t\t\t\t\t     \n");
      out.write("\t\t\t\t\t        \t\t\n");
      out.write("\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t        </div> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"login-box\" id=\"registerbox\" style=\"height:480px;display:none;width:500px;margin-top:60px\">\n");
      out.write("\t\t    <!-- /.login-logo -->\n");
      out.write("\t\t\t<div class=\"login\"  id=\"main_login\" >     \n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t\t<div class=\"input_text\" >   \n");
      out.write("\t\t\t\t\t<div id=\"message\"style=\"position:absolute;color:red;margin-top:-20px;margin-left:100px;\" > </div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  \t<!--<form  action=\"login.d\" method=\"post\" onsubmit=\"return validateLogin()\"> -->\n");
      out.write("\t\t\t\t\t\t<div class=\"content\" >\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t           \t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Britannic Bold', 'Britannic';color:#3BC5BB;\">用户</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#1D4474;\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#FF9A4C;\">注册</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t      \n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">用户名</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\" >\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"regusername\" name=\"regusername\" value=\"\" class=\"form-control l35\" fv_type=\"NOTCN\" type=\"text\" maxlength=\"20\" placeholder=\"请输入您的用户名\" value=\"\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">密码</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"regpassword\" name=\"regpassword\" value=\"\" class=\"form-control highlight_green l35\" fv_type=\"NOTCN\" type=\"password\" maxlength=\"6\" placeholder=\"请输入您的密码\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t         <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">确认密码</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"regpasswordCon\" name=\"regpasswordCon\" value=\"\" class=\"form-control highlight_green l35\" fv_type=\"NOTCN\" type=\"password\" maxlength=\"6\" placeholder=\"请再次输入您的密码\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">性别</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t        \t\t<select id=\"regsex\" name=\"regxex\" class=\"form-control highlight_green l35\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t  <option value =\"0\"  selected=\"selected\">男</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <option value =\"1\">女</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">年龄</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<select id=\"regAge\" name=\"regAge\" class=\"form-control highlight_green l35\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t         <div class=\"formitem\">\n");
      out.write("\t\t\t\t\t        \t<span class=\"icon\" style=\"width:100px\">邮箱</span>\n");
      out.write("\t\t\t\t\t        \t<span class=\"input\">\n");
      out.write("\t\t\t\t\t        \t\t<input id=\"regEmial\" name=\"regEmial\" value=\"\" class=\"form-control highlight_green l35\" fv_type=\"NOTCN\" type=\"text\" placeholder=\"请输入您的邮箱地址\"  data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("\t\t\t\t\t        \t</span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div >\n");
      out.write("\t\t\t\t\t        \t<button type=\"button\" onclick=\"subReg()\" class=\"layui-btn  btn-login\"  style=\"width:150px\">&nbsp;&nbsp;注      册&nbsp;&nbsp;</button>\n");
      out.write("\t\t\t\t\t       \t\t<button type=\"button\" onclick=\"gotoLogin()\" class=\"layui-btn  btn-login\"  style=\"width:150px\">&nbsp;&nbsp;返      回&nbsp;&nbsp;</button>\n");
      out.write("\t\t\t\t\t\t    </div>  \n");
      out.write("\t\t\t\t\t\t    <div class=\"formitem\" id=\"zucetishi\" style=\"text-align: center;color: red;padding-top: 15px\">\n");
      out.write("\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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