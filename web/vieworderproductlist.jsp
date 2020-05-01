<%-- 
    Document   : vieworderproductlist
    Created on : 25 Apr, 2020, 4:48:33 PM
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

	<title>Product</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- Bootstrap responsive -->
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
	<!-- jQuery UI -->
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery-ui.css">
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
	<!-- dataTables -->
	<link rel="stylesheet" href="css/plugins/datatable/TableTools.css">
	<!-- chosen -->
	<link rel="stylesheet" href="css/plugins/chosen/chosen.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="css/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="css/themes.css">

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	
	<!-- Nice Scroll -->
	<script src="js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
	<!-- imagesLoaded -->
	<script src="js/plugins/imagesLoaded/jquery.imagesloaded.min.js"></script>
	<!-- jQuery UI -->
	<script src="js/plugins/jquery-ui/jquery.ui.core.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.widget.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.mouse.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.resizable.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.sortable.min.js"></script>
	<script src="js/plugins/jquery-ui/jquery.ui.datepicker.min.js"></script>
	<!-- slimScroll -->
	<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Bootbox -->
	<script src="js/plugins/bootbox/jquery.bootbox.js"></script>
	<!-- dataTables -->
	<script src="js/plugins/datatable/jquery.dataTables.min.js"></script>
	<script src="js/plugins/datatable/TableTools.min.js"></script>
	<script src="js/plugins/datatable/ColReorderWithResize.js"></script>
	<script src="js/plugins/datatable/ColVis.min.js"></script>
	<script src="js/plugins/datatable/jquery.dataTables.columnFilter.js"></script>
	<script src="js/plugins/datatable/jquery.dataTables.grouping.js"></script>
	<!-- Chosen -->
	<script src="js/plugins/chosen/chosen.jquery.min.js"></script>

	<!-- Theme framework -->
	<script src="js/eakroko.min.js"></script>
	<!-- Theme scripts -->
	<script src="js/application.min.js"></script>
	<!-- Just for demonstration -->
	<script src="js/demonstration.min.js"></script>

	<!--[if lte IE 9]>
		<script src="js/plugins/placeholder/jquery.placeholder.min.js"></script>
		<script>
			$(document).ready(function() {
				$('input, textarea').placeholder();
			});
		</script>
	<![endif]-->
	
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
       int total=0;
       %>
	</div>
	<div class="container-fluid" id="content">
			
		<div id="main" style="margin:0px">
			<div class="container-fluid">
				<div class="page-header">
					<div class="pull-left">
						<h1>Product</h1>
					</div>
					<div class="pull-right">
						
						<ul class="stats">
							
							<li class='lightred'>
								<i class="icon-calendar"></i>
								<div class="details">
									<span class="big">February 22, 2013</span>
									<span>Wednesday, 13:56</span>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="breadcrumbs">
					<ul>
						<li>
							<a href="#">Product</a>
							<i class="icon-angle-right"></i>
						</li>
						<li>
							<a href="#">Product details</a>
							<i class="icon-angle-right"></i>
						</li>
						
					</ul>
				</div>
				<div class="row-fluid">
					<div class="span12">
						<div class="box box-color box-bordered">
							<div class="box-title">
								<h3>
									<i class="icon-table"></i>
									Product Details
								</h3>

							
							</div>
							<div class="box-content nopadding">
					
							
								<table class="table table-hover table-nomargin dataTable table-bordered" >
									<thead>
										<tr>
											
											<th class='name'>Name</th>
											<th class='price'>Price</th>
											<th class='qty'>Quantity</th>
											<th class='qty'>Total Price</th>
											</tr>
									</thead>
									<tbody>
									
									<%
                                                                            int price,qty;
                                                                        
            try{ 
            
            String oid="";
            oid = request.getParameter("oid");
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            statement1=connection.createStatement();
            String sql ="select * from tbl_product where pid in (select pid from tbl_order_list where oid = '"+oid+"')";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                           String sql1 = "select qty from tbl_order_list where oid = "+oid;
                           resultSet1 = statement1.executeQuery(sql1);
                           resultSet1.next();
                           
        %>								
									
										<tr>
											
											<td class='name'><%=resultSet.getString("pname") %></td>
											<td class='price'><%=resultSet.getString("pprice") %> </td>
											<td class='qty'><%=resultSet1.getString("qty") %></td>
                                                                                        <td class='price'><%=Integer.parseInt(resultSet1.getString("qty")) * Integer.parseInt(resultSet.getString("pprice"))  %>
											<%
                                                                                        total = total + Integer.parseInt(resultSet1.getString("qty")) * Integer.parseInt(resultSet.getString("pprice"));
                                                                                        
                                                                                        %>
                                                                                            
                                                                                            
											 </td>
											
											
										</tr>
										<% 
                                              
                                   
                            }

                            } catch (Exception e) {
                            e.printStackTrace();
                            }
                            %>
										<tr>
											<td class='qty'><b>Total Amount:</b></td>
											<td><b><%=total %></b></td>
										</tr>
                                                                                <tr>
											<td class='qty'><b>Delivery Charge:</b></td>
											<td><b>70</b></td>
										</tr>
                                                                                <tr>
											<td class='qty'><b>Amount to Pay:</b></td>
											<td><b><%=total+70 %></b></td>
										</tr>
									</tbody>
								</table>
								
							</div>
						</div>
					</div>
				</div>
				<div id="modal-3" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			
				
	<script type="text/javascript">
	 $("#linkproduct").addClass('active');
	  function ConfirmDelete(val)
		{ 
		   $("#txthfproductid").val(val); 
		 }


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


<!-- Mirrored from www.eakroko.de/flat/tables-dynamic.html by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:54:44 GMT -->
</html>