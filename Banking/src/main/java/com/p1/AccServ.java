package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AccServ")
public class AccServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid=Integer.parseInt(request.getParameter("cid"));
		String actyp=request.getParameter("actyp");
		int bal=Integer.parseInt(request.getParameter("bal"));
		String sts="Active";
		Accounts au=new Accounts();
		au.CreateAc(cid,actyp,bal);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		request.setAttribute("data", Accounts.getData(cid));
		rd.include(request, response);
	}

}
