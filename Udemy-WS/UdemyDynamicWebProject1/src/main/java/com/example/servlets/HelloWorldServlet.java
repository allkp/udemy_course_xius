package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Hello Servlets World....!!!</h1>");
		out.println("</body>");
		out.println("</html>");


	}

}
