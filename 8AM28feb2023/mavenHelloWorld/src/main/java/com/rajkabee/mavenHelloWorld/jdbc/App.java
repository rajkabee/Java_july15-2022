package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "root", "root");
			System.out.println("Connected to the database!");
			Product p = new Product("drop table Product;", "Apple", true);
			String query = "insert into product (name, manufacturer, active) values ('"+p.getName()+"', '"+p.getManufacturer()+"', "+p.isActive()+")";
			Statement stm = con.createStatement();
			stm.executeUpdate(query);
			stm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}
