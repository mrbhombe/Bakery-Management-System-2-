<%-- 
    Document   : index
    Created on : 25 Apr, 2020, 2:41:13 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
	
	<title>Login</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- Bootstrap responsive -->
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
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
	<!-- Validation -->
	<script src="js/plugins/validation/jquery.validate.min.js"></script>
	<script src="js/plugins/validation/additional-methods.min.js"></script>
	<!-- icheck -->
	<script src="js/plugins/icheck/jquery.icheck.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/eakroko.js"></script>

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

<body class='login'>
	<div class="wrapper">
		<h1><a href="#"><img src="img/logo-big.png" alt="" class='retina-ready' width="59" height="49">My Bakery</a></h1>
	  <div class="login-body">
			<h2>SIGN IN</h2>
			<form  method='post' class='form-validate' id="test" action="loginServlet">
				<div class="control-group">
					<div class="email controls">
						<input type="text" name='uemail' placeholder="Username" class='input-block-level' >
					</div>
				</div>
				<div class="control-group">
					<div class="pw controls">
						<input type="password" name="upw" placeholder="Password" id="pass" class='input-block-level' >
						<input type="checkbox"  onClick="myfunc()">&nbsp;Show password
						
					</div>
				</div>
				
					
					<center><input type="submit" value="Sign me in" class='btn btn-primary' name="btnlogin"  ></center>
				
			</form>
			<script>
			function myfunc()
			{
			var x=document.getElementById("pass");
			if(x.type=="password")
			{
			   x.type="text";
			}
			else
			{
			   x.type="password";
			}
			}
			</script>
			
			<br/>
			<div class="forget">
				
			</div>
		</div>
	</div>
	<script type="text/javascript">

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


<!-- Mirrored from www.eakroko.de/flat/more-login.html by HTTrack Website Copier/3.x [XR&CO'2010], Fri, 24 Jan 2014 12:56:12 GMT -->
</html>
