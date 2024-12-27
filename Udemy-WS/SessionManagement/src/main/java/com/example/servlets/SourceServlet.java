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
 * Servlet implementation class SourceServlet
 */
//@WebServlet("/sourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) {
			System.out.println(i);
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		
		response.addCookie(new Cookie("security_token", "12345"));
		
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("user", userName);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String url = "targetServlet?sessionID=21082001";	//http://localhost:8080/SessionManagement/targetServlet?sessionID=21082001
		
		out.print("<a href='"+url+"'> Click here to get the User Name...</a>");
	}

}
