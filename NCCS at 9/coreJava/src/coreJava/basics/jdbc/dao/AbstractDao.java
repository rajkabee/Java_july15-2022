package coreJava.basics.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import coreJava.basics.OOP.concepts.abstraction.DataAccessObject;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/nccs";
	private String user = "root";
	private String pass = "root";
	Connection con;
	
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, pass);
		
	}
	@Override
	public void disconnect() throws SQLException {
		con.close();
		
	}
}
