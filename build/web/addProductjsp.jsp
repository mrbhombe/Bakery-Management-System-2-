<%-- 
    Document   : addProductjsp
    Created on : 25 Apr, 2020, 5:24:46 PM
    Author     : Mohan
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<!-- Apple devices fullscreen -->
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<!-- Apple devices fullscreen -->
	<meta names="apple-mobile-web-app-status-bar-style" content="black-translucent" />
	
	<title>Add Product</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- Bootstrap responsive -->
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
	<!-- jQuery UI -->
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery-ui.css">
	<link rel="stylesheet" href="css/plugins/jquery-ui/smoothness/jquery.ui.theme.css">
	<!-- Theme CSS -->
	<link rel="stylesheet" href="css/style.css">
	<!-- Color CSS -->
	<link rel="stylesheet" href="css/themes.css">


	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="validation/jquery.bvalidator.js"></script>
<script type="text/javascript">

</script>
<link href="validation/bvalidator.theme.gray2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"> var optionsGray2 = { classNamePrefix: 'bvalidator_gray2_', position: {x:'right', y:'center'}, offset: {x:15, y:0}, template: '<div class="{errMsgClass}"><div class="bvalidator_gray2_arrow"></div><div class="bvalidator_gray2_cont1">{message}</div></div>' }; $(document).ready(function () { $('#myproductform').bValidator(optionsGray2); }); </script>
	<!-- Nice Scroll -->
	<script src="js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
	<!-- imagesLoaded -->
	<script src="js/plugins/imagesLoaded/jquery.imagesloaded.min.js"></script>
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
	<!-- Bootbox -->
	<script src="js/plugins/bootbox/jquery.bootbox.js"></script>

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
         
	</div>

	<div class="container-fluid" id="content">
		
		<div id="main" style="margin:0px">
			<div class="container-fluid">
				<div class="page-header">
					<div class="pull-left">
						<h1>Add Product</h1>
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
                                                <li>	
                                                <a href="#">Add New</a>
							<i class="icon-angle-right"></i>
						</li>
					</ul>
					<div class="close-bread">
						<a href="#"><i class="icon-remove"></i></a>
					</div>
				</div>
				
				
				
				<div class="span2">
				</div>
				
				
				<div class="row-fluid">
					<div class="span8">
					
						<div class="box box-bordered box-color">
							<div class="box-title">
								<h3><i class="icon-th-list"></i>Add Product</h3>
								<a href="viewProductjsp.jsp" class="btn" style="float:right; margin-right:10px"><i class="icon-eye-open"></i> View All</a>
							</div>
							<div class="box-content nopadding">
				
								<form  method="post" action="insertProductServlet" class='form-horizontal form-bordered' enctype="multipart/form-data"  >
									
									
									<div class="control-group">
										<label for="textarea" class="control-label">Product Name</label>
										<div class="controls">
											<input type="text"  name='pname' placeholder="Product Name" id="textarea" rows="3" class="input-xlarge"  data-bvalidator="alpha,required" data-bvalidator-msg="Please Enter Product Name">
										</div>
									</div>
									
									
									<div class="control-group">
										<label for="textarea" class="control-label">Description</label>
										<div c-lass="controls">
											<textarea name='pdesc'  style="margin:15px" placeholder="Enter Description" id="textarea" rows="3" class="input-xlarge" data-bvalidator="required" data-bvalidator-msg="Please Enter Description"> </textarea>
										</div>
									</div>  
									
									<div class="control-group">
										<label for="textfield" class="control-label">Product Price</label>
										<div class="controls">
											<input type="number" name='pprice'  id="textfield" placeholder="Product Price" class="input-xlarge" data-bvalidator="number,required" data-bvalidator-msg="Please enter Price">
										</div>
									</div>
									
									<div class="control-group">
										<label for="textfield" class="control-label">Product Image</label>
										<div class="controls">
											
								<input type="file" name='pimage' multiple placeholder="product image"  class="input-xlarge" data-bvalidator="extension[jpg:png:jpeg],required" data-bvalidator-msg="Please select file of type .jpg, .png or .jpeg">
										</div>
									</div>
									
									<div class="control-group">
										<label for="textfield" class="control-label">Product Quantity</label>
										<div class="controls">
											<input type="number" name='pqty'  id="textfield" placeholder="Product Quantity" class="input-xlarge" data-bvalidator="number,required" data-bvalidator-msg="Please enter quantity" >
										</div>
									</div>
									
									
									<div class="form-actions">
										<input type="submit" class="btn btn-primary" value="Submit" name="submit"/>
										<a href="viewProductjsp.jsp" type="cancel" class="btn" >Cancel</a>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				
				<div class="span2">
				</div>
				
			</div>
		</div></div>
		<script type="text/javascript">
		 $("#linkproduct").addClass('active');

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

	
<!-- Mirrored from www.eakroko.de/flat/forms-basic.html by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:47:32 GMT -->
</html>

