package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.Employee;

@WebServlet("/EmpServlet2")
public class EmpServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Employee eobjop=null;
		eobjop=(Employee)request.getAttribute("empobj");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h2> Employee details are:  </h2>");
		pw.println("<p>"+eobjop.getId()+" "+eobjop.getEname()+" "+eobjop.getEsal()+"</p>");
		pw.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
