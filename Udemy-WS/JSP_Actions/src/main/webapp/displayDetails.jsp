<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Details Page</title>
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
<jsp:useBean id="product" class="com.example.jsp.Product">
<jsp:setProperty name="product" property="*" />
</jsp:useBean>

Product Details :
<br> ID : <jsp:getProperty property="id" name="product"/>
<br> Name : <jsp:getProperty property="name" name="product"/>
<br> Description : <jsp:getProperty property="description" name="product"/>
<br> Price : <jsp:getProperty property="price" name="product"/>



</body>
</html>