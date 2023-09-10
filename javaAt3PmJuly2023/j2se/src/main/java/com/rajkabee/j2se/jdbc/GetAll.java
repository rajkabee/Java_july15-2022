package com.rajkabee.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user, pass);
		String query  = "select * from courses ";
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Course> courses = new ArrayList<>();
		while(rs.next()) {
			Course course = new Course();
			course.setId(rs.getInt("id"));
			course.setName(rs.getString("name"));
			course.setDescription(rs.getString("description"));
			course.setPrice(rs.getFloat("cost"));
			courses.add(course);
		}
		
		courses.forEach(System.out::println);
	}
}
