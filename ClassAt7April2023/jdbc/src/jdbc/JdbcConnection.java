package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(null);
	}
}
