/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carrollu.pperera.cp.ecomapp.controller;

import edu.carrollu.pperera.cp.ecomapp.model.Handbag;
import edu.carrollu.pperera.cp.ecomapp.model.HandbagService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CPere
 */
@WebServlet(name = "HandbagController", urlPatterns = {"/hbc"})
public class HandbagController extends HttpServlet {
    public static final String ACTION = "action";
    public static final String LIST_ACTION = "displayList";
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
        response.setContentType("text/html;charset=UTF-8");
        
          String destination = "/handbagList.jsp"; // default
       

        try {
            String action = request.getParameter(ACTION);
            HandbagService handbagService = new HandbagService();
            List<Handbag> handbagList = null;

            if (action.equalsIgnoreCase(LIST_ACTION)) {
              handbagList = handbagService.getHandbagList();
              request.setAttribute("handbagList", handbagList);
            } 
        } catch (Exception e) {
            destination = "/handbagList.jsp";
            request.setAttribute("errMessage", e.getMessage());
            }
            
       RequestDispatcher view
               = request.getRequestDispatcher(destination);
       view.forward(request, response);
        
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
