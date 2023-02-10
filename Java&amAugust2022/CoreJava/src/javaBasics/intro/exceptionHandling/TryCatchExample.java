package javaBasics.intro.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchExample {
	
	public static void main(String[] args) {
		try {
			Connection con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/dursikshya", "root", "root");
		} catch (SQLException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is Finally Block...");
		}
	}
}
