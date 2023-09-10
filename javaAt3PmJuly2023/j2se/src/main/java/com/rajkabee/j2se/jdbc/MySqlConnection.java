package com.rajkabee.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user, pass);
		String query  = "insert into courses (name, description, cost) values('Data Science', 'Data Science with Python', 30000)";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==0) {
			System.out.println("Task Failed!");
		}
		else {
			System.out.println("Task Succeed!");
		}
		System.out.println("Hello");
	}
}
