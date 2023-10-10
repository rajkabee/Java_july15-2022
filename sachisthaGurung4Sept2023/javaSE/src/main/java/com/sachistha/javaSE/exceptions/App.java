package com.sachistha.javaSE.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		try {
			connect();
		} catch (SQLException e) {
			e.printStackTrace();
			//throw e;
			System.out.println("Unable to connect! restart and try again!");
		}
	}

	private static void connect() throws SQLException {
		String url="jdbc:mysql://localhost:3306/testdb";
		String user = "roots";
		String pass = "root";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("New Username: ");
			user = new Scanner(System.in).next();
			Connection con = DriverManager.getConnection(url, user, pass);
			
			
		}
		finally {
			System.out.println("Done!");
		}
	}
}
