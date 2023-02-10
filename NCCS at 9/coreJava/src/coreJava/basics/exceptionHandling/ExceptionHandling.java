package coreJava.basics.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/dursikshya",
						"root",
						"'root"
					);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Try to solve the issue or find a alternate way!");
			
		}
		finally {
			System.out.println("Must do tasks here!");
		}
	}
}
