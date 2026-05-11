package com.controller;
import java.util.List;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestMVC extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   List<String> list = Arrays.asList("emp1","emp2");
   
   HttpSession session = request.getSession();
   session.setAttribute("data",list);
		
	RequestDispatcher requestDispatcher =	request.getRequestDispatcher("WEB-INF/View/readall.jsp");
	requestDispatcher.forward(request, response);
	
		
	}

}
