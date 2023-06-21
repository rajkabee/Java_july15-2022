package myFirstDynamicWebProject.ProductDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/dursikshya";
	String user = "root";
	String pass = "root";
	Connection con;
	@Override
	public void connect() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		System.out.println(url);
		con = DriverManager.getConnection(url, user, pass);
	}
	
	@Override
	public void disconnect() throws ClassNotFoundException, SQLException {
		con.close();
	}
}
