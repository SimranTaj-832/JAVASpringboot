package com.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Multipli")
public class Multipli extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr= response.getWriter();
		int num=0; String s1=" ";
		s1=request.getParameter("num");
		num=Integer.parseInt(s1);
		pr.println("<html><body>");
		pr.println("<h1> Multiplication Table </h1>");
		for(int i=1;i<=10;i++) {
		pr.println("<p>"+num+" X "+i+" = "+(num*i)+" </p>");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	}}
