package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PersonServelet")
public class PersonServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr= response.getWriter();
		String str=" "; int age=0; String s1=" ";
		str=request.getParameter("pname");
		s1=request.getParameter("page");
		age=Integer.parseInt(s1);
		pr.println("<html><body>");
		pr.println("<h1> Person Servelet </h1>");
		pr.println("<p>"+"Hi "+str+" !");
		pr.println("Your age is "+age+"</p>");
		pr.println("</body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
