package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class investment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<title>谁是谁的菜</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction unbind(dom, type, listener) {\r\n");
      out.write("\t\tif (dom.removeEventListener) {\r\n");
      out.write("\t\t\tdom.removeEventListener(type, listener, false);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdom.detachEvent(\"on\" + type, listener);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction bind(dom, type, listener) {\r\n");
      out.write("\t\tif (dom.addEventListener) {\r\n");
      out.write("\t\t\tdom.addEventListener(type, listener, false);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdom.attachEvent(\"on\" + type, listener);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction back() {\r\n");
      out.write("\t\tvar i = document.getElementById('investment');\r\n");
      out.write("\t\tvar sp = document.getElementById('sp');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsp.style.display = 'none';\r\n");
      out.write("\t\ti.style.display = 'none';\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar menuItem = document.getElementById('menu-item');\r\n");
      out.write("\t\tmenuItem.style.display = 'block';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction commit(investment) {\r\n");
      out.write("\t\tvar menuItem = document.getElementById('menu-item');\r\n");
      out.write("\t\tmenuItem.style.display = 'none';\r\n");
      out.write("\t\tif (investment == 1) {\r\n");
      out.write("\t\t\tvar i = document.getElementById('investment');\r\n");
      out.write("\t\t\tvar sp = document.getElementById('sp');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsp.style.display = 'block';\r\n");
      out.write("\t\t\ti.style.display = 'none';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar b = document.getElementById('nav-back');\r\n");
      out.write("\t\t\tunbind(b, \"click\", back);\r\n");
      out.write("\t\t\tbind(b, \"click\", back);\r\n");
      out.write("\t\t} else if(investment == 2) {\r\n");
      out.write("\t\t\tvar i = document.getElementById('investment');\r\n");
      out.write("\t\t\tvar sp = document.getElementById('sp');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsp.style.display = 'none';\r\n");
      out.write("\t\t\ti.style.display = 'block';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar b = document.getElementById('nav-back');\r\n");
      out.write("\t\t\tunbind(b, \"click\", back);\r\n");
      out.write("\t\t\tbind(b, \"click\", back);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onsole() {\r\n");
      out.write("\t\tvar project = document.getElementById('project');\r\n");
      out.write("\t\tproject.placeholder = \"请描述您的需求\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar submit = document.getElementById('submit-investment');\r\n");
      out.write("\t\tsubmit.value = \"发布需求\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction oncompany() {\r\n");
      out.write("\t\tvar project = document.getElementById('project');\r\n");
      out.write("\t\tproject.placeholder = \"请描述您要发布的生意\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar submit = document.getElementById('submit-investment');\r\n");
      out.write("\t\tsubmit.value = \"发布生意\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px; padding: 0px 0px;\">\r\n");
      out.write("<div id=\"nav\" style=\"width = 100%;\">\r\n");
      out.write("\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t<p id=\"nav-back\" style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"javascript: void(0);\">返回</a></label>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t<label title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"investment.jsp\"></a></label>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu-item\" style=\"width = 100%;\">\r\n");
      out.write("\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t<div onclick=\"javascript: commit(1);\" style=\"width: 70px; text-align: center; margin: 4px 4px 4px 2px;\">\r\n");
      out.write("\t\t\t<div style=\"height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;\">\r\n");
      out.write("\t\t\t\t<label title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"javascript: void(0);\">寻找项目</a></label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div onclick=\"javascript: commit(2);\" style=\"width: 70px; text-align: center; margin: 4px 2px 4px 4px;\">\r\n");
      out.write("\t\t\t<div style=\"height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;\">\r\n");
      out.write("\t\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"javascript: void(0);\">招商</a></label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div onclick=\"javascript: commit(3);\" style=\"width: 70px; text-align: center; margin: 4px 2px 4px 4px;\">\r\n");
      out.write("\t\t\t<div style=\"height: 70px; border: 1px solid silver; border-radius: 3px 3px; -moz-border-radius: 3px 3px; -webkit-border-radius: 3px 3px;\">\r\n");
      out.write("\t\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"javascript: void(0);\">个人需求</a></label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"investment\" style=\"display: none;\">\r\n");
      out.write("\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<label><input type=\"radio\" name =\"option\" value=\"sole\" onclick=\"javascript: onsole();\">个体</label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<label><input type=\"radio\" name =\"option\" value=\"company\" checked=\"checked\" onclick=\"javascript: oncompany();\">公司</label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"project\" type=\"text\" name=\"pname\" placeholder=\"请填写招标项目名称\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"手机/电子邮箱\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目金额\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<textarea rows=\"20\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请填写招标项目具体要求\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目结束时间\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver; text-align: center;\">\r\n");
      out.write("\t\t\t<input id=\"submit-investment\" type=\"submit\" value=\"发布招标项目\" style=\"width: 100%; height: 35px; border: 1px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"sp\" style=\"display: none;\">\r\n");
      out.write("\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目名称\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"手机/电子邮箱\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目金额\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<textarea rows=\"20\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请填写招标项目具体要求\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目结束时间\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver; text-align: center;\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"发布招标项目\" style=\"width: 100%; height: 35px; border: 1px solid red;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
