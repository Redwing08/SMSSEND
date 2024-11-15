/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.registration.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.javaguides.registration.dao.employeedao;
import net.javaguides.registration.model.Employee;

/**
 *
 * @author Steve
 */

@WebServlet("/reg")
public class EmployeeServlet extends HttpServlet {

    
    
    private employeedao EmpDao = new employeedao();
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
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        RequestDispatcher dis = request.getRequestDispatcher("Web Pages/index.jsp");
        dis.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        
        
        
        Employee emp  = new Employee();
        emp.setName(name);
        emp.setEmail(email);
        emp.setCountry(country);
        
        
        
        try {
            EmpDao.registerEmployee(emp);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, "Cannot Put to the Database", ex);
        }

        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
