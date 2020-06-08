/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DesplegaInformacion", urlPatterns = {"/DesplegaInformacion"})
public class DesplegaInformacion extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> LeeIformacionGET</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Servlet que Lee Informacion mediante GET</h1>");
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            
            if(nombre != null || correo != null || telefono != null){
                  out.println("<h3> LA INFORMACION INGRESADA EN LA URL ES </h3> ");
                  out.println(" Nombre es : <strong>"+nombre+"</strong><br>");
                  out.println(" Correo es : <strong>"+correo+"</strong><br>");
                  out.println(" Telefono es : <strong>"+telefono+"</strong><br>");
            }
            else{
                  out.println("Introduzca los parametros en la URL");
            }
            out.println("</body>");
            out.println("</html>");
        }
        finally{
           out.close();
        }
    }
}

