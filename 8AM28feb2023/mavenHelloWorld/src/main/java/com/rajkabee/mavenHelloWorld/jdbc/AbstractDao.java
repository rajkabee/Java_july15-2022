package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String dbUrl;
	String dbUsername;
	String dbPassword;
	String driverClass;
	Connection con;
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		
			Class.forName(driverClass);
			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
	}
	
	@Override
	public void disconnect() throws SQLException {
	
			con.close();
		
	}
}
