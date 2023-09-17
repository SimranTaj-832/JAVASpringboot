package com.p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		try {
			out.println("<html><body><br>");
			HttpSession session=request.getSession(false);
			ArrayList<Object> cart=(ArrayList<Object>)session.getAttribute("cart");
			for(int i=0;i<cart.size();i++) {
				out.println((i+1)+". "+cart.get(i)+"<br>");
			}
			String flag=request.getParameter("flag");
			if(flag.equals("y"))
				session.invalidate();
			out.println("<a href=index.html>Home</a>");
			out.println("</body></html>");
		}catch(Exception e) {
			out.println("<html><body><font color=red>Some invalid operation caused an exception to be raised</font>");
			out.println("<p>Exception generated:"+e.toString()+"</p></body></html>");}
		finally { out.close();}
	}


}
