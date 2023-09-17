package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TrnSrv")
public class TrnSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int cid=Integer.parseInt(request.getParameter("cid"));
		int acno=Integer.parseInt(request.getParameter("acno"));
		//Banking bu=new Banking();
		//bu.getData(acno);
		RequestDispatcher rd=request.getRequestDispatcher("trns.jsp");
		request.setAttribute("data", Banking.getData(acno));
		rd.include(request, response);
	}

	
}
