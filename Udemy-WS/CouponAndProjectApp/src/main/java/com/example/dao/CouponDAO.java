package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Coupon;
import com.example.utils.ConnectionUtil;

public class CouponDAO {
	
	public void save(Coupon coupon ) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into coupon (code,discount,exp_date) values(?,?,?)");
			statement.setString(1, coupon.getCode());
			statement.setBigDecimal(2, coupon.getDiscount());
			statement.setString(3, coupon.getExpiryDate());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Coupon findByCode(String code) {
		Coupon coupon = new Coupon();
		Connection connection = ConnectionUtil.getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement("select * from coupon where code=?");
			statement.setString(1, code);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				coupon.setId(resultSet.getInt(1));
				coupon.setCode(resultSet.getString(2));
				coupon.setDiscount(resultSet.getBigDecimal(3));
				coupon.setExpiryDate(resultSet.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coupon;
	}

}
