package com.example.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T,I> implements DAO<T, I>{
	String dbUrl = "jdbc:mysql://localhost:3306/testdb";
	String dbUser = "root";
	String dbPass = "root";
	Connection con;
	@Override
	public void connect() {
		try {
			con=DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void disconnect() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
