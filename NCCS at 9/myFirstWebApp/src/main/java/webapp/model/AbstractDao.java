package webapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "Jdbc:mysql://localhost:3306/jdbc";
	String dbUser = "root";
	String dbPass = "root";
	Connection con;
	@Override
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
	}
	@Override
	public void disconnect() throws SQLException {
		con.close();
	}
}
