package com.example.jdbc.batch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDAO {
	
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
				Statement stmt = con.createStatement();
				){
			stmt.addBatch("insert into account values(5, 'clinton', 'bill', 10000 )");
			stmt.addBatch("insert into account values(6, 'clinton', 'hillary', 20000 )");
			
			int[] result = stmt.executeBatch();
			
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
