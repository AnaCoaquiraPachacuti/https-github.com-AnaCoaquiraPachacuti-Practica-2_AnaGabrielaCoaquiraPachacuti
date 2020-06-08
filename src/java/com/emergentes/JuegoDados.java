
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "JuegoDados", urlPatterns = {"/JuegoDados"})
public class JuegoDados extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet juegoDados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet juego de Dados </h1>");
            out.println("<form action='' method='post'>");
            out.println("<br>jugador 1 : ");
            out.print("<input type='text' name='j1' requerid ><br><br>");
            out.println("<input type='submit' value='lanzar dados'>");
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
      int d1,d2;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet juego Dados </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> los numeros de tus dados es </h1>"); 
            int l=1 ,sum=0;
             String j1= request.getParameter("j1");

                      while(l==1){
                       d1=(int)(Math.random()*10);
                       d2=(int)(Math.random()*10); 
              
                           if(d1<=6 && d1!=0 && d2<=6 && d2!=0){
                           out.println("El jugador : "+ j1 +" <br><br>");
                            out.println("Primer dado es : "+d1+"<br>");
                            out.println("Segundo dado es  : "+d2+"<br>");
                            sum=d1+d2;
                            out.println("La sumatoria de los dados es : "+sum+"<br><br><br>");
                            l=0;
                            
                           }
                           else{
                              l=1;
                           }
                      }
                      out.println(sum);
                      if(sum ==7 || sum ==11){
                          out.println(" <h1>Felicidades gano el juego</h1>");
                          
                      }
                      else{
                       out.println(" <h1'>Perdio el juego </h1>");    
                      }
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
}

