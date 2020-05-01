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
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mohan
 */
public class deliveredServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","");  
            //here sonoo is database name, root is username and password  
           
            Statement stmt=con.createStatement();  
            
            String qry = "update tbl_order set delivered = '1' where cid="+request.getParameter("cid")+" and oid="+request.getParameter("oid");
           // out.print(qry);
            stmt.executeUpdate(qry);  
           
            out.print("<script>window.location='dashboardjsp.jsp'</script>");
            
                
               
            con.close();      
        } 
        
            catch(Exception e){ System.out.println(e);}  
        
    }
        
        


}
