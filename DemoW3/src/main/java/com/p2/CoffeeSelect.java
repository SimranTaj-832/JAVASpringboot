package com.p2;

import java.util.List;
import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p2.model.CoffeeExpert;

@WebServlet("/CoffeeSelect")
public class CoffeeSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String c=request.getParameter("type");
		CoffeeExpert ce=new CoffeeExpert();
		List result=ce.getTypes(c);
		request.setAttribute("styles", result);
		RequestDispatcher view=request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
		//doGet(request, response);
	}

}
