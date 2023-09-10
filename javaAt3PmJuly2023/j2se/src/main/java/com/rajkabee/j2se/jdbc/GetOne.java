package com.rajkabee.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetOne {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user, pass);
		String query  = "select * from courses where id=?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Course course = new Course();
		if(rs.next()) {
			course.setId(rs.getInt("id"));
			course.setName(rs.getString("name"));
			course.setDescription(rs.getString("description"));
			course.setPrice(rs.getFloat("cost"));
			System.out.println(course);
		}
		else {
			System.out.println("No such data!");
		}
	}
}
