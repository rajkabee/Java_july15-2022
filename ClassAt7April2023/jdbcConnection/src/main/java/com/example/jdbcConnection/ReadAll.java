package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadAll {
	public static void main(String[] args) {
		
		String query = "SELECT * FROM student";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		ResultSet rs;
		ArrayList<Student> students = new ArrayList<>();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstm = con.prepareStatement(query);
			rs = pstm.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setActive(rs.getBoolean("active"));
				students.add(st);
			}
			
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		if(students.size()>0) {
			students.forEach(System.out::println);
		}
		else {
			System.out.println("No data found!");
		}
		
	}
}
