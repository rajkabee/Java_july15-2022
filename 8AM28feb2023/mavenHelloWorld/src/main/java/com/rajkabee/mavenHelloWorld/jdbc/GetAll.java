package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "root", "root");
			System.out.println("Connected to the database!");
			String query = "select * from product";
			PreparedStatement pstm = con.prepareStatement(query);
			ResultSet rs = pstm.executeQuery();
			ArrayList<Product> products = new ArrayList<Product>();
			
			
			while(rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setManufacturer(rs.getString("manufacturer"));
				p.setActive(rs.getBoolean("active"));
				products.add(p);
			}
			
			products.forEach(pd->{
				System.out.println(pd);
			});
			
			
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
