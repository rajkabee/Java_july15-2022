package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "root", "root");
			System.out.println("Connected to the database!");
			
			Product p = new Product(1,"Home Theater", "SONY", true);
			String query = "update product set name=?, manufacturer=?, active=? where id=?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getManufacturer());
			pstm.setBoolean(3, p.isActive());
			pstm.setInt(4, p.getId());
			int i = pstm.executeUpdate();
			if(i==0) {
				System.out.println("Update failed!");
			}
			else {
				System.out.println("Data updated in the database!");
			}
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
