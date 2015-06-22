package org.apache.jsp.WEB_002dINF.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tmpl_002ditem_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/c.tld");
  }

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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<iframe name=\"ajax-submit-callback\" src=\"about:blank\" style=\"display:none;\" >\r\n");
      out.write("\t\r\n");
      out.write("</iframe>\r\n");
      out.write("<div>\r\n");
      out.write("\t<form id=\"u_item\" target=\"ajax-submit-callback\" action=\"../../../item/item/add.shtml?store_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.storeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"name\" type=\"text\" maxlength=\"32\" name=\"name\" placeholder=\"请填写商品名称\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<span style=\"width: 100%; display: block; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; color: initial;  -webkit-appearance: textfield;-webkit-appearance: textfield; padding: 1px; background-color: white; border: 0px inset; border-image-source: initial; border-image-slice: initial; border-image-width: initial; border-image-outset: initial; border-image-repeat: initial; -webkit-rtl-ordering: logical; -webkit-user-select: text; cursor: auto; color: darkgrey;\">商品图片</span>\r\n");
      out.write("\t\t\t<span class=\"add-item-img\" style=\"position: relative;\"><input id=\"item_image\" type=\"file\" name=\"item_image\" style=\"width: 100%; position: absolute; top: 0px; right: 0px; bottom: 0px; left: 0px; text-align: right; opacity:0; filter:Alpha(opacity: 0);\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"margin: 2px 5px 3px; padding: 3px 5px 3px 15px; border: 0px solid silver; background-color: white; background-image: url('images/qapp_center_loading.png'); background-position: center center; background-repeat: no-repeat; opacity: 0.6;\">\r\n");
      out.write("\t\t\t<textarea id=\"content\" name=\"content\" rows=\"10\" spellcheck=\"true\" contenteditable=\"true\" placeholder=\"请输入商品描述\" style=\"width: 100%; border: 0px solid red; margin: 0px 0px; padding: 0px 0px; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; resize: none; outline: none; opacity: 0.6; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only;\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"price\" type=\"number\" maxlength=\"32\" name=\"price\" placeholder=\"请输入商品价格\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver;\">\r\n");
      out.write("\t\t\t<input id=\"stock\" type=\"number\" maxlength=\"32\" name=\"stock\" placeholder=\"请输入商品库存\" style=\"width: 100%; height: 35px; line-height: 35px; border: 0px solid red; background: transparent; font-size: 14px; font-family: Arial, 'Microsoft YaHei'; outline: none; -webkit-tap-highlight-color:rgba(0,0,0,0); -webkit-user-modify:read-write-plaintext-only; margin: 0; -moz-appearance: textfield;\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- \r\n");
      out.write("\t\t<input type=\"submit\" value=\"提交\" style=\"\"/>\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
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
