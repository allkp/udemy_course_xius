<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Coupon</title>
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
	<H1>Find Coupon</H1>
	<form action="coupons" method="post">
	<pre>
	Coupon Code : <input type="text" name="couponCode"/>
	<input type="hidden" name="action" value="find"/>
	<input type="submit" value="find" />
	</pre>
	</form>
	</div>
</html>