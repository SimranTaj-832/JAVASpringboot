package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cid=Integer.parseInt(request.getParameter("cid"));
		String pass=request.getParameter("pass");
		Customer cu=new Customer();
		cu.loginch(cid, pass);
		PrintWriter pw=response.getWriter();
		if(cu.flag==true) {
			pw.println("<html><h2 style='text-align:center'>Logged In Successfully!!!</h2><h1 style='text-align:center'>Welcome user no: "+cid+"</h1></html>");
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		request.setAttribute("data", Accounts.getData(cid));
		rd.include(request, response);
		cu.flag=false;
		}
		else {
			pw.println("<html><h4>" +"Invalid login"+"</h4></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			rd.include(request, response);
		}
	}

}
