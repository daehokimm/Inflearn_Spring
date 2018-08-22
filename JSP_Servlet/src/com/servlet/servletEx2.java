package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletEx2
 */
public class servletEx2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		String uploadDir = getServletContext().getInitParameter("uploadDir");
		String testServerIP = getServletContext().getInitParameter("testServerIP");
		
		getServletContext().setAttribute("connectedIP", "12.45.56.78");
		
		PrintWriter out = response.getWriter();
		
		out.print("<p>adminId : "+adminId+"</p>");
		out.print("<p>adminPw : "+adminPw+"</p>");
		out.print("<p>uploadDir : "+uploadDir+"</p>");
		out.print("<p>testServerIP : "+testServerIP+"</p>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
