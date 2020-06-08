
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OperacionesAritmeticas", urlPatterns = {"/OperacionesAritmeticas"})
public class OperacionesAritmeticas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OperacionesAritmeticas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Operaciones Aritmeticas </h1>");
            out.println("<br><br>"); 
            out.println("<form action='' method='post'>");
            out.println(" Primer numero : ");
            out.println("<input type='number' name='num1' requerid>");
            out.println("<br><br>");
            out.println(" Segundo numero : ");
            out.println("<input type='number' name='num2' requerid>");
            out.println("<br><br>");
            out.println(" Operacion : ");
            out.println("<select name='operacion'>");
            out.println("<option value=1 >Suma</option>");
	    out.println("<option value=2 >Resta</option>");
            out.println("<option value=3 >Multiplicacion</option>");
	    out.println("<option value=4>Division</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type='submit' value='procesar'>");
            out.println("</form>");
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
        int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        int operacion = Integer.parseInt(request.getParameter("operacion"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> operacionesaritmeticas </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> La resulatdo de la </h1>");  
            
               switch(operacion){
                case 1 :
                  out.println("<h3> ( Suma )</h3>");
                  out.println("Primer numero : "+num1+"<br>");
                  out.println("Segundo numero : "+num2+"<br>");
                  out.println("resultado : "+(num1+num2)+"<br>");
                  break;
            
               case 2 :
                  out.println("<h3> ( Resta )</h3>");
                  out.println("Primer numero : "+num1+"<br>");
                  out.println("Segundo numero : "+num2+"<br>");
                  out.println("resultado : "+(num1-num2)+"<br>");
                  break;
                        
               case 3 :
                  out.println("<h3> ( Multiplicacion )</h3>");
                  out.println("Primer numero : "+num1+"<br>");
                  out.println("Segundo numero : "+num2+"<br>");
                  out.println("resultado : "+(num1*num2)+"<br>");
                  break;

               case 4 :
                  out.println("<h3> ( Division)</h3>");
                  out.println("Primer numero : "+num1+"<br>");
                  out.println("Segundo numero : "+num2+"<br>");
                  out.println("resultado : "+(num1/num2)+"<br>");
                  break;
            
               } 
               
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}

