package com.p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.p1.model.Employee;

@WebServlet("/EmpServlet1")
public class EmpServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	Employee eobj= new Employee();
        eobj.setId(Integer.parseInt(request.getParameter("eid")));
        eobj.setEname(request.getParameter("ename"));
        eobj.setEsal(Double.parseDouble(request.getParameter("esal")));
        request.setAttribute("empobj", eobj);
        RequestDispatcher rd= request.getRequestDispatcher("/EmpServlet2");
        rd.forward(request, response);
	}

}
