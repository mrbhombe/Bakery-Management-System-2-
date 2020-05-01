<%-- 
    Document   : dashboardjsp
    Created on : 25 Apr, 2020, 3:04:51 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<!-- Apple devices fullscreen -->
	<meta names="apple-mobile-web-app-status-bar-style" content="black-translucent" />
	
	<title>Dashboard</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- Bootstrap responsive -->
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
	<!-- jQuery UI -->
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery-ui.css">
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
	<!-- PageGuide -->
	<link rel="stylesheet" href="css/plugins/pageguide/pageguide.css">
	<!-- Fullcalendar -->
	<link rel="stylesheet" href="css/plugins/fullcalendar/fullcalendar.css">
	<link rel="stylesheet" href="css/plugins/fullcalendar/fullcalendar.print.css" media="print">
	<!-- chosen -->
	<link rel="stylesheet" href="css/plugins/chosen/chosen.css">
	<!-- select2 -->
	<link rel="stylesheet" href="css/plugins/select2/select2.css">
	<!-- icheck -->
	<link rel="stylesheet" href="css/plugins/icheck/all.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="css/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="css/themes.css">


	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	
	
	<!-- Nice Scroll -->
	<script src="js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.draggable.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.sortable.min.js"></script>
	<!-- Touch enable for jquery UI -->
	<script src="js/plugins/touch-punch/jquery.touch-punch.min.js"></script>
	<!-- slimScroll -->
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- vmap -->
	<script src="js/plugins/vmap/jquery.vmap.min.js"></script>
	<script src="js/plugins/vmap/jquery.vmap.world.js"></script>
	<script src="js/plugins/vmap/jquery.vmap.sampledata.js"></script>
	<!-- Bootbox -->
	<script src="js/plugins/bootbox/jquery.bootbox.js"></script>
	<!-- Flot -->
	<script src="js/plugins/flot/jquery.flot.min.js"></script>
	<script src="js/plugins/flot/jquery.flot.bar.order.min.js"></script>
	<script src="js/plugins/flot/jquery.flot.pie.min.js"></script>
	<script src="js/plugins/flot/jquery.flot.resize.min.js"></script>
	<!-- imagesLoaded -->
	<script src="js/plugins/imagesLoaded/jquery.imagesloaded.min.js"></script>
	<!-- PageGuide -->
	<script src="js/plugins/pageguide/jquery.pageguide.js"></script>
	<!-- FullCalendar -->
	<script src="js/plugins/fullcalendar/fullcalendar.min.js"></script>
	<!-- Chosen -->
	<script src="js/plugins/chosen/chosen.jquery.min.js"></script>
	<!-- select2 -->
	<script src="js/plugins/select2/select2.min.js"></script>
	<!-- icheck -->
	<script src="js/plugins/icheck/jquery.icheck.min.js"></script>

	<!-- Theme framework -->
	<script src="js/eakroko.min.js"></script>
	<!-- Theme scripts -->
	<script src="js/application.min.js"></script>
	<!-- Just for demonstration -->
	<script src="js/demonstration.min.js"></script>
	
	
	<!-- Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico" />
	<!-- Apple devices Homescreen icon -->
	<link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-precomposed.png" />

</head>

<body>
	
	<div id="navigation">
		<jsp:include page="headerjsp.jsp" />  
                        <%
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
       
       %>

	</div>
	<div class="container-fluid" id="content">
		
		<div id="main" style="margin:1px">
			<div class="container-fluid">
				<div class="page-header">
					<div class="pull-left">
						<h1>Dashboard</h1>
					</div>
					
				</div>
				<div class="breadcrumbs">
					<ul>
						
						<li>
							<a href="#">Dashboard</a>
							<i class="icon-angle-right"></i>
						</li>
					</ul>
					<div class="close-bread">
						<a href="#"><i class="icon-remove"></i></a>
					</div>
				</div>
				<div class="span7">
								<div class="span7">
												<div class="span7">
																<div class="span7">
																				<div class="span7">
																								<div class="span7">
				<div class="span12">
						<div class="box box-color box-bordered" style="margin-right:25%">
							<div class="box-title">
								<h3>
									<i class="icon-table"></i>
New Order Detail
								</h3>
								
							</div>
							<div class="box-content nopadding" >
					
							
								<table class="table table-hover table-nomargin dataTable table-bordered" >
									<thead>
										<tr>
											<th class='name'>Name</th>
											<th class='desig'>Address</th>
											<th class='category'>Contact</th>
											<th class='category'>Delivery Status</th>
											<th class='category'>Date</th>
											<th class='category'>Action</th>
											
										</tr>
									</thead>
									<tbody>
									<%
                                                                        
            try{ 
            
            String cid="";
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            statement1=connection.createStatement();
            String sql ="Select * from tbl_order where delivered = 0 ";
             int status;
             String status1="";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                          cid = resultSet.getString("cid");
                           String sql1 = "select * from tbl_customer where cid="+cid;
                           resultSet1 = statement1.executeQuery(sql1);
                           resultSet1.next();
                        status =Integer.parseInt(resultSet.getString("delivered"));                                              
                             if(status==0)
                             {
                                 status1="Not Delivered";
                             }
                             else
                             {
                                 status1="Delivered";
                             }
                                                                        %>
                        
								
	
									
										<tr>
											<td class='name'><%=resultSet1.getString("cname") %></td>
											<td class='desig'><%=resultSet1.getString("caddr") %></td>
											<td class='category'><%=resultSet1.getString("ccont") %></td>
											<td class='category'><%=status1 %>
                                                                                        <% if(status == 0) 
                                                                                        { %>
                                                                                        <a href='deliveredServlet?oid=<%=resultSet.getString("oid") %>&cid=<%=cid%>' class="btn btn-primary">Yes Delivered</a></td>
                                                                                        <% } %>
											<td class='category'><%=resultSet.getString("date") %></td>
											<td><a href='vieworderproductlist.jsp?oid=<%=resultSet.getString("oid") %>' class="btn btn-primary">View Product List</a></td>
										
										</tr
                                         <% 
                                              
                                   
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            %>
									</tbody>
								</table>
								
							</div>
							<div class="span2">
						</div>
				
						
				
		<script type="text/javascript">
		 $("#linkdashboard").addClass('active');

		var _gaq = _gaq || [];
		_gaq.push(['_setAccount', 'UA-38620714-4']);
		_gaq.push(['_trackPageview']);

		(function() {
			var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
		})();
                
               

		</script>
	</body>

	
<!-- Mirrored from www.eakroko.de/flat/ by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:47:08 GMT -->
</html>

