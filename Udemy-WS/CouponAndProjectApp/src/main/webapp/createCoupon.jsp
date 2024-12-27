<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Create Coupon </title>
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
	<H1>Create Coupon</H1>
	<form action="coupons" method="post">
	<pre>
	Coupon Code : <input type="text" name="couponCode"/>
	<br/>
	Discount : <input type="text" name="discount"/>
	<br/>
	Expiry Date : <input type="text" name="expiryDate"/>
	<br/>
	<input type="hidden" name="action" value="create"/>
	<br/>
	<input type="submit" value="SAVE" />
	</pre>
	</form>
	</div>
</body>
</html>