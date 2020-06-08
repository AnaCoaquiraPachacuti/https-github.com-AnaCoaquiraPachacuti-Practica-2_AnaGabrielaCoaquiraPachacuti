
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CambioMoneda", urlPatterns = {"/CambioMoneda"})
public class CambioMoneda extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> CambioMoneda </title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<center>");
            out.println("<h1> Servlet CambioMoneda </h1> <br>");
            out.println("<form action='' method='post'>");
            out.println("Ingresar moneda en Bolivianos o Dolares : ");
            out.println("<input type='number' name='moneda' requerid><br><br>");
            out.println("cambio a : ");
            out.println("<select name='cambio'>");
            out.println("<option value=4 >Bolivianos</option>");
	    out.println("<option value=5 >Dolares</option>");	
            out.println("</select><br><br>");
            out.println("<input type='submit' value='cambiar de moneda'>");
            out.println("</form>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
         out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        int moneda= Integer.parseInt(request.getParameter("moneda"));
        int cambio = Integer.parseInt(request.getParameter("cambio"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
               
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CambioMoneda </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.print("<h1>  El cambio de moneda a ");

            if(cambio <= 4 ){
               out.println(" Dolares a Bolivianos </h1> ");
               out.println("Dinero ingresado en Dolares : "+moneda+"<br><br>");
               out.println("cambio de dinero a Bolivianos : "+(moneda*6.69));
            }
          
             if(cambio > 4 ){
               out.println(" Bolivianos a Dolares </h1>  ");
               out.println("Dinero ingresado en Bolivianos : "+moneda+"<br><br>");
               out.println("cambio de dinero a dolares : "+(moneda/6.96));
             }
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}


