package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/readUserServlet")
public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
       
	public void init(ServletConfig config) {
		try {
			ServletContext context = config.getServletContext();
			Enumeration<String> parameterNames = context.getInitParameterNames();
			System.out.println("init() metod called..........");
			
			while(parameterNames.hasMoreElements()) {
				String element = parameterNames.nextElement();
				System.out.println("Context param name : " + element);
				System.out.println("Context param value : " + context.getInitParameter(element));
			}
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(context.getInitParameter("dbUrl"), context.getInitParameter("dbUser"), context.getInitParameter("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() method called........");

		try {
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery("select * from user");
			PrintWriter out = response.getWriter();
			
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>");
			out.print("Last Name ");
			out.print("</th>");
			out.print("<th>");
			out.print("First Name ");
			out.print("</th>");
			out.print("<th>");
			out.print("Email");
			out.print("</th>");
			out.print("<th>");
			out.print("Password ");
			out.print("</th>");
			out.print("</tr>");
			while(result.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(result.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString(4));
				out.print("</td>");
				out.print("</tr>");
			}
			out.print("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		};
	}

	public void destroy() {
		
		try {
			System.out.println("destroy() method ........");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
