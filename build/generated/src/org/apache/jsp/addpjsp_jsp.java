package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addpjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"span8\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"box box-bordered box-color\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-title\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3><i class=\"icon-th-list\"></i>Add Product</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"viewProductjsp.jsp\" class=\"btn\" style=\"float:right; margin-right:10px\"><i class=\"icon-eye-open\"></i> View All</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-content nopadding\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"myproductform\" method=\"post\" action=\"insertProductServlet\" class='form-horizontal form-bordered' enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"textarea\" class=\"control-label\">Product Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\"  name='pname' placeholder=\"Product Name\" id=\"textarea\" rows=\"3\" class=\"input-xlarge\"  data-bvalidator=\"alpha,required\" data-bvalidator-msg=\"Please Enter Product Name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"textarea\" class=\"control-label\">Description</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea name='pdesc'  placeholder=\"Enter Description\" id=\"textarea\" rows=\"3\" class=\"input-xlarge\" data-bvalidator=\"required\" data-bvalidator-msg=\"Please Enter Description\"> </textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>  \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"textfield\" class=\"control-label\">Product Price</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" name='pprice'  id=\"textfield\" placeholder=\"Product Price\" class=\"input-xlarge\" data-bvalidator=\"number,required\" data-bvalidator-msg=\"Please enter Price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"textfield\" class=\"control-label\">Product Image</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"file\" name='pimage' multiple placeholder=\"product image\"  class=\"input-xlarge\" data-bvalidator=\"extension[jpg:png:jpeg],required\" data-bvalidator-msg=\"Please select file of type .jpg, .png or .jpeg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"textfield\" class=\"control-label\">Product Quantity</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" name='pqty'  id=\"textfield\" placeholder=\"Product Quantity\" class=\"input-xlarge\" data-bvalidator=\"number,required\" data-bvalidator-msg=\"Please enter quantity\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Submit\" name=\"submit\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"viewProductjsp.jsp\" type=\"cancel\" class=\"btn\" >Cancel</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("            \n");
      out.write("    </body>\n");
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
