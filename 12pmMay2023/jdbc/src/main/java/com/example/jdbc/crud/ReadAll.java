package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAll {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select * from user";
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<User> users = new ArrayList<User>();
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setActive(rs.getBoolean("active"));
			users.add(user);
		}
		if(users.size()==0){
			System.out.println("no user found!");
		}
		else {
			users.forEach(System.out::println);
		}
		
		pstm.close();
		con.close();
		
	}
}
