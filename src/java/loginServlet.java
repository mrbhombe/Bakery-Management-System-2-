/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mohan
 */
@WebServlet(name = "loginServlet",urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int i=0;
        String uname="",pass="";
        uname = request.getParameter("uemail");
        pass = request.getParameter("upw");
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            
            String qry = "select * from tbl_admin where admin_name = '"+uname+"' and admin_pwd = '"+pass+"'";
            //out.print(qry);
            ResultSet result = stmt.executeQuery(qry);  
            String id="";
            if(result.next())
            {
                id = result.getString("admin_id");
                    HttpSession login = request.getSession();
                   
                    login.setAttribute("uid", id);
                    login.setAttribute("uname", uname);
                    
                      out.print("<script>window.location='dashboardjsp.jsp'</script>");       
                      
                             
                      i=1;
                }
            else
            {
                  out.print("<script>alert('Sorry ! Invalid Email or Password')</script>");
                   out.print("<script>window.location='index.jsp'</script>");
            
            }
                
               
            con.close();      
        } 
        
            catch(Exception e){ System.out.println(e);}  
        
    }
        
        
    }

