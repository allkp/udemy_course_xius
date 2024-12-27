<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
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
	<form action="j_security_check" method="post">
		User Name : <input name="j_username" /><br/>
		Password : <input type="password" name="j_password" /><br/>
		<input type="submit" value="SUBMIT" />
	</form>
</body>
</html>