/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Connectiondb;

/**
 *
 * @author isi
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String urlRetour="login.jsp";
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            String msg="";
            
            if((email!=null)&&(password!=null)){
                
                if((!email.equals("")||(!password.equals("")))){
                    PreparedStatement query = Connectiondb.getPs("select * from users where email = ? and pwd = ?");
                    try{
                    query.setString(1, email);
                    query.setString(2, password);
                    ResultSet rs = query.executeQuery();
                    if(rs.next()){
                        urlRetour="";
                        int id=rs.getInt("user_id");                       
                        HttpSession session = request.getSession(true);
                        session.setAttribute("id", id);
                        
                        
                        
                    }
                    else{
                      msg="user not found"; 
                      request.setAttribute("msg",msg);
                    }
                    }catch(SQLException ex ){
                        ex.printStackTrace();
                    }
                    
                    
                }
                else{
                    request.setAttribute("msg","please enter a valid email adress and password");
                }
            }
            request.getRequestDispatcher(urlRetour).forward(request,response);
    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
