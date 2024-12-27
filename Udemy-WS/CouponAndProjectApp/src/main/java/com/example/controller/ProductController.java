package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import com.example.dao.CouponDAO;
import com.example.dao.ProductDAO;
import com.example.model.Coupon;
import com.example.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class ProductController extends HttpServlet {
	CouponDAO couponDAO = new CouponDAO();
	ProductDAO productDAO = new ProductDAO();

	private static final long serialVersionUID = 1L;

	public ProductController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String couponCode = request.getParameter("couponCode");
		Coupon coupon = couponDAO.findByCode(couponCode);

		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));

		productDAO.save(product);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Product Created!!</b>");
		out.print("<br/><a href='/CouponAndProjectApp'>Home</a>'");
	}
}