/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author isi
 */
@WebServlet(name = "enregistrementServlet", urlPatterns = {"/enregistrementServlet"})
public class enregistrementServlet extends HttpServlet {

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
            throws ServletException, IOException, ParseException, SQLException {
        
        String msg="user not added";
        String nom=request.getParameter("lname");
        String prenom=request.getParameter("fname");
        String email=request.getParameter("email");
        String date_naissance=request.getParameter("date_naissance");
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String date_creation = dateFormat.format(date);  
        
        String telephone=request.getParameter("telephone");
        String pwd=request.getParameter("pwd");
        String cpwd=request.getParameter("cpwd");
        if(pwd.equals(cpwd)){
            
        
        
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");  //charger le diver MariaDB
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String urlServeur="jdbc:mariadb://localhost:3306/travels";
        String identifiant = "root";
        String motDePasse = "abc123...";
        try {
            Connection connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);
            String query = "select * from users where email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email); 
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                msg="user already exists";
            }
            else {
            query = "insert into users(email,pwd,nom,prenom,date_naissance,date_creation,telephone) values (?,?,?,?,DATE ?,DATE ?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email); 
            preparedStatement.setString(2, pwd); 
            preparedStatement.setString(3, nom); 
            preparedStatement.setString(4, prenom); 
            preparedStatement.setString(5, date_naissance); 
            preparedStatement.setString(6, date_creation); 
            
            preparedStatement.setString(7, telephone);
            int rs = preparedStatement.executeUpdate();
            if (rs>0){
                 msg="user added successfully";
            }
            }
            
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            msg="password doesn't match";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet enregistrementServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+msg+"</h1>");
            out.println("<h1><a href='index.jsp'>home</a></h1>");
            out.println("</body>");
            out.println("</html>");
        }
          request.getRequestDispatcher("index.jsp").forward(request,response);
        
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(enregistrementServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
