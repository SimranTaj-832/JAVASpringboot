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


@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		try {
			String[] music=request.getParameterValues("music");
			String[] book=request.getParameterValues("book");
			HttpSession session=request.getSession();
			
			ArrayList<Object> cart=(ArrayList<Object>)session.getAttribute("cart");
			if(cart==null)
				cart=new ArrayList<Object>();
				if(music!=null)
					for(int i=0;i<music.length;i++)
						cart.add(music[i]);
				if(book!=null)
					for(int i=0;i<book.length;i++)
						cart.add(book[i]);
			session.setAttribute("cart", cart);
//	out.println("Added to the cart<br>");
			out.println("<p>Added to the cart</p><br>");
			out.println("<p>"+session.getId()+"</p>");
			out.println("<html><body><a href='ShowServlet?flag=n'>Show Cart</a><br>");
			out.println("<a href='ShowServlet?flag=y'>Show and Invalidate Session</a></br>");
			
			out.println("<a href='book.html'>Book</a><br/>");
			out.println("<a href='music.html'>Music</a><br></body></html>");
		}catch(Exception e) {
			out.println("<html><body><font color=red>Some invalid operation caused an exception to be raised</font>");
			out.println("<p>Exception generated:"+e.toString()+"</p></body></html>");}
		finally { out.close();}
		}
	}

   
