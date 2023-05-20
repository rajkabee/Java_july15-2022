package com.example.jdbcConnection.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDataAccessObject<T> implements DataAccessObject<T>{
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
	String username = "root";
	String password = "root";
	Connection con;
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con = DriverManager.getConnection(dbUrl, username, password);
	}
	
	@Override
	public void disconnect() throws ClassNotFoundException, SQLException {
		con.close();
	}
}
