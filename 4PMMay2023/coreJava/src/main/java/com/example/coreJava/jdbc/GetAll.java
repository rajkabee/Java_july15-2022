package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAll {
	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		String query = "select * from product";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product pd = new Product();
			pd.setId(rs.getInt("id"));
			pd.setName(rs.getString("name"));
			pd.setPrice(rs.getFloat("price"));
			pd.setActive(rs.getBoolean("active"));
			//System.out.println(pd);
			products.add(pd);
		}
		if(products.size()>0) {
			products.forEach(System.out::println);
		}
		else {
			System.out.println("No products in the table!");
		}
		pstm.close();
		con.close();
	}
}
