<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum of Two Numbers</title>
<style>
        body, html {
            height: 100%;
            margin: 0;
            display: flex;
            justify-content: center; /* Horizontally centers the content */
            align-items: center; /* Vertically centers the content */
        }
 </style>
</head>
<body>
	<%
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
	%>
	<h1>Sum of <%= num1 %> and <%= num2 %> is : <%= num1+num2 %></h1>
</body>
</html>