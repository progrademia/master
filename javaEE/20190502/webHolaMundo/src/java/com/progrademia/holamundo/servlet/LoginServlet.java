/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progrademia.holamundo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author java
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/acceso"})
public class LoginServlet extends HttpServlet {
   private ArrayList<String> lista = new ArrayList();
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
        String nombreUsuario = "";
        HttpSession sesion = request.getSession();
        nombreUsuario = (String) sesion.getAttribute("nombre");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola " + nombreUsuario + "</h1>");
            Cookie[] galletas = request.getCookies();
            if(galletas!=null && galletas.length>0){
                out.println("Mis galletas");
                out.println("<ul>");
                for(Cookie galleta: galletas){
                   out.println("<li>");
                   out.println(galleta.getName());
                   out.println("=");
                   out.println(galleta.getValue());
                   out.println("</li>");
                }
                out.println("</ul>");                
                
            }
            for(String nombre:lista)
            {
                out.println(nombre);
            }    
            out.println("<br>");
            out.println("<ul>");                
            lista.forEach( 
              s -> out.println("<li>" + s + "</li>")            
            );
            out.println("</ul>");                
                    
            out.println("</body>");
            out.println("</html>");
        }
        
        
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Nombre: " + request.getParameter("nombre") + "</h1>");
            out.println("<h1>Password: " + request.getParameter("password") + "</h1>");
            out.println("</body>");
            out.println("</html>");
            lista.add(request.getParameter("nombre") );
            HttpSession sesion = request.getSession();
            sesion.setAttribute("nombre", request.getParameter("nombre") );
            sesion.setAttribute("password", request.getParameter("password")); 
            Cookie cookie = new Cookie("nombreCookie",request.getParameter("nombre")  );
            response.addCookie(cookie);
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
