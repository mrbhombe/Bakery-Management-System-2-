<%-- 
    Document   : headerjsp
    Created on : 25 Apr, 2020, 3:34:31 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container-fluid">
			<a href="#" id="brand">My Bakery</a>
			
			<ul class='main-nav'>
				<li id="linkdashboard">
					<a href="dashboardjsp.jsp">
						<span>Dashboard</span>
					</a>
				</li>
				
				<li id="linkproduct">
				<a href="#" data-toggle="dropdown" class='dropdown-toggle'>
						<span>Product</span>
						<span class="caret"></span>
				</a>
				<ul class="dropdown-menu">
						<li>
							<a href="viewProductjsp.jsp"> View Product</a>
							
						</li>	
						<li>
							<a href="addProductjsp.jsp"> Add Product</a>
							
						</li>	
						
			
									
								
				</ul>
				</li>
		
				
				
				<li id="linkorder">
				<a href="deliveredorderjsp.jsp" >
						<span>Order</span>
						
				</a>
				
				</li>
				
				
			
			
			</ul>
			<div class="user" >
				<ul class="icon-nav">
					<li class='dropdown'>
						
						<ul class="dropdown-menu pull-right message-ul">
							<li>
								<a href="#">
									<img src="img/demo/user-1.jpg" alt="">
									<div class="details">
										<div class="name"><s</div>
										<div class="message">
											Lorem ipsum Commodo quis nisi ...
										</div>
									</div>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="img/demo/user-2.jpg" alt="">
									<div class="details">
										<div class="name">John Doedoe</div>
										<div class="message">
											Ut ad laboris est anim ut ...
										</div>
									</div>
									<div class="count">
										<i class="icon-comment"></i>
										<span>3</span>
									</div>
								</a>
							</li>
							<li>
								<a href="#">
									<img src="img/demo/user-3.jpg" alt="">
									<div class="details">
										<div class="name">Bob Doe</div>
										<div class="message">
											Excepteur Duis magna dolor!
										</div>
									</div>
								</a>
							</li>
							<li>
								<a href="components-messages.html" class='more-messages'>Go to Message center <i class="icon-arrow-right"></i></a>
							</li>
						</ul>
					</li>
					<li class="dropdown sett">
						
						<ul class="dropdown-menu pull-right theme-settings">
							<li>
								<span>Layout-width</span>
								<div class="version-toggle">
									<a href="#" class='set-fixed'>Fixed</a>
									<a href="#" class="active set-fluid">Fluid</a>
								</div>
							</li>
							<li>
								<span>Topbar</span>
								<div class="topbar-toggle">
									<a href="#" class='set-topbar-fixed'>Fixed</a>
									<a href="#" class="active set-topbar-default">Default</a>
								</div>
							</li>
							<li>
								<span>Sidebar</span>
								<div class="sidebar-toggle">
									<a href="#" class='set-sidebar-fixed'>Fixed</a>
									<a href="#" class="active set-sidebar-default">Default</a>
								</div>
							</li>
						</ul>
					</li>
					<li class='dropdown colo'>
						
						<ul class="dropdown-menu pull-right theme-colors">
							<li class="subtitle">
								Predefined colors
							</li>
							<li>
								<span class='red'></span>
								<span class='orange'></span>
								<span class='green'></span>
								<span class="brown"></span>
								<span class="blue"></span>
								<span class='lime'></span>
								<span class="teal"></span>
								<span class="purple"></span>
								<span class="pink"></span>
								<span class="magenta"></span>
								<span class="grey"></span>
								<span class="darkblue"></span>
								<span class="lightred"></span>
								<span class="lightgrey"></span>
								<span class="satblue"></span>
								<span class="satgreen"></span>
							</li>
						</ul>
					</li>
					
				</ul>
                            
				<div class="dropdown">
					<a href="#" class='dropdown-toggle' data-toggle="dropdown"> <img src="img/demo/user-avatar.jpg" alt=""></a>
					<ul class="dropdown-menu pull-right">
						
						
						<li>
							<a href="logout.php">Sign out</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>