package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.PerPojo;


@WebServlet("/PerS1")
public class PerS1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		PerPojo p=new PerPojo(pid,pname);
		p.addPer();
		RequestDispatcher rd=request.getRequestDispatcher("PerJ2.jsp");
		request.setAttribute("data", p.getData());
		rd.forward(request, response);
	}

}
