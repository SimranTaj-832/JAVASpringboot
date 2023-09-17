package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdmnServ")
public class AdmnServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String pass=request.getParameter("pass");
		Admin au=new Admin();
		Admin.Admn(id, pass);
		PrintWriter pw=response.getWriter();
		if(au.flag==true) {
			pw.println("<html><h2 style='text-align:center'>Admin View!!!</h2><h1 style='text-align:center'>Welcome Admin</h1></html>");
		RequestDispatcher rd=request.getRequestDispatcher("admn.jsp");
		request.setAttribute("data1",Customer.Allcs());
		request.setAttribute("data2",Accounts.Allac());
		request.setAttribute("data3",Banking.Alltrn());
		request.setAttribute("data4",AcCtg.Allcs());
		rd.include(request, response);
		}
		else {
			pw.println("<html><h4>" +"Invalid login"+"</h4></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			rd.include(request, response);
		}
	}

}
