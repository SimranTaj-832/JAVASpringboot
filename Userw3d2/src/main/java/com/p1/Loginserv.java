package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginserv")
public class Loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		User u=new User();
		u.login(uname, pass);
		PrintWriter pw=response.getWriter();
		if(u.flag==true) {
			pw.println("<html><h3 style='text-align:center'>Logged In Successfully</h3></html>");
			//u.flag=false;
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.include(request, response);
		}
		else {
			pw.println("<html><h4>" +"Invalid login"+"</h4></html>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
}
