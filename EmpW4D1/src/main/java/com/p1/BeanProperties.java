package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BeanProperties")
public class BeanProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		NameBean name=new NameBean("Marty","Hall");
		CompanyBean company=new CompanyBean("coreservlets.com","J2EE Training and Consulting");
		EmployeeBean employee=new EmployeeBean(name,company);
		RequestDispatcher dispatcher=request.getRequestDispatcher("beanpro.jsp");
		dispatcher.forward(request, response);
	
	}

	

}
