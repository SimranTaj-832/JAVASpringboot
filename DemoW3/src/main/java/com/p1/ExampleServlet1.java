package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ExampleServlet1")
public class ExampleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr= response.getWriter();
		pr.println("<html><body>");
		pr.println("<h1> Example Servlet -1</h1>");
		pr.println("<p>"+"Welcome to World of Servelets"+"</p>");
		pr.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	

}
