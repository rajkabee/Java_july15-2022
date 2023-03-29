package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "root", "root");
			System.out.println("Connected to the database!");
			
			Product p = new Product("Macbook", "Apple", true);
			String query = "insert into product (name, manufacturer, active) values (?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getManufacturer());
			pstm.setBoolean(3, p.isActive());
			int i = pstm.executeUpdate();
			if(i==0) {
				System.out.println("insert failed!");
			}
			else {
				System.out.println("Data inserted to the database!");
			}
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
