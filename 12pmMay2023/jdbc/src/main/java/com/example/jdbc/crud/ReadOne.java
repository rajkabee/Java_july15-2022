package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOne {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select * from user where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id: ");
		pstm.setInt(1, new Scanner(System.in).nextInt());
		ResultSet rs = pstm.executeQuery();
		User user = new User();
		if(rs.next()) {
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setActive(rs.getBoolean("active"));
			System.out.println(user);
		}
		else {
			System.out.println("no such user found!");
		}
		
		pstm.close();
		con.close();
		
	}
}
