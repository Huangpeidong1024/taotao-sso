/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-31 22:00:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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


	String staticUrl = "http://static.taotao.com";
	request.setAttribute("staticUrl", staticUrl);

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"/>\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache,must-revalidate\">\r\n");
      out.write("    <title>注册-个人用户</title>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/regist.personal.css\"/>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/passport.base.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.2.6.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("function login() {\r\n");
      out.write("    location.href = \"/user/login.html\";\r\n");
      out.write("    return false\r\n");
      out.write("}\r\n");
      out.write("function regist() {\r\n");
      out.write("    location.href = \"/user/register.html\";\r\n");
      out.write("    return false\r\n");
      out.write("}\r\n");
      out.write("(function (a) {\r\n");
      out.write("    a.fn.Jdropdown = function (d, e) {\r\n");
      out.write("        if (!this.length) {\r\n");
      out.write("            return\r\n");
      out.write("        }\r\n");
      out.write("        if (typeof d == \"function\") {\r\n");
      out.write("            e = d;\r\n");
      out.write("            d = {}\r\n");
      out.write("        }\r\n");
      out.write("        var c = a.extend({event: \"mouseover\", current: \"hover\", delay: 0}, d || {});\r\n");
      out.write("        var b = (c.event == \"mouseover\") ? \"mouseout\" : \"mouseleave\";\r\n");
      out.write("        a.each(this, function () {\r\n");
      out.write("            var h = null, g = null, f = false;\r\n");
      out.write("            a(this).bind(c.event,\r\n");
      out.write("                    function () {\r\n");
      out.write("                        if (f) {\r\n");
      out.write("                            clearTimeout(g)\r\n");
      out.write("                        } else {\r\n");
      out.write("                            var j = a(this);\r\n");
      out.write("                            h = setTimeout(function () {\r\n");
      out.write("                                j.addClass(c.current);\r\n");
      out.write("                                f = true;\r\n");
      out.write("                                if (e) {\r\n");
      out.write("                                    e(j)\r\n");
      out.write("                                }\r\n");
      out.write("                            }, c.delay)\r\n");
      out.write("                        }\r\n");
      out.write("                    }).bind(b, function () {\r\n");
      out.write("                        if (f) {\r\n");
      out.write("                            var j = a(this);\r\n");
      out.write("                            g = setTimeout(function () {\r\n");
      out.write("                                j.removeClass(c.current);\r\n");
      out.write("                                f = false\r\n");
      out.write("                            }, c.delay)\r\n");
      out.write("                        } else {\r\n");
      out.write("                            clearTimeout(h)\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("})(jQuery);\r\n");
      out.write("function addToFavorite() {\r\n");
      out.write("    var a = \"http://www.jd.com/\";\r\n");
      out.write("    var b = \"京东商城-网购上京东，省钱又放心\";\r\n");
      out.write("    if (document.all) {\r\n");
      out.write("        window.external.AddFavorite(a, b)\r\n");
      out.write("    } else if (window.sidebar) {\r\n");
      out.write("        window.sidebar.addPanel(b, a, \"\")\r\n");
      out.write("    } else {\r\n");
      out.write("        alert(\"对不起，您的浏览器不支持此操作!\\n请您使用菜单栏或Ctrl+D收藏本站。\")\r\n");
      out.write("    }\r\n");
      out.write("}</script>\r\n");
      out.write("<!--shortcut start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../commons/shortcut.jsp", out, false);
      out.write("<!--shortcut end-->\r\n");
      out.write("<div class=\"w\" id=\"logo\">\r\n");
      out.write("    <div>\r\n");
      out.write("    \t<a href=\"http://www.taotao.com/\">\r\n");
      out.write("    \t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/taotao-logo.gif\" alt=\"京东商城\" width=\"170\" height=\"60\"/>\r\n");
      out.write("    \t</a> <b></b>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"w\" id=\"regist\">\r\n");
      out.write("    <div class=\"mt\">\r\n");
      out.write("        <ul class=\"tab\">\r\n");
      out.write("            <li class=\"curr\">个人用户</li>\r\n");
      out.write("            <li class=\"line hide\"><a clstag=\"regist|keycount|personalreg|02\" href=\"../reg/company\">企业用户</a></li>\r\n");
      out.write("            <li class=\"fore hide\"><a href=\"http://passport.en.jd.com/user/facade\">International Customers</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"extra\">\r\n");
      out.write("        <span style=\"text-align: right\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class=\"flk13\"\r\n");
      out.write("                                                                               onclick=\"javascript:location.href=&quot;http://en.360buy.com&quot;+location.search;\"\r\n");
      out.write("                                                                               href=\"#\">English</a></span> <span>我已经注册，现在就&nbsp;<a\r\n");
      out.write("                href=\"http://www.taotao.com/user/login.html\"\r\n");
      out.write("                class=\"flk13\">登录</a></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"mc\">\r\n");
      out.write("        <form id=\"personRegForm\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("            <input type=\"hidden\" name=\"regType\" id=\"regType\" value=\"person\"/>\r\n");
      out.write("            <input type=\"hidden\" name=\"uuid\" id=\"uuid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uuid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" name=\"verifymc\" id=\"verifymc\" value=\"\"/>\r\n");
      out.write("            <input type=\"hidden\" name=\"emailMg\" id=\"emailMg\"/>\r\n");
      out.write("            <input type=\"hidden\" name=\"authcodeMg\" id=\"authcodeMg\"/>\r\n");
      out.write("            <input type=\"hidden\" name=\"state\" id=\"state\" value=\"\"/>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form\" onselectstart=\"return false;\">\r\n");
      out.write("                <div class=\"item\" id=\"select-regName\">\r\n");
      out.write("                    <span class=\"label\"><b class=\"ftx04\">*</b>用户名：</span>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"fl item-ifo\">\r\n");
      out.write("                        <div class=\"o-intelligent-regName\">\r\n");
      out.write("                            <input type=\"text\" id=\"regName\" name=\"username\" class=\"text\" tabindex=\"1\" autoComplete=\"off\"\r\n");
      out.write("                                   onpaste=\"return false;\"\r\n");
      out.write("                                   value=\"\"\r\n");
      out.write("                                   onfocus=\"if(this.value=='') this.value='';this.style.color='#333'\"\r\n");
      out.write("                                   onblur=\"if(this.value=='') {this.value='';this.style.color='#999999'}\"/>\r\n");
      out.write("                            <i class=\"i-name\"></i>\r\n");
      out.write("                            <ul id=\"intelligent-regName\" class=\"hide\"></ul>\r\n");
      out.write("                            <label id=\"regName_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"regName_error\" class=\"hide\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"intelligent-error hide\" id=\"morePinDiv\">\r\n");
      out.write("                            <h5>推荐您使用：</h5>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"groom\" id=\"morePinGroom\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                                <input type=\"hidden\" value=\"-1\" id=\"hnschool\" class=\"hide\"/>\r\n");
      out.write("                                                <input type=\"hidden\" id=\"schoolid\" name=\"schoolid\" class=\"hide\"/>\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"eBHtwyeixI\" value=\"EyEFt\"/>\r\n");
      out.write("                                                <input type=\"hidden\" id=\"hnseli\" class=\"hide\"/>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"capslock\"><i></i><s></s>键盘大写锁定已打开，请注意大小写</div>\r\n");
      out.write("                <div id=\"o-password\">\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>请设置密码：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"password\" id=\"pwd\" name=\"password\" class=\"text\" tabindex=\"2\"\r\n");
      out.write("                                   style=\"ime-mode:disabled;\"\r\n");
      out.write("                                   onpaste=\"return  false\" autocomplete=\"off\"/>\r\n");
      out.write("                            <i class=\"i-pass\"></i>\r\n");
      out.write("                            <label id=\"pwd_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"pwd_error\"></label>\r\n");
      out.write("                            <span class=\"clr\"></span>\r\n");
      out.write("                            <label class=\"hide\" id=\"pwdstrength\"><span class=\"fl\">安全程度：</span><b></b></label>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <script type=\"text/javascript\">\r\n");
      out.write("                        $('#pwd')[0].onkeypress = function (event) {\r\n");
      out.write("                            var e = event || window.event,\r\n");
      out.write("                                $tip =\r\n");
      out.write("                            $('#capslock'),\r\n");
      out.write("                                    kc = e.keyCode || e.which, // 按键的keyCode\r\n");
      out.write("                                    isShift = e.shiftKey || (kc == 16 ) || false; // shift键是否按住\r\n");
      out.write("                            if (((kc >= 65 && kc <= 90) && !isShift) || ((kc >= 97 && kc <= 122) && isShift)) {\r\n");
      out.write("                                    $tip.show();\r\n");
      out.write("                            }\r\n");
      out.write("                            else {\r\n");
      out.write("                                    $tip.hide();\r\n");
      out.write("                            }\r\n");
      out.write("                        };\r\n");
      out.write("                    </script>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>请确认密码：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"password\" id=\"pwdRepeat\" name=\"pwdRepeat\" class=\"text\" tabindex=\"3\"\r\n");
      out.write("                                   onpaste=\"return  false\" autocomplete=\"off\"/>\r\n");
      out.write("                            <i class=\"i-pass\"></i>\r\n");
      out.write("                            <label id=\"pwdRepeat_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"pwdRepeat_error\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t                    <div class=\"item\" id=\"dphone\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>验证手机：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"text\" id=\"phone\" maxlength=\"11\" name=\"phone\" class=\"text\" tabindex=\"4\" onfocus=\"phoneFocus();\" onKeyup=\"phoneKeyup();\" onblur=\"phoneBlur();\" autocomplete=\"off\"/>\r\n");
      out.write("                            <i class=\"i-phone\"></i>\r\n");
      out.write("                            <label id=\"phone_succeed\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"phone_error\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"fl\">\r\n");
      out.write("                            <span class=\"ftx-03 ml5\">或</span><a class=\"ftx-05 ml5 mail-verify\"\r\n");
      out.write("                                                                style=\"text-decoration:underline;\" href=\"javascript:;\">验证邮箱</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("                    <div id=\"mobileCodeDiv\" class=\"item hide\" style=\"height: 62px;\">\r\n");
      out.write("                        <span class=\"label\"><b class=\"ftx04\">*</b>短信验证码：</span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"fl item-ifo\">\r\n");
      out.write("                            <input type=\"text\" maxlength=\"6\" autocomplete=\"off\" tabindex=\"6\" class=\"text text-1\"\r\n");
      out.write("                                   name=\"mobileCode\"\r\n");
      out.write("                                   style=\"ime-mode:disabled\" id=\"mobileCode\" onblur=\"mobileCodeBlur()\"\r\n");
      out.write("                                   onfocus=\"mobileCodeFocus();\">\r\n");
      out.write("                            <label class=\"blank invisible\"></label>\r\n");
      out.write("                            <a class=\"btn\" href=\"javascript:void(0);\" onclick=\"sendMobileCode();\" id=\"sendMobileCode\">\r\n");
      out.write("                                <span id=\"dyMobileButton\">获取短信验证码</span></a>\r\n");
      out.write("                            <span class=\"clr\"></span>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"msg-text\" id=\"mobileCodeSucMessage\"></div>\r\n");
      out.write("                            <label id=\"mobileCode_error\" class=\"blank\"></label>\r\n");
      out.write("                            <label id=\"mobileCode_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span class=\"clr\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     -->\r\n");
      out.write("\t\t\t\t\t                </div>\r\n");
      out.write("                                <div class=\"item item-new\">\r\n");
      out.write("                    <span class=\"label\">&nbsp;</span>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"fl item-ifo\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"checkbox\" checked=\"checked\" id=\"readme\"\r\n");
      out.write("                               onclick=\"agreeonProtocol();\">\r\n");
      out.write("                        <label for=\"protocol\">我已阅读并同意<a href=\"#\" class=\"blue\" id=\"protocol\">《京东用户注册协议》</a></label>\r\n");
      out.write("                        <span class=\"clr\"></span>\r\n");
      out.write("                        <label id=\"protocol_error\" class=\"error hide\">请接受服务条款</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <span class=\"label\">&nbsp;</span>\r\n");
      out.write("                    <input type=\"button\" class=\"btn-img btn-regist\" id=\"registsubmit\" value=\"立即注册\" tabindex=\"8\"\r\n");
      out.write("                           clstag=\"regist|keycount|personalreg|07\"\r\n");
      out.write("                           onclick=\"reg();\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"phone\">\r\n");
      out.write("                <img width=\"180\" height=\"180\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/phone-bg.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("                        <span class=\"clr\"></span>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function hello() {\r\n");
      out.write("        var helloUrl = \"http://passport.jd.com/call/getHelloJson?m=ls\";\r\n");
      out.write("        jQuery.ajax({url: helloUrl, dataType: \"jsonp\", scriptCharset: \"gb2312\", success: function (a) {\r\n");
      out.write("            if (a && a.info) {\r\n");
      out.write("                $(\"#loginbar\").html(a.info);\r\n");
      out.write("            }\r\n");
      out.write("            if (a && a.sso) {\r\n");
      out.write("                $.each(a.sso, function () {\r\n");
      out.write("                    $.getJSON(this)\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        }});\r\n");
      out.write("    }\r\n");
      out.write("    (function ($) {\r\n");
      out.write("        $(\"#shortcut-2013 .menu\").Jdropdown({delay: 50});\r\n");
      out.write("        //hello();\r\n");
      out.write("    })(jQuery);</script>\r\n");
      out.write("<div class=\"w\">\r\n");
      out.write("\t<!-- links start -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../commons/footer-links.jsp", out, false);
      out.write("<!-- links end -->\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/register/jd.lib.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/register/jdThickBox.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/register/jdValidate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/register/jdValidate.emReg.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/register/jdValidate.regSuccess.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script id=\"box01\" type=\"text/temp\">\r\n");
      out.write("<div class=\"form thickbox-form\">\r\n");
      out.write("    <div class=\"ac ftx-01 mb10\">为了提升您的账户安全，请验证手机</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"item\"  id=\"dphone1\">\r\n");
      out.write("        <span class=\"label\"><b class=\"ftx04\">*</b>手机号码：</span>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"fl item-ifo\">\r\n");
      out.write("            <input type=\"text\" id=\"phone1\" name=\"phone1\" maxlength=\"11\"  class=\"text\" onblur=\"phone1Blur();\" onfocus=\"phone1Focus();\" onKeyup=\"phone1Keyup();\"  onpaste=\"return  false\"  autocomplete=\"off\">\r\n");
      out.write("            <i class=\"i-phone\"></i>\r\n");
      out.write("            <label id=\"phone1_succeed\" ></label>\r\n");
      out.write("            <label id=\"phone1_error\" class=\"\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"item \" id=\"mobileCodeDiv1\">\r\n");
      out.write("        <span class=\"label\"><b class=\"ftx04\">*</b>短信验证码：</span>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"fl item-ifo\">\r\n");
      out.write("            <input type=\"text\" maxlength=\"6\" autocomplete=\"off\"  class=\"text text-1\" name=\"mobileCode1\" onblur=\"mobileCode1Blur()\" onfocus=\"mobileCode1Focus();\"  style=\"ime-mode:disabled\" id=\"mobileCode1\">\r\n");
      out.write("            <label class=\"blank invisible\"></label>\r\n");
      out.write("            <a class=\"btn\" href=\"javascript:void(0);\" onclick=\"sendMobileCode1();\"   id=\"sendMobileCode1\">\r\n");
      out.write("                <span id=\"dyMobileButton1\">获取短信验证码</span></a>\r\n");
      out.write("\r\n");
      out.write("            <span class=\"clr\"></span>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"msg-text\" id=\"mobileCodeSucMessage1\"></div>\r\n");
      out.write("            <label id=\"mobileCode1_error\"  class=\"\"></label>\r\n");
      out.write("            <label id=\"mobileCode1_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("        <span class=\"label\">&nbsp;</span>\r\n");
      out.write("        <input type=\"button\" class=\"btn-img btn-verify\" onclick=\"mobileReg();\" value=\"立即验证\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script id=\"box02\" type=\"text/temp\">\r\n");
      out.write("<div class=\"form thickbox-form\">\r\n");
      out.write("<div class=\"f-body\">\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("        <span class=\"label\"><b class=\"ftx04\">*</b>请输入邮箱：</span>\r\n");
      out.write("        <div class=\"fl item-ifo\">\r\n");
      out.write("            <input type=\"text\" id=\"mail\" name=\"mail\" class=\"text\"  onpaste=\"return  false\" autocomplete=\"off\"> \r\n");
      out.write("            <label id=\"mail_succeed\" class=\"blank\"></label>\r\n");
      out.write("           <label id=\"mail_error\" class=\"\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"f-footer\">\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("        <span class=\"label\">&nbsp;</span>\r\n");
      out.write("       <input type=\"button\" class=\"btn-img btn-verify\" value=\"发送邮箱验证\" onclick=\"sendRegMail();\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   </div>\r\n");
      out.write("<script id=\"box04\" type=\"text/temp\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"box05\" type=\"text/temp\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  var closeMobileReg='$closeMobileReg';\r\n");
      out.write("    $(function () {\r\n");
      out.write("\r\n");
      out.write("        $('.mail-verify').bind('click', function () {\r\n");
      out.write("\r\n");
      out.write("            if (validateRegName() && validateFunction.regValidate()) {\r\n");
      out.write("    \t\t\toldEmail=\"\";\r\n");
      out.write("    \t\t\temailCheckResult=\"\";\r\n");
      out.write("    \t\t\toldMobile1=\"\";\r\n");
      out.write("    \t\t\tmobileResult1=\"\";\r\n");
      out.write("\t\t\t\temailCheckResult=\"\";\r\n");
      out.write("                clearTimeout(countDown1.timer);\r\n");
      out.write("\t\t\t\tdelayTime1=120;\r\n");
      out.write("\t\t\t\tdelayFlag1=true;\r\n");
      out.write("                jQuery.jdThickBox({\r\n");
      out.write("                    type: \"text\", /*也可以是text,html,image,ajax,json*/\r\n");
      out.write("                    width: 500,\r\n");
      out.write("                    height: 260,\r\n");
      out.write("                    source: $('#box02').html(),\r\n");
      out.write("                    title: \"验证邮箱\",\r\n");
      out.write("                    _close_val: \"×\",\r\n");
      out.write("                    _con: \"opinioncon\",\r\n");
      out.write("                    _titleOn: true\r\n");
      out.write("                }, function () {\r\n");
      out.write("                    $('#mail').bind('blur', function () {\r\n");
      out.write("                        var mail = $(\"#mail\").val();\r\n");
      out.write("                        if (mail == \"\") {\r\n");
      out.write("                            $('#mail').removeClass().addClass(\"text\");\r\n");
      out.write("                            $('#mail_error').removeClass(\"error\");\r\n");
      out.write("                            $(\"#mail_error\").hide();\r\n");
      out.write("                            $('#mail_succeed').removeClass('error-ico');\r\n");
      out.write("                            return;\r\n");
      out.write("                        }\r\n");
      out.write("                        var email = strTrim(mail);\r\n");
      out.write("                        var format = validateRules.isEmail(email);\r\n");
      out.write("                        var format2 = validateRules.betweenLength(email, 0, 50);\r\n");
      out.write("                        if (!format) {\r\n");
      out.write("                            $('#mail_error').removeClass().addClass(\"error\");\r\n");
      out.write("                            $(\"#mail_error\").html(\"邮箱地址不正确，请重新输入\");\r\n");
      out.write("                            $('#mail_succeed').addClass('error-ico');\r\n");
      out.write("                            $('#mail').removeClass(\"highlight1\").addClass('highlight2');\r\n");
      out.write("                            return;\r\n");
      out.write("                        } else {\r\n");
      out.write("                            if (!format2) {\r\n");
      out.write("                                $('#mail_error').removeClass().addClass(\"error\");\r\n");
      out.write("                                $(\"#mail_error\").html(\"邮箱地址长度应在4-50个字符之间\");\r\n");
      out.write("                                $('#mail_succeed').addClass('error-ico');\r\n");
      out.write("                                $('#mail').removeClass(\"highlight1\").addClass('highlight2');\r\n");
      out.write("                                return;\r\n");
      out.write("                            }\r\n");
      out.write("                            jQuery.getJSON(\"../validate/isEmailEngaged?email=\" + escape(email) + \"&r=\" + Math.random(),\r\n");
      out.write("                                    function (result) {\r\n");
      out.write("                                        emailResult = result.success;\r\n");
      out.write("                                        // 邮箱未被验证 可注册\r\n");
      out.write("                                        if (emailResult == 0) {\r\n");
      out.write("                                            $(\"#mail_error\").removeClass().addClass(\"success\").html(\"此邮箱可用\");\r\n");
      out.write("                                            $('#mail_succeed').removeClass().addClass('blank succeed');\r\n");
      out.write("                                            $('#mail').removeClass('highlight2');\r\n");
      out.write("                                        }\r\n");
      out.write("                                        if (emailResult == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#mail').removeClass().addClass(\"text highlight2\");\r\n");
      out.write("                                            $('#mail_error').removeClass().addClass(\"error\");\r\n");
      out.write("                                            $(\"#mail_error\").html(\"该邮箱已被使用，请更换其它邮箱\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#mail_succeed').removeClass().addClass('blank error-ico');\r\n");
      out.write("                                            return;\r\n");
      out.write("                                        }\r\n");
      out.write("                                        if (emailResult == 2) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#mail').removeClass().addClass(\"text highlight2\");\r\n");
      out.write("                                            $('#mail_error').removeClass().addClass(\"error\");\r\n");
      out.write("                                            $(\"#mail_error\").html(\"邮箱地址不正确，请重新输入\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#mail_succeed').removeClass().addClass('blank error-ico');\r\n");
      out.write("                                            return;\r\n");
      out.write("                                        }\r\n");
      out.write("                                    });\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    $('#mail').bind('focus', function () {\r\n");
      out.write("                        $('#mail').removeClass().addClass('text highlight1');\r\n");
      out.write("                        $(\"#mail_error\").removeClass().addClass(\"focus\").html(\"完成验证后，您可以用该邮箱登录和找回密码\");\r\n");
      out.write("                        $(\"#mail_error\").show();\r\n");
      out.write("                        $('#mail_succeed').removeClass('error-ico');\r\n");
      out.write("                    });\r\n");
      out.write("                    $('#JD_Verification2').click();\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
