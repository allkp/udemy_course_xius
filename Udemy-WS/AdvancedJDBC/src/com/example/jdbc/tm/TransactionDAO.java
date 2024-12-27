package com.example.jdbc.tm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAO {
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			Statement stmt = con.createStatement();
			
			con.setAutoCommit(false);
			stmt.executeUpdate("update account set balance = balance-5000 where acc_no=5");
			
			stmt.executeUpdate("update account set balance = balance+5000 where acc_no=6");
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.close();
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
