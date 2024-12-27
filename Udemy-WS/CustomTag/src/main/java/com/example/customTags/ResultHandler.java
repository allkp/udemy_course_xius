package com.example.customTags;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.HTML.Tag;

import jakarta.servlet.ServletRequest;

public class ResultHandler extends TagSupport{

	private static final long serialVersionUID = 1L;
	
	Connection con;
	PreparedStatement pstmt;
	
	public ResultHandler() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			 pstmt = con.prepareStatement("select * from user where email=?");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int doStartTag() throws JspException {
		ServletRequest request = pageContext.getRequest();
		String email = request.getParameter("email");
		
		try {
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			JspWriter out = pageContext.getOut();
			if(rs.next()) {
				out.print("User Details are : <br/> First Name : ");
				out.print(rs.getString(1));
				out.print("<br/> Last Name : ");
				out.print(rs.getString(2));
			}else {
				out.print("Invalid User Email Entered......");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return Tag.SKIP_BODY;
	}
	
	public void release() {
		try {
			con.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
