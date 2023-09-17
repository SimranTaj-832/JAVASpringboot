package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.bank;



@WebServlet("/BankS2")
public class BankS2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		bank objop=null;
		objop=(bank)request.getAttribute("bobj");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h2> Account details are:  </h2>");
		pw.println("<p><br/>Account number: "+objop.getAcno()+"<br/>Name: "+objop.getName()+"<br/>Account type: "+objop.getActype()+"<br/>Balance: "+objop.getBal()+"<br/></p>");
	}

	

}
