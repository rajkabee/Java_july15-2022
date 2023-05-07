package javaSE.dursikshya.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statements {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/company";
		String username = "root";
		String password = "root";
		
		
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		if(con!=null) {
			System.out.println("Connected to the database!");
		}
		String query = "insert into employee (name, salary) values('Samjhana Tripathi', 34500)";
		Statement stm = con.createStatement();
		stm.executeUpdate(query);
		stm.close();
		con.close();
	}
}
