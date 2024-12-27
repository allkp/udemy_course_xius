<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
<style>
body, html {
	height: 100%;
	margin: 0;
	display: flex;
	justify-content: center; /* Horizontally centers the content */
	align-items: center; /* Vertically centers the content */
	text-align: center;
}
</style>
</head>
<body>
	<div>
	<H1>Create Product</H1>
	<form action="products" method="post">
	<pre>
	Name : <input type="text" name="name" /><br />
	Description : <input type="text" name="description" /><br />
	Price : <input type="text" name="price" /><br />
	Coupon Code : <input type="text" name="couponCode" /><br />
	<input type="submit" value="SAVE" />
	</pre>
	</form>
	</div>
</html>