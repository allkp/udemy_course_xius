package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUser
 */
//@WebServlet(urlPatterns = "/addServlet"
//, initParams = {
//		@WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost/mydb"),
//		@WebInitParam(name="dbUser", value = "root"),
//		@WebInitParam(name="dbPassword", value="root")
//})
//@WebServlet("/addServlet")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
       
	public void init(ServletConfig config) {
		try {
			ServletContext context = config.getServletContext();
			System.out.println("init() metod called..........");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_Name = request.getParameter("first_Name");
		String last_Name = request.getParameter("last_Name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Statement statement = con.createStatement();
			int result = statement.executeUpdate("insert into user values('" + first_Name + "','" + last_Name + "','" + email + "','" + password + "')");
			
			PrintWriter out = response.getWriter();
			if(result > 0) {
				out.println("<H1> USER CREATED SUCCESSFULLY......</h1>");
			}else {
				out.println("<H1> ERROR occured when Creating the USER......!!!</H1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
