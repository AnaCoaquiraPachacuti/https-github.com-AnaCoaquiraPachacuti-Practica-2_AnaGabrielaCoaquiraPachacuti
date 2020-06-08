
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MatrizCaracol", urlPatterns = {"/MatrizCaracol"})
public class MatrizCaracol extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MatrizCaracol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Servlet Matriz Caracol </h1><br><br>");
            out.println("<form action='' method='post'>");
            out.println(" Tamaño de la matriz : ");
            out.println("<input type='number' name='tama' requerid>");
            out.println("<br><br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("<center>");
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
      
        int tama = Integer.parseInt(request.getParameter("tama"));
        
        int num=tama+1;
        int [][] M= new int [num][num];
  
        int c=1,inicio=0,aux=tama-1;
        while(c<=(tama*tama )){
            for(int i=inicio;i<=aux;i++){
                M[inicio][i]=c++;
            }
            for(int i=inicio+1;i<=aux;i++){
                M[i][aux]=c++;
            }
             for(int i=aux-1;i>=inicio;i--){
                M[aux][i]=c++;
            }
            for(int i=aux-1;i>=inicio+1;i--){
                M[i][inicio]=c++;
            }
            inicio=inicio+1;
            aux=aux-1;
        }
          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet matrizCaracol </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1> Matriz caracol</h1>");  
            out.println("<table border = 1 cellspacing='0px' cellpadding='12px' >");
	    for(int i=0;i<tama;i++){
	      out.println("<tr>");
			for(int j=0;j<tama;j++){
		 	  out.println("<td>"+M[i][j]+"</td>");
		 	}
	      out.println("</tr>");
		}
	    out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
    }
     
    }


 
