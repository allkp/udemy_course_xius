package com.example.jdbc.batch.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDao {
	
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
				Statement stmt = con.createStatement();
				){
			ResultSet rset = stmt.executeQuery("select * from account");
			ResultSetMetaData rsmd = rset.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("Column Count : " + count);
			for(int i = 1; i <= count; i++) {
				System.out.print(rsmd.getColumnName(i) + " : ");
				System.out.println(rsmd.getColumnTypeName(i));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
