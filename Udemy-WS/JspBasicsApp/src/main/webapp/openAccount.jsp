<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%!
    	Connection con;
    	PreparedStatement pstmt;
    	
    	public void jspInit(){
    		try{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
    			pstmt = con.prepareStatement("insert into account values(?, ?, ?, ?)");
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    	
    	public void jspDestroy(){
    		try{
    			con.close();
    			pstmt.close();
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    %>
    
    <%
    	
    	int accno = Integer.parseInt(request.getParameter("accno"));
    	String firstname = request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	int bal = Integer.parseInt(request.getParameter("bal"));

		pstmt.setInt(1, accno);
		pstmt.setString(3, firstname);
		pstmt.setString(2, lastname);
		pstmt.setInt(4, bal);
		
		int result = pstmt.executeUpdate();
    
    %>
    <% 
    	out.println(result > 0 ? "<h1>Account Successfully Created for " + firstname + " ....</h1>" : "<h1>Account Creation Failed for " + firstname + " .....</h1><br/><br/>");
    %>
    
    <%@ include file="openAccount.html" %>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<!--     <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Account</title>
</head>
<body>

</body>
</html> -->