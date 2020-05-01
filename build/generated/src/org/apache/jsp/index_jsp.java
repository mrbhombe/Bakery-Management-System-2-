package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("\t<!-- Apple devices fullscreen -->\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\n");
      out.write("\t<!-- Apple devices fullscreen -->\n");
      out.write("\t<meta names=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\" />\n");
      out.write("\t\n");
      out.write("\t<title>Login</title>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<!-- Bootstrap responsive -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\">\n");
      out.write("\t<!-- icheck -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/icheck/all.css\">\n");
      out.write("\t<!-- Theme CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<!-- Color CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themes.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Nice Scroll -->\n");
      out.write("\t<script src=\"js/plugins/nicescroll/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<!-- Validation -->\n");
      out.write("\t<script src=\"js/plugins/validation/jquery.validate.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/validation/additional-methods.min.js\"></script>\n");
      out.write("\t<!-- icheck -->\n");
      out.write("\t<script src=\"js/plugins/icheck/jquery.icheck.min.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/eakroko.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--[if lte IE 9]>\n");
      out.write("\t\t<script src=\"js/plugins/placeholder/jquery.placeholder.min.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t$('input, textarea').placeholder();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!-- Favicon -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/favicon.ico\" />\n");
      out.write("\t<!-- Apple devices Homescreen icon -->\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"img/apple-touch-icon-precomposed.png\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class='login'>\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t<h1><a href=\"#\"><img src=\"img/logo-big.png\" alt=\"\" class='retina-ready' width=\"59\" height=\"49\">My Bakery</a></h1>\n");
      out.write("\t  <div class=\"login-body\">\n");
      out.write("\t\t\t<h2>SIGN IN</h2>\n");
      out.write("\t\t\t<form  method='post' class='form-validate' id=\"test\" action=\"loginServlet\">\n");
      out.write("\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t<div class=\"email controls\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name='uemail' placeholder=\"Username\" class='input-block-level' >\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t<div class=\"pw controls\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"upw\" placeholder=\"Password\" id=\"pass\" class='input-block-level' >\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\"  onClick=\"myfunc()\">&nbsp;Show password\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<center><input type=\"submit\" value=\"Sign me in\" class='btn btn-primary' name=\"btnlogin\"  ></center>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\tfunction myfunc()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\tvar x=document.getElementById(\"pass\");\n");
      out.write("\t\t\tif(x.type==\"password\")\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t   x.type=\"text\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t   x.type=\"password\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<div class=\"forget\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\tvar _gaq = _gaq || [];\n");
      out.write("\t_gaq.push(['_setAccount', 'UA-38620714-4']);\n");
      out.write("\t_gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("\t(function() {\n");
      out.write("\t\tvar ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("\t\tga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("\t\tvar s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("\t})();\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.eakroko.de/flat/more-login.html by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:56:12 GMT -->\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
