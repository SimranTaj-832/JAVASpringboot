package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.Employee;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Employee eobj=new Employee();
		int i1=0; double d1=0.00;
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		i1=Integer.parseInt(request.getParameter("id"));
		eobj.setId(i1);
		eobj.setEname(request.getParameter("ename"));
		System.out.println(eobj.getEname());
		d1=Double.parseDouble(request.getParameter("esal"));
		eobj.setEsal(d1);
		pr.println("<html><body>");
		pr.println("<h1> Employee Details are </h1>");
		pr.println("<p>"+eobj.getId()+", "+eobj.getEname()+"</p>");
		pr.println("<p>"+"Salary is"+": "+eobj.getEsal()+"</p>");
		pr.println("</body></html>");

	}

}
