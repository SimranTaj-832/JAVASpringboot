package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		String books[]=request.getParameterValues("book");
		for(int i=0;i<books.length;i++) {
			out.println((i+1)+". "+books[i]+"<br>");
		}
		out.println("<a href='book.html'>Add more</a>");

		/*String music[]=request.getParameterValues("music");
		for(int i=0;i<music.length;i++) {
			out.println((i+1)+". "+music[i]+"<br>");
			out.println("<a hrefa='music.html'>Add more</a></body></html>");
		}*/
	}

}
