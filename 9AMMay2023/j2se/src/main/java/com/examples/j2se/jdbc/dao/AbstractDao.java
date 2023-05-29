package com.examples.j2se.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DAO<T> {
	String url = "jdbc:mysql://localhost:3306/dursikshya";
	String username = "root";
	String password = "root";
	Connection con;
	@Override
	public void connect() throws SQLException {
		con = DriverManager.getConnection(url, username, password);
		
	}

	@Override
	public void disconnect() throws SQLException {
		con.close();
	}
	
}
