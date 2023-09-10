package com.rajkabee.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user, pass);
		Course course = new Course(6,"Graphics Design","Photoshop, illustrator, inDesign, Figma",20000f);
		String query  = "update courses set name=?, description=?, cost=? where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, course.getName());
		pstm.setString(2, course.getDescription());
		pstm.setFloat(3, course.getPrice());
		pstm.setInt(4, course.getId());
		int i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Task Failed!");
		}
		else {
			System.out.println("Task Succeed!");
		}
		System.out.println("Hello");
	}
}
