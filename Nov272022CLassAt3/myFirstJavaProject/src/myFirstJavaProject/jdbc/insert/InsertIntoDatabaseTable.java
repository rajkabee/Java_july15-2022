package myFirstJavaProject.jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import myFirstJavaProject.jdbc.connection.User;

public class InsertIntoDatabaseTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		User user = new User(
					"Pushpa",
					"heroin",
					"user",
					true
				);
		String query = "insert into user (username, password, roles, active) values ('";
		query+= user.getUsername()+"','";
		query+= user.getPassword()+"','";
		query+= user.getRoles()+"',";
		query+= user.isActive()+")";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println(user.getUsername()+" is added to the database!");
		}
		else {
			System.out.println("Data could'nt be saved!");
		}
		stm.close();
		con.close();
	}
}
