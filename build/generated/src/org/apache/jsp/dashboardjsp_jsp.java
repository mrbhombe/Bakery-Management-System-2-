package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class dashboardjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("\t<!-- Apple devices fullscreen -->\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\n");
      out.write("\t<!-- Apple devices fullscreen -->\n");
      out.write("\t<meta names=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\" />\n");
      out.write("\t\n");
      out.write("\t<title>Dashboard</title>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<!-- Bootstrap responsive -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\">\n");
      out.write("\t<!-- jQuery UI -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/jquery-ui/smoothness/jquery-ui.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/jquery-ui/smoothness/jquery.ui.theme.css\">\n");
      out.write("\t<!-- PageGuide -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/pageguide/pageguide.css\">\n");
      out.write("\t<!-- Fullcalendar -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/fullcalendar/fullcalendar.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/fullcalendar/fullcalendar.print.css\" media=\"print\">\n");
      out.write("\t<!-- chosen -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/chosen/chosen.css\">\n");
      out.write("\t<!-- select2 -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins/select2/select2.css\">\n");
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
      out.write("\t\n");
      out.write("\t<!-- Nice Scroll -->\n");
      out.write("\t<script src=\"js/plugins/nicescroll/jquery.nicescroll.min.js\"></script>\n");
      out.write("\t<!-- jQuery UI -->\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.core.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.widget.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.mouse.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.draggable.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.resizable.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/jquery-ui/jquery.ui.sortable.min.js\"></script>\n");
      out.write("\t<!-- Touch enable for jquery UI -->\n");
      out.write("\t<script src=\"js/plugins/touch-punch/jquery.touch-punch.min.js\"></script>\n");
      out.write("\t<!-- slimScroll -->\n");
      out.write("\t<script src=\"js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- vmap -->\n");
      out.write("\t<script src=\"js/plugins/vmap/jquery.vmap.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/vmap/jquery.vmap.world.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/vmap/jquery.vmap.sampledata.js\"></script>\n");
      out.write("\t<!-- Bootbox -->\n");
      out.write("\t<script src=\"js/plugins/bootbox/jquery.bootbox.js\"></script>\n");
      out.write("\t<!-- Flot -->\n");
      out.write("\t<script src=\"js/plugins/flot/jquery.flot.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/flot/jquery.flot.bar.order.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("\t<script src=\"js/plugins/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("\t<!-- imagesLoaded -->\n");
      out.write("\t<script src=\"js/plugins/imagesLoaded/jquery.imagesloaded.min.js\"></script>\n");
      out.write("\t<!-- PageGuide -->\n");
      out.write("\t<script src=\"js/plugins/pageguide/jquery.pageguide.js\"></script>\n");
      out.write("\t<!-- FullCalendar -->\n");
      out.write("\t<script src=\"js/plugins/fullcalendar/fullcalendar.min.js\"></script>\n");
      out.write("\t<!-- Chosen -->\n");
      out.write("\t<script src=\"js/plugins/chosen/chosen.jquery.min.js\"></script>\n");
      out.write("\t<!-- select2 -->\n");
      out.write("\t<script src=\"js/plugins/select2/select2.min.js\"></script>\n");
      out.write("\t<!-- icheck -->\n");
      out.write("\t<script src=\"js/plugins/icheck/jquery.icheck.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Theme framework -->\n");
      out.write("\t<script src=\"js/eakroko.min.js\"></script>\n");
      out.write("\t<!-- Theme scripts -->\n");
      out.write("\t<script src=\"js/application.min.js\"></script>\n");
      out.write("\t<!-- Just for demonstration -->\n");
      out.write("\t<script src=\"js/demonstration.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Favicon -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/favicon.ico\" />\n");
      out.write("\t<!-- Apple devices Homescreen icon -->\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"img/apple-touch-icon-precomposed.png\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<div id=\"navigation\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerjsp.jsp", out, false);
      out.write("  \n");
      out.write("                        ");

       //String id = request.getParameter("userId");
       String driverName = "com.mysql.jdbc.Driver";
       String connectionUrl = "jdbc:mysql://localhost:3306/bakery?zeroDateTimeBehavior=convertToNull";
       String dbName = "";
       String userId = "root";
       String password = "";

       try {
       Class.forName(driverName);
       } catch (ClassNotFoundException e) {
       e.printStackTrace();
       }

       Connection connection = null;
       Statement statement = null;
       Statement statement1 = null;
       
       ResultSet resultSet = null;
       ResultSet resultSet1 = null;
       String id="";
       id = session.getAttribute("uid").toString();
       
       
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container-fluid\" id=\"content\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"main\" style=\"margin:1px\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t\t\t<div class=\"pull-left\">\n");
      out.write("\t\t\t\t\t\t<h1>Dashboard</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Dashboard</a>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"close-bread\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon-remove\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"span7\">\n");
      out.write("\t\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"box box-color box-bordered\" style=\"margin-right:25%\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-title\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-table\"></i>\n");
      out.write("New Order Detail\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-content nopadding\" >\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-hover table-nomargin dataTable table-bordered\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='name'>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='desig'>Address</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='category'>Contact</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='category'>Delivery Status</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='category'>Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='category'>Action</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                                                                        
            try{ 
            
            String cid="";
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            statement1=connection.createStatement();
            String sql ="Select * from tbl_order DESC";
                
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                          cid = resultSet.getString("cid");
                          String sql1="select * from tbl_customer where cid ="+cid;
                                   resultSet1 = statement1.executeQuery(sql1);
                                   resultSet1.next();
                                  
                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class='name'>");
      out.print(resultSet1.getString("cname") );
      out.write("<</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class='desig'>");
      out.print(resultSet1.getString("caddr") );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class='category'>");
      out.print(resultSet1.getString("ccont") );
      out.write("></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class='category'>");
      out.print(resultSet.getString("delivered") );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class='category'>");
      out.print(resultSet.getString("date") );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"view_order_product_list.php?list=<?php echo $b['oid'];  ?>\" class=\"btn btn-primary\">View Product List</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr\n");
      out.write("                                         ");
 
                                              out.print(sql);
                                   out.print(sql1);
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"span2\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t $(\"#linkdashboard\").addClass('active');\n");
      out.write("\n");
      out.write("\t\tvar _gaq = _gaq || [];\n");
      out.write("\t\t_gaq.push(['_setAccount', 'UA-38620714-4']);\n");
      out.write("\t\t_gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("\t\t(function() {\n");
      out.write("\t\t\tvar ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("\t\t\tga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("\t\t\tvar s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("\t\t})();\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!-- Mirrored from www.eakroko.de/flat/ by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:47:08 GMT -->\n");
      out.write("</html>\n");
      out.write("\n");
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
