package com.example.coreJava.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDao<T> implements DAO<T> {
	String url = "jdbc:mysql://localhost:3306/dursikshya";
	String user = "root";
	String pass = "root";
	Connection con;
	@Override
	public void connect() throws SQLException {
		con = DriverManager.getConnection(url, user, pass);
	}

	@Override
	public void disconnect() throws SQLException {
		con.close();
	}

	

}
