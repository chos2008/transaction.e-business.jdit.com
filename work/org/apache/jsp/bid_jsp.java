package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bid_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 100%;\">\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目名称\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"pname\" placeholder=\"手机/电子邮箱\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目金额\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t<textarea rows=\"20\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请填写招标项目具体要求\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; resize: none;\"></textarea>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"pname\" placeholder=\"请填写招标项目结束时间\" style=\"width: 100%; height: 35px; border: 0px solid red;\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin: 2px 5px 3px; border: 1px solid silver; text-align: center;\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"发布招标项目\" style=\"width: 100%; height: 35px; border: 1px solid red;\"/>\r\n");
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
