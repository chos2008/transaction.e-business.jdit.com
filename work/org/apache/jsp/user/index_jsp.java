package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/common-style.css\"/>\r\n");
      out.write("<title>谁是谁的菜</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0px 0px;\">\r\n");
      out.write("<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<label title=\"paypal\" class=\"icon-paypal\" style=\"height: 50px; width: 100%; line-height: 70px; display: block; background: url('../images/i_96x96.png'); background-size: 62px 62px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../bid/list.shtml\">我的标书</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<div title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 47px; width: 47px; line-height: 70px; margin: 1.5px auto; border-radius: 3px 3px; display: block; background: url('../images/c_108x108.png'); background-size: 48px 48px; background-position: center; background-repeat: no-repeat;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../bid.jsp\">招标</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 50px; width: 100%; line-height: 70px; display: block; background: url('../images/aqt.png'); background-size: 52px 52px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"\">竞标</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<label title=\"amex\" class=\"icon-cc-amex\" style=\"height: 50px; width: 100%; line-height: 70px; display: block; background: url('../images/i.png'); background-size: 36px 36px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../user/1234.shtml\">我的账号</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<div title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 47px; width: 47px; line-height: 70px; margin: 1.5px auto; border-radius: 3px 3px; display: block; background: url('../images/b_108x108.png'); background-size: 48px 48px; background-position: center; background-repeat: no-repeat;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../item.shtml?firstResult=0&maxResultSize=50\">我的需求</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<div title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\">\r\n");
      out.write("\t\t\t\t<div style=\"height: 47px; width: 47px; line-height: 70px; margin: 1.5px auto; border-radius: 3px 3px; display: block; background: url('../images/a_108x108.png'); background-size: 48px 48px; background-position: center; background-repeat: no-repeat;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../investment.jsp\">发布需求</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"height: 50px; width: 100%; line-height: 70px; display: block; background: url('../images/aa1_60x60.png'); background-size: 45px 45px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"../investment/splash.jsp\">寻找投资</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 70px; text-align: center;\">\r\n");
      out.write("\t\t<div style=\"height: 70px; border: 1px solid silver;\">\r\n");
      out.write("\t\t\t<label title=\"amex\" class=\"icon-cc-amex\" style=\"height: 50px; width: 100%; line-height: 70px; display: block; background: url('../images/afe.png'); background-size: 62px 62px; background-position: center; background-repeat: no-repeat;\"></label>\r\n");
      out.write("\t\t\t<label style=\"width: 100%; display: block;\"><a href=\"\">成功案例</a></label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\" style=\"width: 100%; bottom: 0px; position: absolute; text-align: center;\">\r\n");
      out.write("\t<div style=\"padding: .9rem .4rem 4rem; background-color: #4e525e;\">\r\n");
      out.write("\t\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../login.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">登录</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width: 160px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../weibo.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">使用微博帐号登录</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width: 70px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"../register2.shtml\" style=\"border-radius: 6px; font-size: 14px; display: block; height: 1.5rem; line-height: 1.5rem; color: #c3c6ca; border: 2px solid #42454d; background-color: #555965; padding: 0 .75rem; text-decoration: none;\">注册</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t\t<p style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" style=\"text-decoration: none;\">触屏版</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" style=\"text-decoration: none;\">极速版</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width: 70px; height: 36px; line-height: 36px; margin: 0px 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" style=\"text-decoration: none;\">电脑版</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 100%; margin-top: .9rem; height: .9rem; line-height: .9rem; box-sizing: border-box; background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACEAAAAhCAMAAABgOjJdAAAAGXRFW…v7MdDuE3a/JRrCmqwFQ2yV8gmvg/d+aPCMH0GLvB//AgwAo1MTpxsaxVoAAAAASUVORK5CYII=) no-repeat 3.7rem center; background-size: .85rem .85rem; color: #c3c6ca; font-size: 12px;\">\r\n");
      out.write("\t\t\t上海正旅网络科技有限公司版权所有 2008-2014 <a href=\"#\" target=\"_blank\" seed=\"copyright-link\" smartracker=\"on\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
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
