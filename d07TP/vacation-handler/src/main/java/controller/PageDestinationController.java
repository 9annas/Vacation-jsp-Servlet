/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static javax.swing.text.html.CSS.getAttribute;
import model.Destination;
import manager.DestinationManager;

/**
 *
 * @author isi
 */
@WebServlet(name = "PageDestinationController", urlPatterns = {"/PageDestinationController"})
public class PageDestinationController extends HttpServlet {

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
        ArrayList<Destination> list = null;
        String categorie = request.getParameter("cat");
        String catPanier = request.getParameter("catPanier");
        String panier = request.getParameter("panier");
        if (categorie != null) {
            list = DestinationManager.getByCategorie(Integer.parseInt(categorie));
        }else if (panier != null) {
            HttpSession session = request.getSession(false);
            if (session == null) {
                // Not created yet. Now do so yourself.
                session = request.getSession(true);
                HashMap<Integer, Integer> monPanier = new HashMap<Integer, Integer>();
                monPanier.put(Integer.parseInt(catPanier),1);
                session.setAttribute("panier", monPanier);                
            } else if(session != null && session.getAttribute("panier") != null){
                HashMap<Integer, Integer> monPanier = new HashMap<Integer, Integer>();
                monPanier = (HashMap<Integer, Integer>)session.getAttribute("panier");
                monPanier.put(Integer.parseInt(catPanier),1);
                session.setAttribute("panier", monPanier);
            }else if (session != null && session.getAttribute("panier") == null) {
                HashMap<Integer, Integer> monPanier = new HashMap<Integer, Integer>();
                monPanier.put(Integer.parseInt(catPanier),1);
                session.setAttribute("panier", monPanier);
            }
            list = DestinationManager.getAll();
        }else{
            list = DestinationManager.getAll();
        }
        
        
        //test session panier
        /*            <%  for (Map.Entry mapentry : testpanier.entrySet()) {%>
                    <%= mapentry.getKey()%><%= mapentry.getValue()%>

            <%    }
            %>
        
        request.setAttribute("ListDestinations", list);
        RequestDispatcher chemin = request.getRequestDispatcher("destinations.jsp");
        chemin.forward(request, response);
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
