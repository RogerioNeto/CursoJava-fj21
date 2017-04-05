package br.com.caelum.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class aulaservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.service(request, response);
    	
    	PrintWriter out = response.getWriter();
    	
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<title>Primeira Servlet Curso de Java Yessssssss</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<h1>Oi mundo ServLet!</h1>");
    	out.println("</body>");
    	out.println("</html>");
    	
    }
    
}
