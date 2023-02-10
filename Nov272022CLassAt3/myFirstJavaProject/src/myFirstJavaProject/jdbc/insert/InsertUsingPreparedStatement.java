package myFirstJavaProject.jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import myFirstJavaProject.jdbc.connection.User;

public class InsertUsingPreparedStatement {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String url="jdbc:mysql://localhost:3306/j2se";
			String username="root";
			String password="root";
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the database!");
			User user = new User(
						"Sangita",
						"Passcode",
						"manager",
						true
					);
			String query = "insert into user (username, password, roles, active) values (?,?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getPassword());
			pstm.setString(3, user.getRoles());
			pstm.setBoolean(4, user.isActive());
			int i = pstm.executeUpdate();
			if(i==1) {
				System.out.println(user.getUsername()+" is added to the database!");
			}
			else {
				System.out.println("Data could'nt be saved!");
			}
			pstm.close();
			con.close();
		}
	}
