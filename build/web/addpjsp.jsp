<%-- 
    Document   : addpjsp
    Created on : 26 Apr, 2020, 2:37:15 PM
    Author     : Mohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
				<div class="row-fluid">
					<div class="span8">
					
						<div class="box box-bordered box-color">
							<div class="box-title">
								<h3><i class="icon-th-list"></i>Add Product</h3>
								<a href="viewProductjsp.jsp" class="btn" style="float:right; margin-right:10px"><i class="icon-eye-open"></i> View All</a>
							</div>
							<div class="box-content nopadding">
				
								<form  method="post" action="insertProductServlet" >
									
									
									<div class="control-group">
										<label for="textarea" class="control-label">Product Name</label>
										<div class="controls">
											<input type="text"  name='pname' placeholder="Product Name" id="textarea" rows="3" class="input-xlarge"  data-bvalidator="alpha,required" data-bvalidator-msg="Please Enter Product Name">
										</div>
									</div>
									
									
									<div class="control-group">
										<label for="textarea" class="control-label">Description</label>
										<div class="controls">
											<textarea name='pdesc'  placeholder="Enter Description" id="textarea" rows="3" class="input-xlarge" data-bvalidator="required" data-bvalidator-msg="Please Enter Description"> </textarea>
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
										
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				
            
    </body>
</html>
