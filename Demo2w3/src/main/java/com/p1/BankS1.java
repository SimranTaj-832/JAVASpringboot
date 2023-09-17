package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.bank;


@WebServlet("/BankS1")
public class BankS1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    		
    		bank obj= new bank();
            obj.setAcno(Integer.parseInt(request.getParameter("acno")));
            obj.setName(request.getParameter("name"));
            obj.setActype(request.getParameter("actype"));
            obj.setBal(Double.parseDouble(request.getParameter("bal")));
            request.setAttribute("bobj", obj);
            RequestDispatcher rd= request.getRequestDispatcher("/BankS2");
            rd.forward(request, response);
	}

}
