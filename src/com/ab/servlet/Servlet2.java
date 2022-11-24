package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read and display request attribuet values:
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String s1 = (String) request.getAttribute("att1");
		//Read HttpSession
		HttpSession session = request.getSession();
		String s2 = (String) session.getAttribute("att2");
		
		pw.println("<h1 style='color:red; text-align:center'> attri value: " + s1 + "</h1>");
		pw.println("<h1 style='color:red; text-align:center'> Session value: " + s2 + "</h1>");
		
		pw.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
