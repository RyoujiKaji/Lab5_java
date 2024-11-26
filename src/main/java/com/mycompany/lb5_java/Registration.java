/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.lb5_java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clients_processing.Client;
import clients_processing.Processing;
//import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
//import fileEditor.*;

/**
 *
 * @author Nadezhda_N
 */
@WebServlet(name = "Registration", urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

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
        response.setContentType("text/html;charset=windows-1251");
//        try (PrintWriter out = response.getWriter()) {
//           out.println(request.getParameter("bday"));
//        }

        Client client = new Client(
                request.getParameter("email"),
                request.getParameter("name"),
                request.getParameter("bday"),
                request.getParameter("password")
        );
//        try (PrintWriter out = response.getWriter()) {
//            out.println(request.getParameter("bday"));
//        }

        HttpSession session = request.getSession();

        //сделать с отправкой на фронт
        if (new Processing().process(client)) {
            //ServletContext servletContext=getServletContext();
            session.setAttribute("goodRegistration", "Регистрация прошла успешно");
            getServletContext().getRequestDispatcher("/index.jsp").
                    forward(request, response);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        } else {
            session.setAttribute("badRegistration", "Пользователь с такой почтой"
                    + " уже зарегистрирован");
            getServletContext().getRequestDispatcher("/registration.jsp").
                    forward(request, response);
            response.sendRedirect(request.getContextPath()+"/registration.jsp");
        }
//Проверка работы с JSON
//        try {
//            ClientsArr clientsArr = new ClientsArr();
//            clientsArr.add(client);
//            String str = new JSONWriterClients().write(clientsArr);
//            String filePath = getServletContext().getRealPath("/") + "clients.json";
//            new MyFileWriter().writeJSON(filePath, str);
//
//            clientsArr = new JSONParserClients().
//                    parse(new MyFileReader().readJSON(filePath));
//            try (PrintWriter out = response.getWriter()) {
//
//                out.println(clientsArr.getList().getFirst().getEmail());
//            }
//        } catch (Exception e) {
//            try (PrintWriter out = response.getWriter()) {
//
//                out.println(e.getMessage());
//            }
//        }
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
