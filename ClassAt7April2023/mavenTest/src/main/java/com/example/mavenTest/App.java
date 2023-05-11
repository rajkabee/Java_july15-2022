package com.example.mavenTest;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.concurrent.CancellationException;


public class App 
{
    public static void main( String[] args )
    {	
    try {
		connect();
	} catch (Exception e) {
		e.printStackTrace();
	}
    	System.out.println( "Hello World!" );
    }
    public static void connect() throws ClassNotFoundException, SQLException {
    	Class.forName("driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306");
        throw new CancellationException("Headless Exception");
    }
}
