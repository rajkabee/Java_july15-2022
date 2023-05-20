package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jamuntech", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println( "Hello World!" );
    }
}
