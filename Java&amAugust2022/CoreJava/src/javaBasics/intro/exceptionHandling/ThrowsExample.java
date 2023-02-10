package javaBasics.intro.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowsExample {
	public static void main(String[] args) throws SQLException {
		connect();
	}

	private static void connect() throws SQLException {
		Connection con = DriverManager.getConnection("asdasdsad");
	}
}
