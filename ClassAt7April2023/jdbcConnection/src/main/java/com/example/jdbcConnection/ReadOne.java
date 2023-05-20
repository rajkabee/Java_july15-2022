package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOne {
	public static void main(String[] args) {
		int id;
		String name="";
		String email="";
		boolean active=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the Student: ");
		id = sc.nextInt();
		
		String query = "SELECT * FROM student WHERE id=?";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		ResultSet rs;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				id=rs.getInt("id");
				name = rs.getString("name");
				email = rs.getString("email");
				active = rs.getBoolean("active");
			}
			else {
				System.out.println("no data found!");
			}
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(id+". "+name+"\t"+email+"\t"+active);
		
	}
}
