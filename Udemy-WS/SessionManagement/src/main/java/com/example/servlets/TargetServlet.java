package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class TargetServlet
 */
//@WebServlet("/targetServlet")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) {
			System.out.println(i);
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		HttpSession session = request.getSession();
		String userName = (String)session.getAttribute("user");
		PrintWriter out = response.getWriter();
		out.print("<H1> User Name is : " + userName + "</H1>");
	}

	

}
