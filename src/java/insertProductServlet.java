/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
/**
 *
 * @author Mohan
 */

@MultipartConfig(maxFileSize = 16177215) // upload file's size up to 16MB
@WebServlet(name = "insertProductServlet",urlPatterns = {"/insertProductServlet"})
public class insertProductServlet extends HttpServlet {
private ProductAdd add;

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
        
    }

    @Override
    public void init() {
        add = new ProductAdd();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
      InputStream inputStream = null; 
      
String pname=request.getParameter("pname");
String pdesc=request.getParameter("pdesc");
String pprice=request.getParameter("pprice");
String pqty=request.getParameter("pqty");
String demo=request.getParameter("pimage");

String message = null;

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("pimage");
// sends the statement to the database server
        int row = add.uploadFile(pname, pqty, inputStream,pprice,pdesc);
        
         out.println("<script>alert('Done ! Product Added Successfully')</script>");
        out.print("<script>window.location='viewProductjsp.jsp'</script>");
        
//out.println("<script>alert('Done ! Product Added Successfully')</script>");
//out.print("<script>window.location='viewProductjsp.jsp'</script>");
 
   }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
