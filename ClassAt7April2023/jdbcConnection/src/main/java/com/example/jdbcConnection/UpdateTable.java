package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {
	public static void main(String[] args) {
		int id=13;
		String name = "Bipin Raut";
		String email = "bipin@gmail.com";
		boolean active = false;
		String query = "UPDATE student set name=?, email=?, active=? WHERE id=?";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		int i=0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setBoolean(3, active);
			pstm.setInt(4, id);
			i = pstm.executeUpdate();
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		if(i==0) {
			System.out.println("Update failed...");
		}
		else {
			System.out.println("Successfully Updated...");
		}
	}
}
