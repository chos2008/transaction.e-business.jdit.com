package org.apache.jsp.WEB_002dINF.business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class merchant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>商户</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/common-style.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/zepto/zepto.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/merchant.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px; padding: 0px 0px;\">\r\n");
      out.write("<div class=\"full-screen\">\r\n");
      out.write("\t<div class=\"nav-bar nav-bar-2_0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; position: absolute; top: 70px; bottom: 0px;\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"../images/logo-caibei.png\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"position: relative;\">\r\n");
      out.write("\t\t\t\t<i id=\"icon-location\" class=\"icon-location\" style=\"width: 13px; height: 20px; margin: 2px 3px; display: block; background: url('../images/fah.png'); float: left;\"></i>\r\n");
      out.write("\t\t\t\t<div style=\"position: relative; margin: 2px 5px 3px 20px; border: 0px solid silver; font-size: 14px; font-family: Arial, 'Microsoft YaHei';\">\r\n");
      out.write("\t\t\t\t\t彩贝网\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div style=\"display: block; margin-bottom: 5px;\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t彩贝网（www.caibei.com）是多麦电子商务有限公司旗下网站。联合珠宝品牌商、生产商、原材料供应商、销售商，以传统商贸为基础，用互联网技术为彩宝投资商提供全面、真实的彩宝展示信息平台服务；采用B2B2C经营模式，建立彩宝电子商务 “ 诚信、专业、权威 ” 的线上、线下交易群，为商家和用户提供搭建专业的彩宝展示信息平台。\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t彩贝网宗旨：\r\n");
      out.write("坚持用户第一、服务至上，致力为中国珠宝行业提供整套电子商务解决方案，以“诚信、专业、权威”打造珠宝行业电子商务的领军品牌。\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t彩贝网目标：\r\n");
      out.write("通过彩贝网的努力，做出更多对用户有价值、优秀用户体验的一流产品。\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t杭州多麦电子商务有限公司成立于2008年4月，旗下另拥有4.cn金名网、CPS广告联盟、米贷网等互联网平台。\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t公司以“尊重、主动、专业、团队”为核心价值，争取做一家健康成长的知名企业，持续发展以致百年。五年来，我们一直秉承“以客户需求为核心”的理念，提供专业的服务，赢得了业界人士的一致好评和信赖。\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t先后获得 “最受站长欢迎的域名平台” （2008-2009年度、2009-2010年度）、“最受欢迎的站长服务商”（2010－2011年度）、“最佳域名服务提供商”（2011－2012年度）、“最佳电商广告联盟（2011－2012年度）等奖项。\r\n");
      out.write("\t\t\t</p>\r\n");
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
