package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WdServ")
public class WdServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int acno=Integer.parseInt(request.getParameter("acno"));
		int amt=Integer.parseInt(request.getParameter("amt"));
		Banking bu=new Banking();
		bu.Withdraw(acno, amt);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		//request.setAttribute("data", Accounts.getData(acno));
		rd.include(request, response);
	}
}
